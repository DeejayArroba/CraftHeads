package me.deejayarroba.craftheads.menu;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

	protected String name;
	protected Inventory inventory;
	protected List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public Menu() {

	}

	// Places the MenuItems in the inventory
	// Must be called in the constructor
	protected void placeItems() {
		int slotCount;
		int itemCount = getMenuItems().size();
		int rest = itemCount % 9;
		if (rest == 0)
			slotCount = itemCount;
		else
			slotCount = itemCount + (9 - rest);

		inventory = Bukkit.createInventory(null, slotCount, name);

		for (int i = 0; i < menuItems.size(); i++) {
			MenuItem menuItem = menuItems.get(i);
			inventory.setItem(i, menuItem.getItemStack());
		}
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public MenuItem getMenuItem(ItemStack itemStack) {
		for (MenuItem menuItem : menuItems) {
			if (menuItem.getItemStack().equals(itemStack)) {
				return menuItem;
			}
		}
		return null;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public String getName() {
		return name;
	}

}