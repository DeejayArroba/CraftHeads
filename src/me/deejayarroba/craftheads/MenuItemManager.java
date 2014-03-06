package me.deejayarroba.craftheads;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class MenuItemManager {

	private static List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public static MenuItem createMenuItem(String name, String headName, Material material, short itemStackDurability) {
		MenuItem menuItem = new MenuItem(ChatColor.AQUA + name, headName, material, itemStackDurability);
		menuItems.add(menuItem);
		return menuItem;
	}

}
