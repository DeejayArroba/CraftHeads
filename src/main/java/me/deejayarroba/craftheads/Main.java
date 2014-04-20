package me.deejayarroba.craftheads;

import me.deejayarroba.craftheads.commands.CraftHeadsCommand;
import me.deejayarroba.craftheads.listeners.ChatEvent;
import me.deejayarroba.craftheads.listeners.InvClickEvent;
import me.deejayarroba.craftheads.listeners.PlayerJoin;
import me.deejayarroba.craftheads.util.AbstractCommand;
import me.deejayarroba.craftheads.util.Metrics;
import me.deejayarroba.craftheads.util.Updater;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin {

	public static boolean devBuild = true;

	@Override
	public void onEnable() {
		getConfig().addDefault("auto-update", true);
		getConfig().addDefault("update-check", true);
		getConfig().addDefault("metrics", true);
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();

		getServer().getPluginManager().registerEvents(new InvClickEvent(), this);
		getServer().getPluginManager().registerEvents(new ChatEvent(), this);
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

		AbstractCommand craftHeadsCommand = new CraftHeadsCommand("craftheads", "/<command>", "The main CraftHeads command.");
		craftHeadsCommand.register();

		if (getConfig().getBoolean("metrics")) {
			try {
				Metrics metrics = new Metrics(this);
				metrics.start();
			} catch (IOException e) {
				System.out.println("Failed to send metrics data");
			}
		}

		if (!devBuild)
			if (getConfig().getBoolean("update-check")) {
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
	}

	public File getPluginFile() {
		return getFile();
	}


}
