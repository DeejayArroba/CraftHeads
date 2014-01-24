package me.deejayarroba.craftheads;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class MenuItemManager {

	private List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public MenuItem getMenuItem(String menuItemName) {
		for(MenuItem menuItem : menuItems) {
			if(menuItem.getName().equals(menuItemName)) {
				return menuItem;
			}
		}
		return null;
	}

	public void createMenuItem(String name, String headName, Material material, short itemStackDurability) {
		MenuItem menuItem = new MenuItem(ChatColor.AQUA + name, headName, material, itemStackDurability);
		menuItems.add(menuItem);
	}

}
