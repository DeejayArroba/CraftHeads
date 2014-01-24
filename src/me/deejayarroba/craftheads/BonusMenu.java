package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class BonusMenu {
	public static String MenuTitle = "Bonus heads";
	public static Inventory menu = null;

	public static Map<String, String> headList = new HashMap<String, String>();

	public static void createHeads() {
		headList.clear();
		headList.put(ChatColor.AQUA + "Arrow Up", "MHF_ArrowUp");
		headList.put(ChatColor.AQUA + "Arrow Down", "MHF_ArrowDown");
		headList.put(ChatColor.AQUA + "Arrow Left", "MHF_ArrowLeft");
		headList.put(ChatColor.AQUA + "Arrow Right", "MHF_ArrowRight");
		headList.put(ChatColor.AQUA + "Exclamation", "MHF_Exclamation");
		headList.put(ChatColor.AQUA + "Question", "MHF_Question");
		headList.put(ChatColor.AQUA + "Trollface", "Jqar");
		headList.put(ChatColor.AQUA + "TV 1", "Cheapshot");
		headList.put(ChatColor.AQUA + "TV 2", "nonesuchplace");
		headList.put(ChatColor.AQUA + "TV 3", "uioz");
		headList.put(ChatColor.AQUA + "Aquarium", "Raider_X");
		headList.put(ChatColor.AQUA + "Camera", "hayw1re0130");
		headList.put(ChatColor.AQUA + "Mailbox", "BigG0628");
		headList.put(ChatColor.AQUA + "Hamburger", "burai564");
		headList.put(ChatColor.AQUA + "Bookpile", "Erixia");
		headList.put(ChatColor.AQUA + "Soccer ball", "soccer299");
		headList.put(ChatColor.AQUA + "Pokeball", "Chuzard");
		headList.put(ChatColor.AQUA + "Earth", "Coasted");
		headList.put(ChatColor.AQUA + "Walrus", "Walrus");
		headList.put(ChatColor.AQUA + "Penguin", "Haribo98");
		headList.put(ChatColor.AQUA + "Can of soup", "FlabbenBaggen");
		headList.put(ChatColor.AQUA + "Taco", "TacoSauzee");
		headList.put(ChatColor.AQUA + "Bacon", "Owen0821");
		headList.put(ChatColor.AQUA + "Eagle", "Ximonic");
		headList.put(ChatColor.AQUA + "Toaster", "AcE_whatever");
		headList.put(ChatColor.AQUA + "Golden Clock", "backpack9898");
		headList.put(ChatColor.AQUA + "Candy cane", "FennoBear");
		headList.put(ChatColor.AQUA + "Lava bucket", "PocketMines");
		headList.put(ChatColor.AQUA + "Snow man", "Goodle");
		headList.put(ChatColor.AQUA + "LOL", "elam123");
		headList.put(ChatColor.AQUA + "White gift", "yawn1234");
		headList.put(ChatColor.AQUA + "Blue gift", "scratch24");
		headList.put(ChatColor.AQUA + "Red gift", "CruXXx");
		headList.put(ChatColor.AQUA + "Police lights", "coltfan98");
		headList.put(ChatColor.AQUA + "Owl", "Barnyard_Owl");
}

	public static void createGUI() {
		createHeads();
		menu = Bukkit.createInventory(null, 36, MenuTitle);
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
