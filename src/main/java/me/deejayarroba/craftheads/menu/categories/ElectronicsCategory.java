package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class ElectronicsCategory extends Category {
	public ElectronicsCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Toaster", "AcE_whatever", Material.BREAD, (short) 0);
		add("Golden clock", "backpack9898", Material.WATCH, (short) 0);
		add("Alarm clock", "nikx004", Material.WATCH, (short) 0);
		add("Clock", "Olaf_C", Material.WATCH, (short) 0);
		add("Broken TV (1)", "Cheapshot", Material.ITEM_FRAME, (short) 0);
		add("Broken TV (2)", "sysfailure", Material.ITEM_FRAME, (short) 0);
		add("Broken TV (3)", "nonesuchplace", Material.ITEM_FRAME, (short) 0);
		add("Broken TV (4)", "bjarnovikus", Material.ITEM_FRAME, (short) 0);
		add("Broken TV (5)", "Retla", Material.ITEM_FRAME, (short) 0);
		add("Off TV", "Metroidling", Material.ITEM_FRAME, (short) 0);
		add("Old TV", "Mur0n", Material.ITEM_FRAME, (short) 0);
		add("Monitor (1)", "Alistor", Material.PAINTING, (short) 0);
		add("Monitor (2)", "CoderPuppy", Material.PAINTING, (short) 0);
		add("Monitor (3)", "Laserpanda", Material.PAINTING, (short) 0);
		add("Computer (1)", "OctopusGuy", Material.REDSTONE, (short) 0);
		add("Computer (2)", "Addelburgh", Material.REDSTONE, (short) 0);
		add("Computer (3)", "Hack", Material.REDSTONE, (short) 0);
		add("Speaker", "b1418", Material.NOTE_BLOCK, (short) 0);
		add("Camera (1)", "FHG_Cam", Material.EYE_OF_ENDER, (short) 0);
		add("Camera (2)", "jorgenskar95", Material.EYE_OF_ENDER, (short) 0);
		add("Camera (3)", "gocodygo", Material.EYE_OF_ENDER, (short) 0);
		add("Surveillance Camera", "QcBlastar", Material.EYE_OF_ENDER, (short) 0);
		add("Radio", "uioz", Material.JUKEBOX, (short) 0);
		add("Game Cube (1)", "ReflectedNicK", Material.DIODE, (short) 0);
		add("Game Cube (2)", "Eien15", Material.DIODE, (short) 0);
		add("Headlight", "Toby_The_Coder", Material.GLOWSTONE, (short) 0);
		add("Microwave", "RottenCHEEZBURGR", Material.PUMPKIN_PIE, (short) 0);
	}
}
