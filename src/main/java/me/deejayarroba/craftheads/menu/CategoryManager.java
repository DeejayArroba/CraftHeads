package me.deejayarroba.craftheads.menu;

import me.deejayarroba.craftheads.menu.categories.*;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

	private static CategoryManager instance = new CategoryManager();

	private List<Category> categories = new ArrayList<Category>();

	public CategoryManager() {
		setup();
	}

	public static CategoryManager getInstance() {
		return instance;
	}

	private void add(Category category) {
		categories.add(category);
	}

	private void setup() {
		add(new AnimalsCategory("Animals", Material.PORK, (short) 0));
		add(new ChristmasCategory("Christmas", Material.SNOW_BLOCK, (short) 0));
		add(new ColoredBlocksCategory("Colored Blocks", Material.WOOL, (short) 1));
		add(new DecorationBlocksCategory("Decoration blocks", Material.ARROW, (short) 0));
		add(new DecorationItemsCategory("Decoration items", Material.PAPER, (short) 0));
		add(new ElectronicsCategory("Electronics", Material.DIODE, (short) 0));
		add(new FoodAndDrinksCategory("Food and drinks", Material.COOKIE, (short) 0));
		add(new FruitAndPlantsCategory("Fruit and plants", Material.APPLE, (short) 0));
		add(new MinecraftItemsCategory("Minecraft items", Material.FURNACE, (short) 0));
		add(new MobsCategory("Mobs", Material.BONE, (short) 0));
		add(new NetherCategory("Nether", Material.NETHERRACK, (short) 0));
		add(new OtherBlocksCategory("Other blocks", Material.GRAVEL, (short) 0));
		add(new PeopleCategory("People", Material.SKULL_ITEM, (short) 3));
		add(new RedstoneCategory("Redstone", Material.REDSTONE, (short) 0));
		add(new SlimesCategory("Slimes", Material.SLIME_BALL, (short) 0));
		add(new StonesAndOresCategory("Stones and ores", Material.STONE, (short) 0));
		add(new WoodCategory("Wood", Material.LOG, (short) 0));
	}

	public List<Category> getCategories() {
		return categories;
	}

	public Category getCategory(String name) {
		for(Category category : categories) {
			if(category.getName().equals(name)) {
				return category;
			}
		}
		return null;
	}



}
