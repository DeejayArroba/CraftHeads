package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ExtraHeads {

	private String menuTitle = "Extra heads";
	private Inventory menu;
	private MenuItemManager menuItemManager = new MenuItemManager();

	public ExtraHeads() {
		menuItemManager.createMenuItem("Block heads", null, Material.GRASS, (short) 0);
		menuItemManager.createMenuItem("Mob heads", null, Material.BOW, (short) 0);
		menuItemManager.createMenuItem("Bonus heads", null, Material.TNT, (short) 0);

		menu = Bukkit.createInventory(null, 9, menuTitle);
		for(MenuItem menuItem : menuItemManager.getMenuItems()) {
			ItemStack itemStack = menuItem.getItemStack();
			menu.addItem(itemStack);
		}
	}

	public Inventory getMenu() {
		return menu;
	}

	public String getMenuTitle() {
		return menuTitle;
	}

	public MenuItemManager getManager() {
		return menuItemManager;
	}
}
