package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class BlocksMenu {

	public static String MenuTitle = "Block heads";
	public static Inventory menu = null;

	public static Map<String, String> headList = new HashMap<String, String>();

	public static void createHeads() {
		headList.clear();
		headList.put(ChatColor.AQUA + "Cactus", "MHF_Cactus");
		headList.put(ChatColor.AQUA + "Cake", "MHF_Cake");
		headList.put(ChatColor.AQUA + "Chest", "MHF_Chest");
		headList.put(ChatColor.AQUA + "Melon", "MHF_Melon");
		headList.put(ChatColor.AQUA + "Oak log", "MHF_OakLog");
		headList.put(ChatColor.AQUA + "Pumpkin", "MHF_Pumpkin");
		headList.put(ChatColor.AQUA + "TNT", "MHF_TNT");
		headList.put(ChatColor.AQUA + "TNT2", "MHF_TNT2");
		headList.put(ChatColor.AQUA + "Stone", "Robbydeezle");
		headList.put(ChatColor.AQUA + "Leaves", "rsfx");
		headList.put(ChatColor.AQUA + "Cobblestone", "klingon");
		headList.put(ChatColor.AQUA + "Mossy Cobble", "Khrenan");
		headList.put(ChatColor.AQUA + "Jukebox", "C418");
		headList.put(ChatColor.AQUA + "Sticky piston", "Panda4994");
		headList.put(ChatColor.AQUA + "Oak plank", "terryxu");
		headList.put(ChatColor.AQUA + "Piston", "JL2579");
		headList.put(ChatColor.AQUA + "Iron block", "metalhedd");
		headList.put(ChatColor.AQUA + "Emerald ore", "Tereneckla");
		headList.put(ChatColor.AQUA + "Redstone ore", "annayirb");
		headList.put(ChatColor.AQUA + "Gold block", "StackedGold");
		headList.put(ChatColor.AQUA + "Diamond ore", "akaBruce");
		headList.put(ChatColor.AQUA + "Diamond block", "Fyspyguy");
		headList.put(ChatColor.AQUA + "Redstone lamp", "AutoSoup");
		headList.put(ChatColor.AQUA + "Bookshelf", "BowAimbot");
		headList.put(ChatColor.AQUA + "Obsidian", "loiwiol");
		headList.put(ChatColor.AQUA + "Eye of ender", "Edna_I");
		headList.put(ChatColor.AQUA + "Sponge", "pomi44");
		headList.put(ChatColor.AQUA + "Dirt block", "zachman228");
		headList.put(ChatColor.AQUA + "Grass block", "107295");
		headList.put(ChatColor.AQUA + "Bedrock", "dylansams");
		headList.put(ChatColor.AQUA + "Sand", "rugofluk");
		headList.put(ChatColor.AQUA + "Crafting table", "Russellgoo97");
		headList.put(ChatColor.AQUA + "Redstone block", "AlexDr0ps");
		headList.put(ChatColor.AQUA + "Furnace", "NegativeZeroTV");
		headList.put(ChatColor.AQUA + "Command block", "monkey354");
		headList.put(ChatColor.AQUA + "Jungle log", "monkey354");
		headList.put(ChatColor.AQUA + "Red mushroom", "Peace_cloaked");
		headList.put(ChatColor.AQUA + "Soulsand", "Njham");
	}

	public static void createGUI() {
		createHeads();
		menu = Bukkit.createInventory(null, 45, MenuTitle);
		for(String key : headList.keySet()) {
			ItemStack headItem = new ItemStack(Material.SKULL_ITEM, 1);
			ItemMeta headMeta = headItem.getItemMeta();
			headMeta.setDisplayName(key);
			headItem.setItemMeta(headMeta);
			headItem.setDurability((short)3);
			menu.addItem(headItem);
		}
	}

}
