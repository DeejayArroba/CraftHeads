package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class OtherBlocksCategory extends Category {
	public OtherBlocksCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Grass block", "MoulaTime", Material.GRASS, (short) 0);
		add("Snowy grass", "Creeper999", Material.SNOW_BLOCK, (short) 0);
		add("Podzol", "PhasePvP", Material.DIRT, (short) 2);
		add("Dirt", "zachman228", Material.DIRT, (short) 0);
		add("Sand", "rugofluk", Material.SAND, (short) 0);
		add("Sandstone", "Praxis8", Material.SANDSTONE, (short) 0);
		add("Red sand", "OmniSulfur", Material.SAND, (short) 1);
		add("Old gravel", "nafi", Material.GRAVEL, (short) 0);
		add("Gravel", "Emilka45", Material.GRAVEL, (short) 0);
		add("Lava", "Spe", Material.LAVA_BUCKET, (short) 0);
		add("Water (1)", "emack0714", Material.WATER_BUCKET, (short) 0);
		add("Water (2)", "H3XR", Material.WATER_BUCKET, (short) 0);
		add("Ice block", "icytouch", Material.ICE, (short) 0);
		add("Sponge", "pomi44", Material.SPONGE, (short) 0);
		add("Clay block", "jkoberna", Material.CLAY, (short) 0);
		add("Brick (1)", "BrickInTheHead", Material.CLAY_BRICK, (short) 0);
		add("Brick (2)", "ThaBrick", Material.CLAY_BRICK, (short) 0);
		add("Slime block", "Trauwka", Material.SLIME_BALL, (short) 0);
	}
}
