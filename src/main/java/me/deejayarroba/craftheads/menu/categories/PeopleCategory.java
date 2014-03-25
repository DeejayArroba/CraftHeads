package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class PeopleCategory extends Category {
	public PeopleCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Troll", "Trollface20", Material.WEB, (short) 0);
		add("Santa (1)", "Santa314", Material.WOOL, (short) 14);
		add("Santa (2)", "Kazzykid", Material.WOOL, (short) 14);
		add("Robot Steve", "RobotHole", Material.SKULL_ITEM, (short) 3);
		add("C-3PO", "C3PO15", Material.GOLD_BLOCK, (short) 0);
		add("R2D2", "R2D2", Material.WOOL, (short) 11);
		add("Storm trooper", "xmrw", Material.WOOL, (short) 0);
		add("Surgeon", "Marshton", Material.WOOL, (short) 9);
		add("Jake (Adventure Time)", "gresh123", Material.WOOL, (short) 1);
	}
}
