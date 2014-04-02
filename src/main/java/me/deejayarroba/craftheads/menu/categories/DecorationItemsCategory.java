package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class DecorationItemsCategory extends Category {
	public DecorationItemsCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}
	
	@Override
	public void setup() {
		add("Pile of books", "abb3_1337", Material.BOOK, (short) 0);
		add("Bundle of books", "CS001", Material.BOOK, (short) 0);
		add("Old pile of books", "Erixia", Material.BOOK, (short) 0);
		add("Pile of tomes", "raxo55", Material.BOOK, (short) 0);
		add("Soccer ball", "soccer299", Material.FIREWORK_CHARGE, (short) 0);
		add("Aquarium", "Raider_X", Material.RAW_FISH, (short) 0);
		add("Empty aquarium", "Asiankid2004", Material.RAW_FISH, (short) 0);
		add("Earth (1)", "Endercreeper7253", Material.GRASS, (short) 0);
		add("Earth (2)", "Coasted", Material.GRASS, (short) 0);
		add("Knight helmet", "RipClaw", Material.CHAINMAIL_HELMET, (short) 0);
		add("Gray Knight helmet", "SniperCommando4", Material.IRON_HELMET, (short) 0);
		add("Red Knight helmet", "COMANDOvrs", Material.LEATHER_HELMET, (short) 0);
		add("Golden Knight helmet", "KCHAMBER", Material.GOLD_HELMET, (short) 0);
		add("Black dice", "azbandit2000", Material.WOOL, (short) 15);
		add("Red dice", "gumbo632", Material.WOOL, (short) 14);
		add("White dice", "jmars213", Material.WOOL, (short) 0);
		add("Simplistic dice", "tsharp", Material.WOOL, (short) 0);
		add("Rubik's cube (1)", "iTactical17", Material.WOOL, (short) 1);
		add("Rubik's cube (2)", "ZiGmUnDo", Material.WOOL, (short) 1);
		add("Rubik's cube (3)", "XxDreamKillaxX", Material.WOOL, (short) 1);
		add("Blue bowling ball", "bman1661", Material.WOOL, (short) 11);
		add("Eye (1)", "MrKMJohnson", Material.EYE_OF_ENDER, (short) 0);
		add("Eye (2)", "PARTY_P01S0N", Material.EYE_OF_ENDER, (short) 0);
		add("Eye (3)", "_redstoner_", Material.EYE_OF_ENDER, (short) 0);
		add("Football helmet", "elepunk", Material.DIAMOND_HELMET, (short) 0);
		add("Space helmet (1)", "ByVoltz", Material.GLASS, (short) 0);
		add("Space helmet (2)", "Dctr_", Material.GLASS, (short) 0);
		add("Beach Ball", "PurplePenguinLPs", Material.SLIME_BALL, (short) 0);
		add("Beehive", "_Shalafi", Material.STAINED_CLAY, (short) 1);
	}
	
}
