package me.deejayarroba.craftheads.util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadUtil {

	private static HeadUtil instance = new HeadUtil();

	public void giveHead(Player p, String skullOwner, String itemName) {
		ItemStack skullItem = new ItemStack(Material.SKULL_ITEM);
		skullItem.setDurability((short) 3);
		SkullMeta skullMeta = (SkullMeta) skullItem.getItemMeta();
		skullMeta.setOwner(skullOwner);
		skullMeta.setDisplayName(ChatColor.GREEN + "Head: " + ChatColor.AQUA + itemName);
		skullItem.setItemMeta(skullMeta);
		p.getInventory().addItem(skullItem);
	}

	public static HeadUtil getInstance() {
		return instance;
	}

}
