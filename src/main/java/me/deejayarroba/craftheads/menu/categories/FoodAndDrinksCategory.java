package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class FoodAndDrinksCategory extends Category {
	public FoodAndDrinksCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Medieval mug", "Fire_Feather", Material.BOWL, (short) 0);
		add("Waffles with syrup", "HW9000", Material.PUMPKIN_PIE, (short) 0);
		add("Taco (1)", "Crunchy_Taco34", Material.PUMPKIN_PIE, (short) 0);
		add("Taco (2)", "TacoSauzee", Material.PUMPKIN_PIE, (short) 0);
		add("Burger (1)", "food", Material.COOKED_BEEF, (short) 0);
		add("Burger (2)", "glorycraft", Material.COOKED_BEEF, (short) 0);
		add("Burger (3)", "simbasthebestbud", Material.COOKED_BEEF, (short) 0);
		add("Burger (4)", "01theG", Material.COOKED_BEEF, (short) 0);
		add("Muffin", "ChocolateMuffin", Material.CAKE, (short) 0);
		add("Cookie", "QuadratCookie", Material.COOKIE, (short) 0);
		add("Popcorn", "ZachWarnerHD", Material.STAINED_CLAY, (short) 0);
		add("Can of soup", "FlabbenBaggen", Material.MUSHROOM_SOUP, (short) 0);
		add("Bacon (1)", "Baconator52", Material.PORK, (short) 0);
		add("Bacon (2)", "Owen0821", Material.PORK, (short) 0);
		add("Potato", "CraftPotato13", Material.POTATO, (short) 0);
		add("Glass of Cola", "Yeah_1234", Material.GLASS_BOTTLE, (short) 0);
		add("Rice ball", "Benvuolo", Material.WOOL, (short) 0);
		add("Ice cream sandwich ", "DutchGuard", Material.STAINED_CLAY, (short) 0);
		add("Pie (1)", "hardyx", Material.PUMPKIN_PIE, (short) 0);
		add("Pie (2)", "Sam27572", Material.PUMPKIN_PIE, (short) 0);
		add("Cherry Pie", "oliver2104", Material.PUMPKIN_PIE, (short) 0);
		add("Coffee", "rayquaza89", Material.MILK_BUCKET, (short) 0);
	}
}
