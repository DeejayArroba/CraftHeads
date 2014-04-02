package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class DecorationBlocksCategory extends Category {
	public DecorationBlocksCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Chimney", "The_Wither_Boss", Material.FIRE, (short) 0);
		add("Mailbox (1)", "Nixteen", Material.PAPER, (short) 0);
		add("Mailbox (2)", "BigG0628", Material.PAPER, (short) 0);
		add("Iron chest", "BillTheBuild3r", Material.CHEST, (short) 0);
		add("Diamond chest", "trtt25", Material.CHEST, (short) 0);
		add("First aid kit", "godman21", Material.BREAD, (short) 0);
		add("Target", "hexbug19", Material.WOOL, (short) 14);
		add("Arrow down", "MHF_ArrowDown", Material.ARROW, (short) 0);
		add("Arrow up", "MHF_ArrowUp", Material.ARROW, (short) 0);
		add("Arrow Left", "MHF_ArrowLeft", Material.ARROW, (short) 0);
		add("Arrow Right", "MHF_ArrowRight", Material.ARROW, (short) 0);
		add("Exclamation (1)", "MHF_Exclamation", Material.STICK, (short) 0);
		add("Exclamation (2)", "jona612", Material.STICK, (short) 0);
		add("Question mark (1)", "MHF_Question", Material.STRING, (short) 0);
		add("Question mark (2)", "jarrettgabe", Material.STRING, (short) 0);
		add("Question mark (3)", "deadpool0", Material.STRING, (short) 0);
		add("Question mark (4)", "Drifzzts", Material.STRING, (short) 0);
		add("Question mark (5)", "Kaulana", Material.STRING, (short) 0);
		add("Question mark (Mario)", "Agent7Celsius", Material.STRING, (short) 0);
		add("Space rock", "speedblader03", Material.OBSIDIAN, (short) 0);
		add("Solid block", "cholo71796", Material.QUARTZ_BLOCK, (short) 0);
		add("Metal block", "_The_God_King_", Material.IRON_BLOCK, (short) 0);
		add("Missing texture", "ddrl46", Material.WOOL, (short) 2);
		add("Lava rock", "crolin", Material.LAVA_BUCKET, (short) 0);
		add("Sun/Moon", "xMKK3L", Material.GLOWSTONE, (short) 0);
		add("Spiral", "bondsmatthew", Material.STRING, (short) 0);
		add("Grid", "Chritation", Material.MOB_SPAWNER, (short) 0);
	}
}
