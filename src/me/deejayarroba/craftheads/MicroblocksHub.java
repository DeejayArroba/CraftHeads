package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MicroblocksHub {

	public static String MenuTitle = "Extra Heads";
	public static Inventory microblockMenu = null;

	public static void createGUI() {
		microblockMenu = Bukkit.createInventory(null, 9, MenuTitle);

		ItemStack blocks = new ItemStack(Material.GRASS, 1);
		ItemMeta blocksMeta = blocks.getItemMeta();
		blocksMeta.setDisplayName(ChatColor.AQUA + "Block heads");
		blocks.setItemMeta(blocksMeta);

		ItemStack mob = new ItemStack(Material.BOW, 1);
		ItemMeta mobMeta = mob.getItemMeta();
		mobMeta.setDisplayName(ChatColor.AQUA + "Mob heads");
		mob.setItemMeta(mobMeta);

		ItemStack bonus = new ItemStack(Material.TNT, 1);
		ItemMeta bonusMeta = bonus.getItemMeta();
		bonusMeta.setDisplayName(ChatColor.AQUA + "Bonus heads");
		bonus.setItemMeta(bonusMeta);

		microblockMenu.addItem(blocks);
		microblockMenu.addItem(mob);
		microblockMenu.addItem(bonus);
	}
}
