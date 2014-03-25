package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class WoodCategory extends Category {
	public WoodCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Oak log", "MHF_OakLog", Material.LOG, (short) 0);
		add("Spruce log", "Benlisted", Material.LOG, (short) 1);
		add("Dark oak log", "bendablob2", Material.LOG_2, (short) 1);
		add("Jungle log", "Thypthon", Material.LOG, (short) 3);
		add("Mossy log", "Conan420", Material.LOG, (short) 0);
		add("Leaves (1)", "rsfx", Material.LEAVES, (short) 0);
		add("Leaves (2)", "bmpeti", Material.LEAVES, (short) 0);
		add("Leaves (3)", "AlphaPieter", Material.LEAVES, (short) 0);
		add("Dark leaves", "half_bit", Material.LEAVES, (short) 1);
		add("Birch Leaves", "kc33", Material.LEAVES, (short) 2);
		add("Wooden planks", "guung", Material.WOOD, (short) 0);
		add("Bookshelf", "BowAimbot", Material.BOOKSHELF, (short) 0);
	}
}
