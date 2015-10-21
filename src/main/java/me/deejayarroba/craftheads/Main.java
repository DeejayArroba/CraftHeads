package me.deejayarroba.craftheads;

import me.deejayarroba.craftheads.commands.CraftHeadsCommand;
import me.deejayarroba.craftheads.listeners.InvClickEvent;
import me.deejayarroba.craftheads.listeners.PlayerJoin;
import me.deejayarroba.craftheads.menu.Menu;
import me.deejayarroba.craftheads.menu.MenuManager;
import me.deejayarroba.craftheads.util.AbstractCommand;
import me.deejayarroba.craftheads.util.Metrics;
import me.deejayarroba.craftheads.util.Updater;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main extends JavaPlugin {

	public static boolean devBuild = false;
	public static JSONArray HEAD_CATEGORIES;

	@Override
	public void onEnable() {
		// Get the heads.json file
		JSONParser parser = new JSONParser();
		try {
			HEAD_CATEGORIES = (JSONArray) ((JSONObject) parser.parse(getTextResource("heads.json"))).get("Categories");
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		// Setup the configuration
		getConfig().addDefault("auto-update", true);
		getConfig().addDefault("update-check", true);
		getConfig().addDefault("metrics", true);
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();

		MenuManager.setup();

		// Register the events
		getServer().getPluginManager().registerEvents(new InvClickEvent(), this);
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

		// Register the command
		AbstractCommand craftHeadsCommand = new CraftHeadsCommand("craftheads", "/<command>", "The main CraftHeads command.");
		craftHeadsCommand.register();

		// This takes care of auto-updating and metrics
		if (!devBuild) {
			if (getConfig().getBoolean("metrics")) {
				try {
					Metrics metrics = new Metrics(this);
					metrics.start();
				} catch (IOException e) {
					System.out.println("Failed to send metrics data");
				}
			}

			if (getConfig().getBoolean("update-check")) {
				if (getConfig().getBoolean("auto-update")) {
					new Updater(this, 70538, this.getFile(), Updater.UpdateType.DEFAULT, true);
				} else {
					Updater updater = new Updater(this, 70538, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false);
					Updater.UpdateResult result = updater.getResult();
					if (result == Updater.UpdateResult.UPDATE_AVAILABLE) {
						getLogger().info("An update for CraftHeads is available");
					}
				}
			}
		}

	}

	@Override
	public void onDisable() {
		for(Player p : Bukkit.getOnlinePlayers()) {
			Inventory inv = p.getOpenInventory().getTopInventory();
			if(inv != null) {
				if(MenuManager.getMenu(inv) != null) {
					p.closeInventory();
				}
			}
		}
	}

	public File getPluginFile() {
		return getFile();
	}


}
