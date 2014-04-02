package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class SlimesCategory extends Category {
	public SlimesCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Slime", "MHF_Slime", Material.SLIME_BALL, (short) 0);
		add("Magma cube", "MHF_LavaSlime", Material.MAGMA_CREAM, (short) 0);
		add("Dark red slime", "inferno800", Material.WOOL, (short) 14);
		add("Orange slime", "md_5", Material.WOOL, (short) 1);
		add("Red/Yellow slime", "Shilo56", Material.WOOL, (short) 4);
		add("Yellow slime (1)", "scottdang", Material.WOOL, (short) 4);
		add("Yellow slime (2)", "Wyvern234", Material.WOOL, (short) 4);
		add("Yellow slime (3)", "drybowser151", Material.WOOL, (short) 4);
		add("Yellow slime (4)", "nelsyto", Material.WOOL, (short) 4);
		add("Yellow/Green slime", "netssanchez", Material.WOOL, (short) 5);
		add("Green slime (1)", "nilaro", Material.WOOL, (short) 5);
		add("Green slime (2)", "firebot86", Material.WOOL, (short) 5);
		add("Light cyan slime", "mixa4", Material.WOOL, (short) 9);
		add("Light blue slime (1)", "IronPigCraft", Material.WOOL, (short) 3);
		add("Cyan slime (1)", "redsnow9", Material.WOOL, (short) 9);
		add("Cyan slime (2)", "zilon1", Material.WOOL, (short) 9);
		add("Blue slime", "Deathbeam", Material.WOOL, (short) 11);
		add("Dark blue slime", "troopmaster", Material.WOOL, (short) 11);
		add("Blue/Gray slime", "ijevin", Material.WOOL, (short) 11);
		add("Purple slime (1)", "Baecke15", Material.WOOL, (short) 10);
		add("Purple slime (2)", "wydoo", Material.WOOL, (short) 10);
		add("Purple slime (3)", "gunju11", Material.WOOL, (short) 10);
		add("Magenta slime", "NewRequiem", Material.WOOL, (short) 2);
		add("Pink slime", "Pink__Slime", Material.WOOL, (short) 6);
		add("White/Blue slime", "Jorichi", Material.WOOL, (short) 0);
		add("Gray slime", "JulianClark", Material.WOOL, (short) 7);
		add("Black slime", "Teminator1311", Material.WOOL, (short) 15);
		add("Slime with sunglasses", "invalidd", Material.SLIME_BALL, (short) 0);
		add("Blue science slime", "maximka1221", Material.WOOL, (short) 11);
		add("Gold slime", "Domcame", Material.GOLD_BLOCK, (short) 0);
	}
}
