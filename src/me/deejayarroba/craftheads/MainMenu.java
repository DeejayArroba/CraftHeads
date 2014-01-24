package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainMenu {

	public static String MenuTitle = "CraftHeads Menu";
	public static Inventory menu = null;

	public static void createGUI() {

		menu = Bukkit.createInventory(null, 9, MenuTitle); // (owner, size (int), name)

		ItemStack humanHead = new ItemStack(Material.SKULL_ITEM, 1);
		ItemMeta hhMeta = humanHead.getItemMeta();
		hhMeta.setDisplayName(ChatColor.AQUA + "Get your own head!");
		humanHead.setDurability((short)3);
		humanHead.setItemMeta(hhMeta);

		ItemStack cake = new ItemStack(Material.CAKE, 1);
		ItemMeta cakeMeta = cake.getItemMeta();
		cakeMeta.setDisplayName(ChatColor.AQUA + "Extra heads");
		cake.setItemMeta(cakeMeta);

		ItemStack apple = new ItemStack(Material.GOLDEN_APPLE, 1);
		ItemMeta appleMeta = apple.getItemMeta();
		appleMeta.setDisplayName(ChatColor.AQUA + "Get someone else's head");
		apple.setItemMeta(appleMeta);

		menu.addItem(humanHead);
		menu.addItem(cake);
		menu.addItem(apple);
	}

}
