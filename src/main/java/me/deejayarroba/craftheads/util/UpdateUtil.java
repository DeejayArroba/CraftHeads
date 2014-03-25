package me.deejayarroba.craftheads.util;

import me.deejayarroba.craftheads.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class UpdateUtil {

	Main plugin = (Main) Bukkit.getPluginManager().getPlugin("CraftHeads");
	MessageManager msg = MessageManager.getInstance();
	private static UpdateUtil instance;

	public void updateNotice(Player p) {
		if (plugin.getConfig().getBoolean("update-check"))
			if (!plugin.getConfig().getBoolean("auto-update"))
				if (p.hasPermission("craftheads.updater") || p.isOp()) {
					Updater updater = new Updater(plugin, 70538, plugin.getPluginFile(), Updater.UpdateType.NO_DOWNLOAD, false);
					Updater.UpdateResult result = updater.getResult();
					if (result == Updater.UpdateResult.UPDATE_AVAILABLE)
						msg.info(p, "An update is available for CraftHeads. Get it here: " + updater.getLatestFileLink());

				}
	}

	public static UpdateUtil getInstance() {
		return instance;
	}

}