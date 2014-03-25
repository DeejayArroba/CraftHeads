package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class MinecraftItemsCategory extends Category {
	public MinecraftItemsCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Crafting Table", "craftingtable", Material.WORKBENCH, (short) 0);
		add("Chest", "MHF_Chest", Material.CHEST, (short) 0);
		add("Enderchest", "_Brennian", Material.ENDER_CHEST, (short) 0);
		add("Furnace", "NegativeZeroTV", Material.FURNACE, (short) 0);
		add("Hay Bale", "Bendablob", Material.HAY_BLOCK, (short) 0);
		add("Cake", "MHF_Cake", Material.CAKE_BLOCK, (short) 0);
		add("Sideways cake", "Cakeman2014", Material.CAKE_BLOCK, (short) 0);
		add("Jukebox", "C418", Material.JUKEBOX, (short) 0);
		add("Noteblock", "PixelJuke", Material.NOTE_BLOCK, (short) 0);
		add("Eye of ender", "Edna_1", Material.EYE_OF_ENDER, (short) 0);
		add("Water bucket", "TagStarDude", Material.WATER_BUCKET, (short) 0);
		add("Lava bucket", "PocketMines", Material.LAVA_BUCKET, (short) 0);
		add("Milk bucket", "Cxomtdoh", Material.MILK_BUCKET, (short) 0);
		add("Beacon", "elyk0956", Material.BEACON, (short) 0);
		add("Mushroom stew", "Tumbolisu", Material.MUSHROOM_SOUP, (short) 0);
	}
}
