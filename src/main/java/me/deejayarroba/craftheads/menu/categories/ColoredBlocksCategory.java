package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class ColoredBlocksCategory extends Category {
	public ColoredBlocksCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Colorful block (1)", "Balloonicorn", Material.STAINED_CLAY, (short) 0);
		add("Colorful block (2)", "iElff", Material.STAINED_CLAY, (short) 0);
		add("White", "Karasamune", Material.WOOL, (short) 0);
		add("Shaded white", "DogPray", Material.WOOL, (short) 0);
		add("Light gray", "shadowblack", Material.WOOL, (short) 8);
		add("Black", "skitscape", Material.WOOL, (short) 15);
		add("Cream", "Majkel987", Material.WOOL, (short) 1);
		add("Yellow", "jarjenny", Material.WOOL, (short) 4);
		add("Orange (1)", "TheRalloTabbs", Material.WOOL, (short) 1);
		add("Orange (2)", "wulfric17", Material.WOOL, (short) 1);
		add("Pink (1)", "_EaglEye_", Material.WOOL, (short) 6);
		add("Pink (2)", "123jem", Material.WOOL, (short) 6);
		add("Magenta (1)", "dannyb10100", Material.WOOL, (short) 2);
		add("Magenta (2)", "diablo3pk", Material.WOOL, (short) 2);
		add("Red (1)", "LocoRunner", Material.WOOL, (short) 14);
		add("Red (2)", "drakemaster1", Material.WOOL, (short) 14);
		add("Dark red", "xINEFFABLEx", Material.WOOL, (short) 14);
		add("Purple", "reyndrys", Material.WOOL, (short) 10);
		add("Baby blue", "enclude", Material.WOOL, (short) 3);
		add("Sky blue", "cytrip", Material.WOOL, (short) 3);
		add("Azure blue", "Tinter", Material.WOOL, (short) 3);
		add("Darkish blue", "ztag100", Material.WOOL, (short) 11);
		add("Blue", "fancypjs", Material.WOOL, (short) 11);
		add("Dark blue", "GoldenCharms", Material.WOOL, (short) 11);
		add("Shaded green", "xumial", Material.WOOL, (short) 5);
		add("Bright green", "InvaderBen", Material.WOOL, (short) 5);
		add("Green", "Medaforce", Material.WOOL, (short) 5);
		add("Gradient green", "tank247", Material.WOOL, (short) 5);
		add("Grass green", "omz", Material.WOOL, (short) 5);
		add("Medium green", "sean1346", Material.WOOL, (short) 5);
		add("Dark green (1)", "simbarabbit1", Material.WOOL, (short) 13);
		add("Dark Green (2)", "", Material.WOOL, (short) 13);
		add("Brown", " c0c0nut", Material.WOOL, (short) 12);
		add("Dark gray (1)", "bananasquad", Material.WOOL, (short) 7);
		add("Dark gray (2)", "chupahotel", Material.WOOL, (short) 7);
		add("Cyan", "NarwhalSlayer76", Material.WOOL, (short) 9);
		add("Dark Cyan", "LucaAzalim", Material.WOOL, (short) 9);
	}
}
