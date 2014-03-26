package me.deejayarroba.craftheads.menu.menus;

import me.deejayarroba.craftheads.menu.Category;
import me.deejayarroba.craftheads.menu.CategoryManager;
import me.deejayarroba.craftheads.menu.Menu;
import me.deejayarroba.craftheads.menu.MenuItemAction;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class ExtraHeadsMenu extends Menu {


	public ExtraHeadsMenu(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		CategoryManager categoryManager = CategoryManager.getInstance();
		int posCount = 0;
		for (final Category category : categoryManager.getCategories()) {
			add(category.getName(), category.getIcon().getType(), category.getIcon().getDurability(), posCount, new MenuItemAction() {
				@Override
				public void click(Player p) {
					p.openInventory(category.getInventory());
				}
			});
			posCount++;
		}
	}

}
