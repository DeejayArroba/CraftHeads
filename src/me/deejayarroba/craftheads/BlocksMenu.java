package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BlocksMenu {

	private String menuTitle = "Block heads";
	private Inventory menu;
	private MenuItemManager menuItemManager = new MenuItemManager();

	public BlocksMenu() {
		menuItemManager.createMenuItem("Cactus", "MHF_Cactus", Material.CACTUS, (short) 0);
		menuItemManager.createMenuItem("Cake", "MHF_Cake", Material.CAKE_BLOCK, (short) 0);
		menuItemManager.createMenuItem("Chest", "MHF_Chest", Material.CHEST, (short) 0);
		menuItemManager.createMenuItem("Melon", "MHF_Melon", Material.MELON_BLOCK, (short) 0);
		menuItemManager.createMenuItem("Oak log", "MHF_OakLog", Material.LOG, (short) 0);
		menuItemManager.createMenuItem("Pumpkin", "MHF_Pumpkin", Material.PUMPKIN, (short) 0);
		menuItemManager.createMenuItem("TNT", "MHF_TNT", Material.TNT, (short) 0);
		menuItemManager.createMenuItem("TNT2", "MHF_TNT2", Material.TNT, (short) 0);
		menuItemManager.createMenuItem("Stone", "Robbydeezle", Material.STONE, (short) 0);
		menuItemManager.createMenuItem("Leaves", "rsfx", Material.LEAVES, (short) 0);
		menuItemManager.createMenuItem("Cobblestone", "klingon", Material.COBBLESTONE, (short) 0);
		menuItemManager.createMenuItem("Mossy Cobble", "Khrenan", Material.MOSSY_COBBLESTONE, (short) 0);
		menuItemManager.createMenuItem("Jukebox", "C418", Material.JUKEBOX, (short) 0);
		menuItemManager.createMenuItem("Sticky piston", "Panda4994", Material.PISTON_STICKY_BASE, (short) 0);
		menuItemManager.createMenuItem("Piston", "JL2579", Material.PISTON_BASE, (short) 0);
		menuItemManager.createMenuItem("Oak plank", "terryxu", Material.WOOD, (short) 0);
		menuItemManager.createMenuItem("Iron block", "metalhedd", Material.IRON_BLOCK, (short) 0);
		menuItemManager.createMenuItem("Emerald ore", "Tereneckla", Material.EMERALD_ORE, (short) 0);
		menuItemManager.createMenuItem("Redstone ore", "annayirb", Material.REDSTONE_ORE, (short) 0);
		menuItemManager.createMenuItem("Gold block", "StackedGold", Material.GOLD_BLOCK, (short) 0);
		menuItemManager.createMenuItem("Diamond ore", "akaBruce", Material.DIAMOND_ORE, (short) 0);
		menuItemManager.createMenuItem("Diamond block", "Fyspyguy", Material.DIAMOND_BLOCK, (short) 0);
		menuItemManager.createMenuItem("Redstone lamp", "AutoSoup", Material.REDSTONE_LAMP_ON, (short) 0);
		menuItemManager.createMenuItem("Bookshelf", "BowAimbot", Material.BOOKSHELF, (short) 0);
		menuItemManager.createMenuItem("Obsidian", "loiwiol", Material.OBSIDIAN, (short) 0);
		menuItemManager.createMenuItem("Eye of ender", "Edna_I", Material.EYE_OF_ENDER, (short) 0);
		menuItemManager.createMenuItem("Sponge", "pomi44", Material.SPONGE, (short) 0);
		menuItemManager.createMenuItem("Dirt block", "zachman228", Material.DIRT, (short) 0);
		menuItemManager.createMenuItem("Grass block", "107295", Material.GRASS, (short) 0);
		menuItemManager.createMenuItem("Bedrock", "dylansams", Material.BEDROCK, (short) 0);
		menuItemManager.createMenuItem("Sand", "rugofluk", Material.SAND, (short) 0);
		menuItemManager.createMenuItem("Furnace", "NegativeZeroTV", Material.BURNING_FURNACE, (short) 0);
		menuItemManager.createMenuItem("Command block", "monkey354", Material.COMMAND, (short) 0);
		menuItemManager.createMenuItem("Red mushroom", "Peace_cloaked", Material.HUGE_MUSHROOM_2, (short) 21);
		menuItemManager.createMenuItem("Soulsand", "Njham", Material.SOUL_SAND, (short) 0);

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
