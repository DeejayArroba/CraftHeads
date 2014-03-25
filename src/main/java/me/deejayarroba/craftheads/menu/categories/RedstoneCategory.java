package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class RedstoneCategory extends Category {
	public RedstoneCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Redstone block (1)", "LordStrike72", Material.REDSTONE_BLOCK, (short) 0);
		add("Redstone block (2)", "C_Cman", Material.REDSTONE_BLOCK, (short) 0);
		add("Piston", "JL2579", Material.PISTON_BASE, (short) 0);
		add("Sticky piston", "Panda4994", Material.PISTON_STICKY_BASE, (short) 0);
		add("Piston base", "FlyZiii", Material.PISTON_MOVING_PIECE, (short) 0);
		add("Redstone lamp (1)", "AutoSoup", Material.REDSTONE_LAMP_ON, (short) 0);
		add("Redstone lamp (2)", "Jellyfish", Material.REDSTONE_LAMP_ON, (short) 0);
		add("Dispenser (1)", "scemm", Material.DISPENSER, (short) 0);
		add("Dispenser (2)", "DispenserLP", Material.DISPENSER, (short) 0);
		add("Dispenser (3)", "xXSiiKSiiNSXx", Material.DISPENSER, (short) 0);
		add("TNT (1)", "MHF_TNT", Material.TNT, (short) 0);
		add("TNT (2)", "MHF_TNT2", Material.TNT, (short) 0);
		add("TNT (3)", "Eternal", Material.TNT, (short) 0);
		add("Command block (1)", "LoveBug53", Material.COMMAND, (short) 0);
		add("Command block (2)", "monkey354", Material.COMMAND, (short) 0);
	}
}
