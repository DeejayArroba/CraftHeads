package me.deejayarroba.craftheads.menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private String name;
	private Inventory inventory;
	private ItemStack icon;
	private List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public Menu(String name, Material material, short damage) {
		this.name = name;
		ItemStack itemStack = new ItemStack(material, 1, damage);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(name);
		itemStack.setItemMeta(itemMeta);
		this.icon = itemStack;

		setup();

		int slotCount;
		int itemCount = getMenuItems().size();
		int rest = itemCount % 9;
		if (rest == 0)
			slotCount = itemCount;
		else
			slotCount = itemCount + (9 - rest);

		inventory = Bukkit.createInventory(null, slotCount, name);

		for (MenuItem menuItem : menuItems) {
			inventory.addItem(menuItem.getItemStack());
		}
	}

	public void add(String name, Material material, short damage, int position, MenuItemAction action) {
		MenuItem menuItem = new MenuItem(name, material, damage, action);
		inventory.setItem(position, menuItem.getItemStack());
		menuItems.add(menuItem);
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setup() {

	}

	public Inventory getInventory() {
		return inventory;
	}

	public String getName() {
		return name;
	}

}
