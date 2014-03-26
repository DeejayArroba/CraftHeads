package me.deejayarroba.craftheads.menu;

import me.deejayarroba.craftheads.menu.menus.ExtraHeadsMenu;
import me.deejayarroba.craftheads.menu.menus.MainMenu;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {

	private static MenuManager instance = new MenuManager();

	private List<Menu> menus = new ArrayList<Menu>();

	public MenuManager() {
		setup();
	}

	public static MenuManager getInstance() {
		return instance;
	}

	private void add(Menu menu) {
		menus.add(menu);
	}

	private void setup() {
		add(new MainMenu("Main menu", Material.WORKBENCH, (short) 0));
		add(new ExtraHeadsMenu("Extra heads", Material.CAKE, (short) 0));
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public Menu getMenu(String name) {
		for(Menu menu : getMenus()) {
			if(menu.getName().equals(name))
				return menu;
		}
		return null;
	}

}
