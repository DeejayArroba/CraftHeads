package me.deejayarroba.craftheads;

import me.deejayarroba.craftheads.commands.CraftHeadsCommand;
import me.deejayarroba.craftheads.listeners.InvClickEvent;
import me.deejayarroba.craftheads.listeners.PlayerJoin;
import me.deejayarroba.craftheads.menu.Menu;
import me.deejayarroba.craftheads.menu.MenuManager;
import me.deejayarroba.craftheads.util.AbstractCommand;
import me.deejayarroba.craftheads.util.Metrics;
import me.deejayarroba.craftheads.util.Updater;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Main extends JavaPlugin {

	// Make this true, otherwise it might download a version of the plugin from bukkit.org when you run it
	public static boolean devBuild = false;

	public static JSONArray HEAD_CATEGORIES = new JSONArray();
	public static Economy economy = null;
	public static float defaultHeadPrice;
	public static Main instance;

	@Override
	public void onEnable() {

		instance = this;

		if(getConfig().getBoolean("economy"))
			setupEconomy();

		loadCategories();

		saveDefaultConfig();

		defaultHeadPrice = getConfig().getInt("default-price");

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

	private boolean setupEconomy() {
		if (getServer().getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
		if (rsp == null) {
			return false;
		}
		economy = rsp.getProvider();
		return economy != null;
	}

	private void loadCategories() {

		JSONParser parser = new JSONParser();

		JarFile jarfile;
		try {
			jarfile = new JarFile(getPluginFile());

			Enumeration<JarEntry> entries = jarfile.entries();
			while(entries.hasMoreElements()) {
				final String name = entries.nextElement().getName();
				if (name.startsWith("categories/") && !name.equals("categories/")) {
					saveResource(name, false);
				}
			}
			jarfile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (File file : getDataFolder().listFiles()) {
			if(file.isDirectory()) {
				if(file.getName().equals("categories")) {
					for (File categoryFile : file.listFiles()) {
						if(categoryFile.isFile()) {
							try {
								HEAD_CATEGORIES.add(parser.parse(new String(Files.readAllBytes(categoryFile.toPath()), StandardCharsets.UTF_8)));
							} catch (IOException | ParseException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}


}
