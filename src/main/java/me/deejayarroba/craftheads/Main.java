package me.deejayarroba.craftheads;

import me.deejayarroba.craftheads.listeners.ChatEvent;
import me.deejayarroba.craftheads.listeners.InvClickEvent;
import me.deejayarroba.craftheads.util.MessageManager;
import me.deejayarroba.craftheads.util.Metrics;
import me.deejayarroba.craftheads.util.Updater;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin implements Listener {

	static MessageManager msg = MessageManager.getInstance();

	@Override
	public void onEnable() {
		getConfig().addDefault("auto-update", true);
		getConfig().addDefault("update-check", true);
		getConfig().addDefault("metrics", true);
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		if(getConfig().getBoolean("update-check")) {
			if (getConfig().getBoolean("auto-update")) {
				Updater updater = new Updater(this, 70538, this.getFile(), Updater.UpdateType.DEFAULT, true);
			} else {
				Updater updater = new Updater(this, 70538, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false);
				Updater.UpdateResult result = updater.getResult();
				if (result == Updater.UpdateResult.UPDATE_AVAILABLE) {
					getLogger().info("An update for CraftHeads is available");
				}
			}
		}
		if(getConfig().getBoolean("metrics")) {
			try {
				Metrics metrics = new Metrics(this);
				metrics.start();
			} catch (IOException e) {
				System.out.println("Failed to send metrics data");
			}
		}
		getServer().getPluginManager().registerEvents(new InvClickEvent(), this);
		getServer().getPluginManager().registerEvents(new ChatEvent(), this);
		getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("craftheads") && sender.hasPermission("craftheads.use")) {
			if (sender instanceof Player) {
				Player s = (Player) sender;
				if (args.length > 0) {
					msg.bad(s, "You don't need any arguments!");
					return true;
				} else {
					// Open the menu here
					//s.openInventory(InvClickEvent.mainMenu.getInventory());
					return true;
				}
			} else {
				sender.sendMessage("You can only run this command as a player.");
				return true;
			}
		}
		return false;
	}

	public File getPluginFile() {
		return getFile();
	}


}