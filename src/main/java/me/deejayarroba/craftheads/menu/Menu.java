package me.deejayarroba.craftheads.menu;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private String name;
	private Inventory inventory;
	private int slotCount;
	private List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public Menu(String name, List<MenuItem> menuItems) {
		this.menuItems = menuItems;
		this.name = name;

		int itemCount = getMenuItems().size();
		int rest = itemCount % 9;
		if(rest == 0) {
			slotCount = itemCount;
		} else {
			slotCount = itemCount + (9 - rest);
		}

		inventory = Bukkit.createInventory(null, slotCount, name);
		for(MenuItem menuItem : getMenuItems()) {
			ItemStack itemStack = menuItem.getItemStack();
			inventory.addItem(itemStack);
		}
	}

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

	public Inventory getInventory() {
		return inventory;
	}

	public String getName() {
		return name;
	}

	public int getSlotCount() {
		return slotCount;
	}

}
