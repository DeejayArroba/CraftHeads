package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class StonesAndOresCategory extends Category {
	public StonesAndOresCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Quartz block", "bubbadawg01", Material.QUARTZ_BLOCK, (short) 0);
		add("Iron block", "metalhedd", Material.IRON_BLOCK, (short) 0);
		add("Gold block", "teachdaire", Material.GOLD_BLOCK, (short) 0);
		add("Diamond block", "Fyspyguy", Material.DIAMOND_BLOCK, (short) 0);
		add("Redstone ore", "annayirb", Material.REDSTONE_ORE, (short) 0);
		add("Diamond ore", "akaBruce", Material.DIAMOND_ORE, (short) 0);
		add("Emerald ore", "Tereneckla", Material.EMERALD_ORE, (short) 0);
		add("Stone", "Robbydeezle", Material.STONE, (short) 0);
		add("Stone brick", "Cakers", Material.SMOOTH_BRICK, (short) 0);
		add("Obsidian", "loiwiol", Material.OBSIDIAN, (short) 0);
		add("Bedrock", "dylansams", Material.BEDROCK, (short) 0);
		add("Cobblestone", "_Rience", Material.COBBLESTONE, (short) 0);
	}
}
