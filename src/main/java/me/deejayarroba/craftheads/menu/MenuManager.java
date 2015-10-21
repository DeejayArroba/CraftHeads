package me.deejayarroba.craftheads.menu;

import me.deejayarroba.craftheads.Main;
import me.deejayarroba.craftheads.menu.menutypes.CategoriesMenu;
import me.deejayarroba.craftheads.menu.menutypes.CategoryMenu;
import me.deejayarroba.craftheads.menu.menutypes.MainMenu;
import me.deejayarroba.craftheads.skulls.Skulls;
import me.deejayarroba.craftheads.util.Items;
import me.deejayarroba.craftheads.util.MessageManager;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MenuManager {

	private static MessageManager msg = MessageManager.getInstance();

	private static List<Menu> menus = new ArrayList<>();
	public static MainMenu mainMenu;
	public static CategoriesMenu categoriesMenu;
	public static ArrayList<CategoryMenu> categoryMenus = new ArrayList<>();

	// Shortcut to add a menu
	private static void add(Menu menu) {
		menus.add(menu);
	}

	// Initialization: create all the menus here
	public static void setup() {
		mainMenu = new MainMenu();
		add(mainMenu);
		categoriesMenu = new CategoriesMenu();
		add(categoriesMenu);


		Main.HEAD_CATEGORIES.forEach(new Consumer() {
			@Override
			public void accept(Object o) {
				JSONObject category = (JSONObject) o;
				CategoryMenu categoryMenu = new CategoryMenu(category);
				categoryMenus.add(categoryMenu);
				add(categoryMenu);
			}
		});
	}

	// Get all the menus
	public static List<Menu> getMenus() {
		return menus;
	}

	// Get a menu from its name
	public static Menu getMenu(String name) {
		for(Menu menu : getMenus()) {
			if(menu.getName().equals(name))
				return menu;
		}
		return null;
	}

	// Get a menu from its inventory
	public static Menu getMenu(Inventory inv) {
		for(Menu menu : getMenus()) {
			if(menu.getInventory().equals(inv))
				return menu;
		}
		return null;
	}

}