package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class NetherCategory extends Category {
	public NetherCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Netherrack", "Numba_one_Stunna", Material.NETHERRACK, (short) 0);
		add("Soulsand", "Njham", Material.SOUL_SAND, (short) 0);
		add("Glowstone", "samstine11", Material.GLOWSTONE, (short) 0);
		add("Netherbrick", "ingo897", Material.NETHER_BRICK, (short) 0);
	}
}
