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
		add(new AnimalsCategory("Animals", Material.BONE, (short) 0));
		add(new ChristmasCategory("Christmas", Material.BONE, (short) 0));
		add(new ColoredBlocksCategory("Colored Blocks", Material.BONE, (short) 0));
		add(new DecorationBlocksCategory("Decoration blocks", Material.BONE, (short) 0));
		add(new DecorationItemsCategory("Decoration items", Material.BONE, (short) 0));
		add(new ElectronicsCategory("Electronics", Material.BONE, (short) 0));
		add(new FoodAndDrinksCategory("Food and drinks", Material.BONE, (short) 0));
		add(new FruitAndPlantsCategory("Fruit and plants", Material.BONE, (short) 0));
		add(new MinecraftItemsCategory("Minecraft items", Material.BONE, (short) 0));
		add(new MobsCategory("Mobs", Material.BONE, (short) 0));
		add(new NetherCategory("Nether", Material.BONE, (short) 0));
		add(new OtherBlocksCategory("Other blocks", Material.BONE, (short) 0));
		add(new PeopleCategory("People", Material.BONE, (short) 0));
		add(new RedstoneCategory("Redstone", Material.BONE, (short) 0));
		add(new SlimesCategory("Slimes", Material.BONE, (short) 0));
		add(new StonesAndOresCategory("Stones and ores", Material.BONE, (short) 0));
		add(new WoodCategory("Wood", Material.BONE, (short) 0));
	}

	public List<Category> getCategories() {
		return categories;
	}



}
