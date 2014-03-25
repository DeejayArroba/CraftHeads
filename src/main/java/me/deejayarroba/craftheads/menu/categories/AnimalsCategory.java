package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class AnimalsCategory extends Category {
	public AnimalsCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}
	
	@Override
	public void setup() {
		add("Panda", "blob96", Material.SUGAR_CANE, (short) 0);
		add("Chinese Dragon", "Morhaus", Material.DRAGON_EGG, (short) 0);
		add("Tiger", "TigDra", Material.WOOL, (short) 1);
		add("Eagle", "Ximonic", Material.EGG, (short) 0);
		add("Penguin (1)", "Haribo98", Material.SNOW_BLOCK, (short) 0);
		add("Penguin (2)", "Patty14", Material.SNOW_BLOCK, (short) 0);
		add("Walrus", "Walrus", Material.ICE, (short) 0);
		add("Fox", "hugge75", Material.WOOL, (short) 1);
		add("Owl", "Barnyard_Owl", Material.FEATHER, (short) 0);
		add("Sloth", "BaconBaden", Material.SOUL_SAND, (short) 0);
		add("Parrot", "Luk3011", Material.FEATHER, (short) 0);
		add("Frog", "sjkelly1299", Material.WOOL, (short) 5);
		add("Blue whale", "tabellowic", Material.WOOL, (short) 11);
		add("Bat", "TheInfernoShadow", Material.MONSTER_EGG, (short) 65);
		add("Cat (1)", "Dragibus33", Material.AIR, (short) 0);
		add("Cat (2)", "EnjoiDung", Material.AIR, (short) 0);
		add("Dog", "GodTGF", Material.AIR, (short) 0);
		add("Ape", "swmyprod", Material.AIR, (short) 0);
		add("Fish", "PirateRy", Material.AIR, (short) 0);
		add("Turkey", "turkeybot69", Material.AIR, (short) 0);
		add("Duck", "dododaan", Material.AIR, (short) 0);
		add("Werewolf", "SomeWerewolf", Material.AIR, (short) 0);
		add("Polar bear", "mabo516", Material.AIR, (short) 0);
		add("Monkey", "spiffywaffleman", Material.AIR, (short) 0);
		add("Bear", "bear1717", Material.AIR, (short) 0);
		add("Chihuahua", "Taureus", Material.AIR, (short) 0);
	}
}
