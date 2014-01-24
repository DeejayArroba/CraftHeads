package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MobMenu {

	private String menuTitle = "Mob heads";
	private Inventory menu;
	private MenuItemManager menuItemManager = new MenuItemManager();

	public MobMenu() {
		menuItemManager.createMenuItem("Blaze", "MHF_Blaze", Material.MONSTER_EGG, (short) 61);
		menuItemManager.createMenuItem("Cave Spider", "MHF_CaveSpider", Material.MONSTER_EGG, (short) 59);
		menuItemManager.createMenuItem("Chicken", "MHF_Chicken", Material.MONSTER_EGG, (short) 93);
		menuItemManager.createMenuItem("Cow", "MHF_Cow", Material.MONSTER_EGG, (short) 92);
		menuItemManager.createMenuItem("Enderman", "MHF_Enderman", Material.MONSTER_EGG, (short) 58);
		menuItemManager.createMenuItem("Ghast", "MHF_Ghast", Material.MONSTER_EGG, (short) 56);
		menuItemManager.createMenuItem("Magma Cube", "MHF_LavaSlime", Material.MONSTER_EGG, (short) 62);
		menuItemManager.createMenuItem("Mooshroom", "MHF_MushroomCow", Material.MONSTER_EGG, (short) 96);
		menuItemManager.createMenuItem("Ocelot", "MHF_Ocelot", Material.MONSTER_EGG, (short) 98);
		menuItemManager.createMenuItem("Pig", "MHF_Pig", Material.MONSTER_EGG, (short) 90);
		menuItemManager.createMenuItem("Zombie Pigman", "MHF_PigZombie", Material.MONSTER_EGG, (short) 57);
		menuItemManager.createMenuItem("Sheep", "MHF_Sheep", Material.MONSTER_EGG, (short) 91);
		menuItemManager.createMenuItem("Slime", "MHF_Slime", Material.MONSTER_EGG, (short) 55);
		menuItemManager.createMenuItem("Spider", "MHF_Spider", Material.MONSTER_EGG, (short) 52);
		menuItemManager.createMenuItem("Squid", "MHF_Squid", Material.MONSTER_EGG, (short) 94);
		menuItemManager.createMenuItem("Squid 2", "Comcastt", Material.MONSTER_EGG, (short) 94);
		menuItemManager.createMenuItem("Villager", "MHF_Villager", Material.MONSTER_EGG, (short) 120);
		menuItemManager.createMenuItem("Iron golem", "MHF_Golem", Material.IRON_INGOT, (short) 0);
		menuItemManager.createMenuItem("Wither", "MHF_Wither", Material.NETHER_STAR, (short) 0);
		menuItemManager.createMenuItem("Herobrine", "MHF_Herobrine", Material.DIAMOND_SWORD, (short) 0);

		menu = Bukkit.createInventory(null, 27, menuTitle);
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
