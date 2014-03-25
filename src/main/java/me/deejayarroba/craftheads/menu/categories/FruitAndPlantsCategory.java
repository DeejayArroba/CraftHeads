package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class FruitAndPlantsCategory extends Category {
	public FruitAndPlantsCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Orange", "hi1232", Material.WOOL, (short) 1);
		add("Lemon", "aesixx", Material.WOOL, (short) 5);
		add("Cherry", "TheEvilEnderman", Material.WOOL, (short) 14);
		add("Apple (1)", "MHF_Apple", Material.APPLE, (short) 0);
		add("Apple (2)", "KylexDavis", Material.APPLE, (short) 0);
		add("Strawberry", "captan_sparkles", Material.WOOL, (short) 14);
		add("Coconut", "KyleWDM", Material.WOOL, (short) 12);
		add("Melon (1)", "MHF_Melon", Material.MELON_BLOCK, (short) 0);
		add("Melon (2)", "PatrickAVG", Material.MELON_BLOCK, (short) 0);
		add("Pumpkin", "MHF_Pumpkin", Material.PUMPKIN, (short) 0);
		add("Jack o' lantern (1)", "Koebasti", Material.JACK_O_LANTERN, (short) 0);
		add("Jack o' lantern (2)", "PumpkinSh00t", Material.JACK_O_LANTERN, (short) 0);
		add("Happy pumpkin", "Lycanthh", Material.PUMPKIN, (short) 0);
		add("Cut citrus", "BalkondeurAlpha", Material.STAINED_CLAY, (short) 5);
		add("Sugar cane", "Sugar_Cane_", Material.SUGAR_CANE, (short) 0);
		add("Cactus", "MHF_Cactus", Material.CACTUS, (short) 0);
		add("Grapes", "yamichetan78", Material.WOOL, (short) 10);
		add("Red mushroom", "Peace_cloaked", Material.RED_MUSHROOM, (short) 0);
	}
}
