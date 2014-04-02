package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class ChristmasCategory extends Category {
	public ChristmasCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Snowman (1)", "dad12", Material.SNOW_BLOCK, (short) 0);
		add("Snowman (2)", "GLaDOS", Material.SNOW_BLOCK, (short) 0);
		add("Snow Creeper", "rexery76", Material.SKULL_ITEM, (short) 4);
		add("Present (1)", "CruXXx", Material.CHEST, (short) 0);
		add("Present (2)", "snipper4561", Material.CHEST, (short) 0);
		add("Present (3)", "yawn1234", Material.CHEST, (short) 0);
		add("Present (4)", "scratch24", Material.CHEST, (short) 0);
		add("Present (5)", "I_Xenon_I", Material.CHEST, (short) 0);
		add("Christmas star", "Improv_Peanut", Material.NETHER_STAR, (short) 0);
		add("Candy cane", "FennoBear", Material.SUGAR, (short) 0);
	}
}
