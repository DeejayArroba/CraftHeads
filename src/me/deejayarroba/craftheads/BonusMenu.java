package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BonusMenu {
	private String menuTitle = "Bonus heads";
	private Inventory menu;
	private MenuItemManager menuItemManager = new MenuItemManager();

	public BonusMenu() {
		menuItemManager.createMenuItem("Arrow Up", "MHF_ArrowUp", Material.ARROW, (short) 0);
		menuItemManager.createMenuItem("Arrow Down", "MHF_ArrowDown", Material.ARROW, (short) 0);
		menuItemManager.createMenuItem("Arrow Left", "MHF_ArrowLeft", Material.ARROW, (short) 0);
		menuItemManager.createMenuItem("Arrow Right", "MHF_ArrowRight", Material.ARROW, (short) 0);
		menuItemManager.createMenuItem("Exclamation", "MHF_Exclamation", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Question", "MHF_Question", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Trollface", "Jqar", Material.WEB, (short) 0);
		menuItemManager.createMenuItem("TV 1", "Cheapshot", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("TV 2", "nonesuchplace", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("TV 3", "uioz", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Aquarium", "Raider_X", Material.RAW_FISH, (short) 0);
		menuItemManager.createMenuItem("Mailbox", "BigG0628", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Bookpile", "Erixia", Material.BOOK, (short) 0);
		menuItemManager.createMenuItem("Soccer ball", "soccer299", Material.FIREWORK_CHARGE, (short) 0);
		menuItemManager.createMenuItem("Pokeball", "Chuzard", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Earth", "Coasted", Material.GRASS, (short) 0);
		menuItemManager.createMenuItem("Walrus", "Walrus", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Penguin", "Haribo98", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Can of soup", "FlabbenBaggen", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Taco", "TacoSauzee", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Bacon", "Owen0821", Material.GRILLED_PORK, (short) 0);
		menuItemManager.createMenuItem("Eagle", "Ximonic", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Toaster", "AcE_whatever", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Golden Clock", "backpack9898", Material.WATCH, (short) 0);
		menuItemManager.createMenuItem("Candy cane", "FennoBear", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Lava bucket", "PocketMines", Material.LAVA_BUCKET, (short) 0);
		menuItemManager.createMenuItem("Snow man", "Goodle", Material.SNOW_BLOCK, (short) 0);
		menuItemManager.createMenuItem("LOL", "elam123", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("White gift", "yawn1234", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Blue gift", "scratch24", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Red gift", "CruXXx", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Police lights", "coltfan98", Material.SKULL_ITEM, (short) 1);
		menuItemManager.createMenuItem("Owl", "Barnyard_Owl", Material.SKULL_ITEM, (short) 1);

		menu = Bukkit.createInventory(null, 36, menuTitle);
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
