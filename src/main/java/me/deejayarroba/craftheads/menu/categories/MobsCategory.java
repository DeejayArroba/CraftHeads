package me.deejayarroba.craftheads.menu.categories;

import me.deejayarroba.craftheads.menu.Category;
import org.bukkit.Material;

public class MobsCategory extends Category {

	public MobsCategory(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {add("Pig", "MHF_Pig", Material.MONSTER_EGG, (short) 90);
		add("Cow", "MHF_Cow", Material.MONSTER_EGG, (short) 92);
		add("Chicken", "MHF_Chicken", Material.MONSTER_EGG, (short) 93);
		add("Squid", "MHF_Squid", Material.MONSTER_EGG, (short) 94);
		add("Sideways squid", "Comcastt", Material.MONSTER_EGG, (short) 94);
		add("Ocelot", "MHF_Ocelot", Material.MONSTER_EGG, (short) 98);
		add("Orange cat", "jarkpzf", Material.MONSTER_EGG, (short) 98);
		add("Mooshroom", "MHF_MushroomCow", Material.MONSTER_EGG, (short) 96);
		add("Villager", "MHF_Villager", Material.MONSTER_EGG, (short) 120);
		add("Iron golem", "MHF_Golem", Material.IRON_INGOT, (short) 0);
		add("Red eyed wither skeleton", "poisonedsoul", Material.SKULL_ITEM, (short) 0);
		add("Blaze", "MHF_Blaze", Material.MONSTER_EGG, (short) 61);
		add("Zombie pigman", "MHF_PigZombie", Material.MONSTER_EGG, (short) 57);
		add("Ghast", "MHF_Ghast", Material.MONSTER_EGG, (short) 56);
		add("Spider", "MHF_Spider", Material.MONSTER_EGG, (short) 52);
		add("Cave spider", "MHF_CaveSpider", Material.MONSTER_EGG, (short) 59);
		add("Enderman", "MHF_Enderman", Material.MONSTER_EGG, (short) 58);
		add("Herobrine", "MHF_Herobrine", Material.DIAMOND_SWORD, (short) 0);
		add("Horse (1)", "Horsi2", Material.MONSTER_EGG, (short) 100);
		add("Horse (2)", "gavertoso", Material.MONSTER_EGG, (short) 100);
		add("Beheaded steve", "tubbydontdiet", Material.MONSTER_EGG, (short) 3);
		add("Decompising head", "tha_cat", Material.SKULL_ITEM, (short) 2);
		add("Bloody skull", "theangryman", Material.WOOL, (short) 14);
		add("Mossy skull", "wallabee", Material.MOSSY_COBBLESTONE, (short) 0);
		add("Enderman/Wither morph", "hopkinstm", Material.ENDER_PEARL, (short) 0);
		add("Wolf", "Budwolf", Material.BONE, (short) 0);
		add("Angry Wolf", "Pablo_Penguin", Material.BONE, (short) 0);
		add("Golden pig", "badkyo", Material.GOLD_BLOCK, (short) 0);
		add("Golden cow", "SmallMuzza", Material.GOLD_BLOCK, (short) 0);
		add("Purple cow", "badoomtch", Material.WOOL, (short) 10);
		add("Blue cow", "More_Toffee", Material.WOOL, (short) 11);
		add("Magenta mooshroom", "Hesper", Material.WOOL, (short) 2);
		add("Golden golem", "huskybuddergolem", Material.GOLD_INGOT, (short) 0);
		add("Ghost", "SmallTownGal", Material.SKULL_ITEM, (short) 0);
		add("Sheep", "MHF_Sheep", Material.WOOL, (short) 0);
		add("Pink sheep", "Kolish", Material.WOOL, (short) 6);
		add("Light gray sheep", "WoolDye", Material.WOOL, (short) 2);
		add("Yellow sheep", "Sheepshaver406", Material.WOOL, (short) 4);
		add("Lime sheep", "Alphazazoo", Material.WOOL, (short) 5);
		add("Cyan sheep", "EvilCyanSheep", Material.WOOL, (short) 9);
		add("Light blue sheep", "Sheeplings", Material.WOOL, (short) 3);
		add("Blue sheep", "CrazyReader01", Material.WOOL, (short) 11);
		add("Black sheep", "Plasmic_Sheep", Material.WOOL, (short) 15);
		add("Sheep with sunglasses", "sheepy345", Material.WOOL, (short) 0);
	}

}
