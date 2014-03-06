package me.deejayarroba.craftheads;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {

	private List<Menu> menuList = new ArrayList<Menu>();

	private List<MenuItem> mainMenu = new ArrayList<MenuItem>();

	private List<MenuItem> extraHeadsMenu = new ArrayList<MenuItem>();

	private List<MenuItem> animalsCategory = new ArrayList<MenuItem>();
	private List<MenuItem> mobsCategory = new ArrayList<MenuItem>();
	private List<MenuItem> christmasCategory = new ArrayList<MenuItem>();
	private List<MenuItem> coloredBlocksCategory = new ArrayList<MenuItem>();
	private List<MenuItem> decorationBlocksCategory = new ArrayList<MenuItem>();
	private List<MenuItem> decorationItemsCategory = new ArrayList<MenuItem>();
	private List<MenuItem> electronicsCategory = new ArrayList<MenuItem>();
	private List<MenuItem> foodAndDrinksCategory = new ArrayList<MenuItem>();
	private List<MenuItem> fruitAndPlantsCategory = new ArrayList<MenuItem>();
	private List<MenuItem> minecraftItemsCategory = new ArrayList<MenuItem>();
	private List<MenuItem> netherCategory = new ArrayList<MenuItem>();
	private List<MenuItem> otherBlocksCategory = new ArrayList<MenuItem>();
	private List<MenuItem> peopleCategory = new ArrayList<MenuItem>();
	private List<MenuItem> redstoneCategory = new ArrayList<MenuItem>();
	private List<MenuItem> referencesCategory = new ArrayList<MenuItem>();
	private List<MenuItem> slimesCategory = new ArrayList<MenuItem>();
	private List<MenuItem> stoneAndOresCategory = new ArrayList<MenuItem>();
	private List<MenuItem> woodCategory = new ArrayList<MenuItem>();

	public Menu createMenu(String name, List<MenuItem> items) {
		Menu menu = new Menu(name, items);
		menuList.add(menu);
		return menu;
	}

	public List<Menu> getMenus() {
		return menuList;
	}

	public MenuManager() {

		setupMainMenu();
		setupExtraHeadsMenu();
		setupMobsCategory();
		setupAnimalsCategory();
		setupChristmasCategory();
		setupColoredBlocksCategory();
		setupDecorationBlocksCategory();
		setupDecorationItemsCategory();
		setupElectronicsCategory();
		setupFoodAndDrinksCategory();
		setupFruitAndPlantsCategory();
		setupMinecraftItemsCategory();
		setupNetherCategory();
		setupOtherBlocksCategory();
		setupPeopleCategory();
		setupRedstoneCategory();
		setupReferencesCategory();
		setupSlimesCategory();
		setupStoneAndOresCategory();
		setupWoodCategory();
		
	}

	private void setupMainMenu() {
		mainMenu.add(MenuItemManager.createMenuItem("Get your own head!", null, Material.SKULL_ITEM, (short) 3));
		mainMenu.add(MenuItemManager.createMenuItem("Extra heads", null, Material.CAKE, (short) 0));
		mainMenu.add(MenuItemManager.createMenuItem("Get someone else's head", null, Material.GOLDEN_APPLE, (short) 0));
	}

	private void setupExtraHeadsMenu() {
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Wood", null, Material.WOOD, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Stone and ores", null, Material.STONE, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Other blocks", null, Material.SPONGE, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Minecraft items", null, Material.IRON_PICKAXE, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Redstone", null, Material.REDSTONE_BLOCK, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Nether", null, Material.NETHERRACK, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Slimes", null, Material.SLIME_BALL, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Mobs", null, Material.MONSTER_EGG, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Food and drinks", null, Material.COOKED_BEEF, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Fruit and plants", null, Material.APPLE, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Electronics", null, Material.DIODE, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Decoration blocks", null, Material.BED, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Decoration items", null, Material.RAW_FISH, (short) 0));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Colored blocks", null, Material.WOOL, (short) 1));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("People", null, Material.SKULL_ITEM, (short) 3));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Animals", null, Material.BONE, (short) 3));
		extraHeadsMenu.add(MenuItemManager.createMenuItem("Christmas", null, Material.SNOW_BLOCK, (short) 0));
	}

	private void setupMobsCategory() {
		mobsCategory.add(MenuItemManager.createMenuItem("Pig", "MHF_Pig", Material.MONSTER_EGG, (short) 90));
		mobsCategory.add(MenuItemManager.createMenuItem("Cow", "MHF_Cow", Material.MONSTER_EGG, (short) 92));
		mobsCategory.add(MenuItemManager.createMenuItem("Chicken", "MHF_Chicken", Material.MONSTER_EGG, (short) 93));
		mobsCategory.add(MenuItemManager.createMenuItem("Squid", "MHF_Squid", Material.MONSTER_EGG, (short) 94));
		mobsCategory.add(MenuItemManager.createMenuItem("Sideways squid", "Comcastt", Material.MONSTER_EGG, (short) 94));
		mobsCategory.add(MenuItemManager.createMenuItem("Ocelot", "MHF_Ocelot", Material.MONSTER_EGG, (short) 98));
		mobsCategory.add(MenuItemManager.createMenuItem("Orange cat", "jarkpzf", Material.MONSTER_EGG, (short) 98));
		mobsCategory.add(MenuItemManager.createMenuItem("Mooshroom", "MHF_MushroomCow", Material.MONSTER_EGG, (short) 96));
		mobsCategory.add(MenuItemManager.createMenuItem("Villager", "MHF_Villager", Material.MONSTER_EGG, (short) 120));
		mobsCategory.add(MenuItemManager.createMenuItem("Iron golem", "MHF_Golem", Material.IRON_INGOT, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Red eyed wither skeleton", "poisonedsoul", Material.SKULL_ITEM, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Blaze", "MHF_Blaze", Material.MONSTER_EGG, (short) 61));
		mobsCategory.add(MenuItemManager.createMenuItem("Zombie pigman", "MHF_PigZombie", Material.MONSTER_EGG, (short) 57));
		mobsCategory.add(MenuItemManager.createMenuItem("Ghast", "MHF_Ghast", Material.MONSTER_EGG, (short) 56));
		mobsCategory.add(MenuItemManager.createMenuItem("Spider", "MHF_Spider", Material.MONSTER_EGG, (short) 52));
		mobsCategory.add(MenuItemManager.createMenuItem("Cave spider", "MHF_CaveSpider", Material.MONSTER_EGG, (short) 59));
		mobsCategory.add(MenuItemManager.createMenuItem("Enderman", "MHF_Enderman", Material.MONSTER_EGG, (short) 58));
		mobsCategory.add(MenuItemManager.createMenuItem("Herobrine", "MHF_Herobrine", Material.DIAMOND_SWORD, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Horse (1)", "Horsi2", Material.MONSTER_EGG, (short) 100));
		mobsCategory.add(MenuItemManager.createMenuItem("Horse (2)", "gavertoso", Material.MONSTER_EGG, (short) 100));
		mobsCategory.add(MenuItemManager.createMenuItem("Beheaded steve (1)", "Tarem2", Material.MONSTER_EGG, (short) 3));
		mobsCategory.add(MenuItemManager.createMenuItem("Beheaded steve (2)", "tubbydontdiet", Material.MONSTER_EGG, (short) 3));
		mobsCategory.add(MenuItemManager.createMenuItem("Decompising head", "tha_cat", Material.SKULL_ITEM, (short) 2));
		mobsCategory.add(MenuItemManager.createMenuItem("Beheaded skeleton", "lesto123", Material.SKULL_ITEM, (short) 1));
		mobsCategory.add(MenuItemManager.createMenuItem("Bloody skull", "theangryman", Material.WOOL, (short) 14));
		mobsCategory.add(MenuItemManager.createMenuItem("Mossy skull", "wallabee", Material.MOSSY_COBBLESTONE, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Enderman/Wither morph", "hopkinstm", Material.ENDER_PEARL, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Wolf", "Budwolf", Material.BONE, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Angry Wolf", "Pablo_Penguin", Material.BONE, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Golden pig", "badkyo", Material.GOLD_BLOCK, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Golden cow", "SmallMuzza", Material.GOLD_BLOCK, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Purple cow", "badoomtch", Material.WOOL, (short) 10));
		mobsCategory.add(MenuItemManager.createMenuItem("Blue cow", "More_Toffee", Material.WOOL, (short) 11));
		mobsCategory.add(MenuItemManager.createMenuItem("Magenta mooshroom", "Hesper", Material.WOOL, (short) 2));
		mobsCategory.add(MenuItemManager.createMenuItem("Golden golem", "huskybuddergolem", Material.GOLD_INGOT, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Ghost", "SmallTownGal", Material.SKULL_ITEM, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Sheep", "MHF_Sheep", Material.WOOL, (short) 0));
		mobsCategory.add(MenuItemManager.createMenuItem("Pink sheep", "Kolish", Material.WOOL, (short) 6));
		mobsCategory.add(MenuItemManager.createMenuItem("Magenta sheep", "WoolDye", Material.WOOL, (short) 2));
		mobsCategory.add(MenuItemManager.createMenuItem("Yellow sheep", "Sheepshaver406", Material.WOOL, (short) 4));
		mobsCategory.add(MenuItemManager.createMenuItem("Lime sheep", "Alphazazoo", Material.WOOL, (short) 5));
		mobsCategory.add(MenuItemManager.createMenuItem("Cyan sheep", "EvilCyanSheep", Material.WOOL, (short) 9));
		mobsCategory.add(MenuItemManager.createMenuItem("Light blue sheep", "Sheeplings", Material.WOOL, (short) 3));
		mobsCategory.add(MenuItemManager.createMenuItem("Blue sheep", "CrazyReader01", Material.WOOL, (short) 11));
		mobsCategory.add(MenuItemManager.createMenuItem("Black sheep", "Plasmic_Sheep", Material.WOOL, (short) 15));
		mobsCategory.add(MenuItemManager.createMenuItem("Sheep with sunglasses", "sheepy345", Material.WOOL, (short) 0));
	}
	
	private void setupAnimalsCategory() {
		animalsCategory.add(MenuItemManager.createMenuItem("Panda", "blob96", Material.SUGAR_CANE, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Chinese Dragon", "Morhaus", Material.DRAGON_EGG, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Tiger", "TigDra", Material.WOOL, (short) 1));
		animalsCategory.add(MenuItemManager.createMenuItem("Eagle", "Ximonic", Material.EGG, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Penguin (1)", "Haribo98", Material.SNOW_BLOCK, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Penguin (2)", "Patty14", Material.SNOW_BLOCK, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Walrus", "Walrus", Material.ICE, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Fox", "hugge75", Material.WOOL, (short) 1));
		animalsCategory.add(MenuItemManager.createMenuItem("Owl", "Barnyard_Owl", Material.FEATHER, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Sloth", "BaconBaden", Material.SOUL_SAND, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Parrot", "Luk3011", Material.FEATHER, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Frog", "sjkelly1299", Material.WOOL, (short) 5));
		animalsCategory.add(MenuItemManager.createMenuItem("Blue whale", "tabellowic", Material.WOOL, (short) 11));
		animalsCategory.add(MenuItemManager.createMenuItem("Bat", "TheInfernoShadow", Material.MONSTER_EGG, (short) 65));
		animalsCategory.add(MenuItemManager.createMenuItem("Cat (1)", "Dragibus33", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Cat (2)", "EnjoiDung", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Dog", "GodTGF", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Ape", "swmyprod", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Fish", "PirateRy", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Turkey", "turkeybot69", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Duck", "dododaan", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Werewolf", "SomeWerewolf", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Polar bear", "mabo516", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Monkey", "spiffywaffleman", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Bear", "bear1717", Material.AIR, (short) 0));
		animalsCategory.add(MenuItemManager.createMenuItem("Chihuahua", "Taureus", Material.AIR, (short) 0));
	}

	private void setupChristmasCategory() {
		christmasCategory.add(MenuItemManager.createMenuItem("Snowman (1)", "dad12", Material.SNOW_BLOCK, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Snowman (2)", "Madam_Red", Material.SNOW_BLOCK, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Snowman (3)", "GLaDOS", Material.SNOW_BLOCK, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Snow Creeper", "rexery76", Material.SKULL_ITEM, (short) 4));
		christmasCategory.add(MenuItemManager.createMenuItem("Present (1)", "CruXXx", Material.CHEST, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Present (2)", "snipper4561", Material.CHEST, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Present (3)", "yawn1234", Material.CHEST, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Present (4)", "scratch24", Material.CHEST, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Present (5)", "I_Xenon_I", Material.CHEST, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Present (6)", "SparkingYellow", Material.CHEST, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Christmas star", "Improv_Peanut", Material.NETHER_STAR, (short) 0));
		christmasCategory.add(MenuItemManager.createMenuItem("Candy cane", "FennoBear", Material.SUGAR, (short) 0));
	}

	private void setupColoredBlocksCategory() {
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Colorful block (1)", "Balloonicorn", Material.STAINED_CLAY, (short) 0));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Colorful block (2)", "iElff", Material.STAINED_CLAY, (short) 0));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("White", "Karasamune", Material.WOOL, (short) 0));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Shaded white", "DogPray", Material.WOOL, (short) 0));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Light gray", "shadowblack", Material.WOOL, (short) 8));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Black", "skitscape", Material.WOOL, (short) 15));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Cream", "Majkel987", Material.WOOL, (short) 1));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Yellow", "jarjenny", Material.WOOL, (short) 4));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Orange (1)", "TheRalloTabbs", Material.WOOL, (short) 1));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Orange (2)", "wulfric17", Material.WOOL, (short) 1));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Pink (1)", "_EaglEye_", Material.WOOL, (short) 6));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Pink (2)", "123jem", Material.WOOL, (short) 6));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Magenta (1)", "dannyb10100", Material.WOOL, (short) 2));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Magenta (2)", "diablo3pk", Material.WOOL, (short) 2));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Red (1)", "LocoRunner", Material.WOOL, (short) 14));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Red (2)", "drakemaster1", Material.WOOL, (short) 14));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Dark red", "xINEFFABLEx", Material.WOOL, (short) 14));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Purple", "reyndrys", Material.WOOL, (short) 10));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Baby blue", "enclude", Material.WOOL, (short) 3));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Sky blue", "cytrip", Material.WOOL, (short) 3));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Azure blue", "Tinter", Material.WOOL, (short) 3));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Darkish blue", "ztag100", Material.WOOL, (short) 11));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Blue", "fancypjs", Material.WOOL, (short) 11));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Dark blue", "GoldenCharms", Material.WOOL, (short) 11));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Shaded green", "xumial", Material.WOOL, (short) 5));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Bright green", "InvaderBen", Material.WOOL, (short) 5));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Green", "Medaforce", Material.WOOL, (short) 5));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Gradient green", "tank247", Material.WOOL, (short) 5));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Grass green", "omz", Material.WOOL, (short) 5));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Medium green", "sean1346", Material.WOOL, (short) 5));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Dark green (1)", "simbarabbit1", Material.WOOL, (short) 13));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Dark Green (2)", "", Material.WOOL, (short) 13));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Brown", " c0c0nut", Material.WOOL, (short) 12));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Dark gray (1)", "bananasquad", Material.WOOL, (short) 7));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Dark gray (2)", "chupahotel", Material.WOOL, (short) 7));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Cyan", "NarwhalSlayer76", Material.WOOL, (short) 9));
		coloredBlocksCategory.add(MenuItemManager.createMenuItem("Dark Cyan", "LucaAzalim", Material.WOOL, (short) 9));
	}

	private void setupDecorationBlocksCategory() {
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Chimney", "The_Wither_Boss", Material.FIRE, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Stone with light", "MrARuiz", Material.STONE, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Mailbox (1)", "Nixteen", Material.PAPER, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Mailbox (2)", "BigG0628", Material.PAPER, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Iron chest", "BillTheBuild3r", Material.CHEST, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Diamond chest", "trtt25", Material.CHEST, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("First aid kit", "godman21", Material.BREAD, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Target", "hexbug19", Material.WOOL, (short) 14));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Arrow down", "MHF_ArrowDown", Material.ARROW, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Arrow up", "MHF_ArrowUp", Material.ARROW, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Arrow Left", "MHF_ArrowLeft", Material.ARROW, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Arrow Right", "MHF_ArrowRight", Material.ARROW, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Exclamation (1)", "MHF_Exclamation", Material.STICK, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Exclamation (2)", "jona612", Material.STICK, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Question mark (1)", "MHF_Question", Material.STRING, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Question mark (2)", "jarrettgabe", Material.STRING, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Question mark (3)", "deadpool0", Material.STRING, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Question mark (4)", "Drifzzts", Material.STRING, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Question mark (5)", "Kaulana", Material.STRING, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Question mark (Mario)", "Agent7Celsius", Material.STRING, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Space rock", "speedblader03", Material.OBSIDIAN, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Solid block", "cholo71796", Material.QUARTZ_BLOCK, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Metal block", "_The_God_King_", Material.IRON_BLOCK, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Missing texture", "ddrl46", Material.LOCKED_CHEST, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Lava rock", "crolin", Material.LAVA_BUCKET, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Infected cobblestone", "Eddgc", Material.MOSSY_COBBLESTONE, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Sun/Moon", "xMKK3L", Material.GLOWSTONE, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Spiral", "bondsmatthew", Material.STRING, (short) 0));
		decorationBlocksCategory.add(MenuItemManager.createMenuItem("Grid", "Chritation", Material.MOB_SPAWNER, (short) 0));
	}

	private void setupDecorationItemsCategory() {
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Pile of books", "abb3_1337", Material.BOOK, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Bundle of books", "CS001", Material.BOOK, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Old pile of books", "Erixia", Material.BOOK, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Pile of tomes", "raxo55", Material.BOOK, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Soccer ball", "soccer299", Material.FIREWORK_CHARGE, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Aquarium", "Raider_X", Material.RAW_FISH, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Empty aquarium", "Asiankid2004", Material.RAW_FISH, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Earth (1)", "Endercreeper7253", Material.GRASS, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Earth (2)", "Coasted", Material.GRASS, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Toilet roll", "Ethegj", Material.PAPER, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Knight helmet", "RipClaw", Material.CHAINMAIL_HELMET, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Gray Knight helmet", "SniperCommando4", Material.IRON_HELMET, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Red Knight helmet", "COMANDOvrs", Material.LEATHER_HELMET, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Golden Knight helmet", "KCHAMBER", Material.GOLD_HELMET, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Black dice", "azbandit2000", Material.WOOL, (short) 15));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Red dice", "gumbo632", Material.WOOL, (short) 14));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("White dice", "jmars213", Material.WOOL, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Simplistic dice", "tsharp", Material.WOOL, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Rubik's cube (1)", "iTactical17", Material.WOOL, (short) 1));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Rubik's cube (2)", "ZiGmUnDo", Material.WOOL, (short) 1));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Rubik's cube (3)", "XxDreamKillaxX", Material.WOOL, (short) 1));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Blue bowling ball", "bman1661", Material.WOOL, (short) 11));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Pink bowling ball", "diddyninjadwarf", Material.WOOL, (short) 6));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Green bowling ball", "Tyridan", Material.WOOL, (short) 5));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Eye (1)", "MrKMJohnson", Material.EYE_OF_ENDER, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Eye (2)", "PARTY_P01S0N", Material.EYE_OF_ENDER, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Eye (3)", "_redstoner_", Material.EYE_OF_ENDER, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Football helmet", "elepunk", Material.DIAMOND_HELMET, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Space helmet (1)", "ByVoltz", Material.GLASS, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Space helmet (2)", "Dctr_", Material.GLASS, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Beach Ball", "PurplePenguinLPs", Material.SLIME_BALL, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Crystal Orb", "ccory9", Material.GLOWSTONE_DUST, (short) 0));
		decorationItemsCategory.add(MenuItemManager.createMenuItem("Beehive", "_Shalafi", Material.STAINED_CLAY, (short) 1));

	}

	private void setupElectronicsCategory() {
		electronicsCategory.add(MenuItemManager.createMenuItem("Toaster", "AcE_whatever", Material.BREAD, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Golden clock", "backpack9898", Material.WATCH, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Alarm clock", "nikx004", Material.WATCH, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Clock", "Olaf_C", Material.WATCH, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Broken TV (1)", "Cheapshot", Material.ITEM_FRAME, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Broken TV (2)", "sysfailure", Material.ITEM_FRAME, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Broken TV (3)", "nonesuchplace", Material.ITEM_FRAME, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Broken TV (4)", "bjarnovikus", Material.ITEM_FRAME, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Broken TV (5)", "Retla", Material.ITEM_FRAME, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Off TV", "Metroidling", Material.ITEM_FRAME, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Old TV", "Mur0n", Material.ITEM_FRAME, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Monitor (1)", "Alistor", Material.PAINTING, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Monitor (2)", "CoderPuppy", Material.PAINTING, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Monitor (3)", "Laserpanda", Material.PAINTING, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Computer (1)", "OctopusGuy", Material.REDSTONE, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Computer (2)", "Addelburgh", Material.REDSTONE, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Computer (3)", "Hack", Material.REDSTONE, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Speaker", "b1418", Material.NOTE_BLOCK, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Camera (1)", "FHG_Cam", Material.EYE_OF_ENDER, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Camera (2)", "jorgenskar95", Material.EYE_OF_ENDER, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Camera (3)", "gocodygo", Material.EYE_OF_ENDER, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Surveillance Camera", "QcBlastar", Material.EYE_OF_ENDER, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Radio", "uioz", Material.JUKEBOX, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Game Cube (1)", "ReflectedNicK", Material.DIODE, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Game Cube (2)", "Eien15", Material.DIODE, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Headlight", "Toby_The_Coder", Material.GLOWSTONE, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Police light", "coltfan98", Material.WOOL, (short) 11));
		electronicsCategory.add(MenuItemManager.createMenuItem("Microwave", "RottenCHEEZBURGR", Material.PUMPKIN_PIE, (short) 0));
		electronicsCategory.add(MenuItemManager.createMenuItem("Machinery block", "Foxza12", Material.IRON_BLOCK, (short) 0));
	}

	private void setupFoodAndDrinksCategory() {
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Medieval mug", "Fire_Feather", Material.BOWL, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Waffles with syrup", "HW9000", Material.PUMPKIN_PIE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Taco (1)", "Crunchy_Taco34", Material.PUMPKIN_PIE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Taco (2)", "TacoSauzee", Material.PUMPKIN_PIE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Burger (1)", "food", Material.COOKED_BEEF, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Burger (2)", "glorycraft", Material.COOKED_BEEF, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Burger (3)", "simbasthebestbud", Material.COOKED_BEEF, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Burger (4)", "01theG", Material.COOKED_BEEF, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Muffin", "ChocolateMuffin", Material.CAKE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Cookie", "QuadratCookie", Material.COOKIE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Popcorn", "ZachWarnerHD", Material.STAINED_CLAY, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Can of soup", "FlabbenBaggen", Material.MUSHROOM_SOUP, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Bacon (1)", "Baconator52", Material.PORK, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Bacon (2)", "Owen0821", Material.PORK, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Potato", "CraftPotato13", Material.POTATO, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Glass of Cola", "Yeah_1234", Material.GLASS_BOTTLE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Rice ball", "Benvuolo", Material.WOOL, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Ice cream sandwich ", "DutchGuard", Material.STAINED_CLAY, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Pie (1)", "hardyx", Material.PUMPKIN_PIE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Pie (2)", "Sam27572", Material.PUMPKIN_PIE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Cherry Pie", "oliver2104", Material.PUMPKIN_PIE, (short) 0));
		foodAndDrinksCategory.add(MenuItemManager.createMenuItem("Coffee", "rayquaza89", Material.MILK_BUCKET, (short) 0));
	}

	private void setupFruitAndPlantsCategory() {
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Orange", "hi1232", Material.WOOL, (short) 1));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Lemon", "aesixx", Material.WOOL, (short) 5));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Cherry", "TheEvilEnderman", Material.WOOL, (short) 14));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Apple (1)", "MHF_Apple", Material.APPLE, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Apple (2)", "KylexDavis", Material.APPLE, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Strawberry", "captan_sparkles", Material.WOOL, (short) 14));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Coconut", "KyleWDM", Material.WOOL, (short) 12));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Melon (1)", "MHF_Melon", Material.MELON_BLOCK, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Melon (2)", "PatrickAVG", Material.MELON_BLOCK, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Pumpkin", "MHF_Pumpkin", Material.PUMPKIN, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Jack o' lantern (1)", "Koebasti", Material.JACK_O_LANTERN, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Jack o' lantern (2)", "PumpkinSh00t", Material.JACK_O_LANTERN, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Happy pumpkin", "Lycanthh", Material.PUMPKIN, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Cut citrus", "BalkondeurAlpha", Material.STAINED_CLAY, (short) 5));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Sugar cane", "Sugar_Cane_", Material.SUGAR_CANE, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Cactus", "MHF_Cactus", Material.CACTUS, (short) 0));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Grapes", "yamichetan78", Material.WOOL, (short) 10));
		fruitAndPlantsCategory.add(MenuItemManager.createMenuItem("Red mushroom", "Peace_cloaked", Material.RED_MUSHROOM, (short) 0));
	}

	private void setupMinecraftItemsCategory() {
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Crafting Table", "craftingtable", Material.WORKBENCH, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Chest", "MHF_Chest", Material.CHEST, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Enderchest", "_Brennian", Material.ENDER_CHEST, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Furnace", "NegativeZeroTV", Material.FURNACE, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Hay Bale", "Bendablob", Material.HAY_BLOCK, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Cake", "MHF_Cake", Material.CAKE_BLOCK, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Sideways cake", "Cakeman2014", Material.CAKE_BLOCK, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Jukebox", "C418", Material.JUKEBOX, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Noteblock", "PixelJuke", Material.NOTE_BLOCK, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Eye of ender", "Edna_1", Material.EYE_OF_ENDER, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Water bucket", "TagStarDude", Material.WATER_BUCKET, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Lava bucket", "PocketMines", Material.LAVA_BUCKET, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Milk bucket", "Cxomtdoh", Material.MILK_BUCKET, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Beacon", "elyk0956", Material.BEACON, (short) 0));
		minecraftItemsCategory.add(MenuItemManager.createMenuItem("Mushroom stew", "Tumbolisu", Material.MUSHROOM_SOUP, (short) 0));
	}

	private void setupNetherCategory() {
		netherCategory.add(MenuItemManager.createMenuItem("Netherrack", "Numba_one_stunna", Material.NETHERRACK, (short) 0));
		netherCategory.add(MenuItemManager.createMenuItem("Soulsand", "Njham", Material.SOUL_SAND, (short) 0));
		netherCategory.add(MenuItemManager.createMenuItem("Glowstone", "samstine11", Material.GLOWSTONE, (short) 0));
		netherCategory.add(MenuItemManager.createMenuItem("Netherbrick", "ingo897", Material.NETHER_BRICK, (short) 0));
	}

	private void setupOtherBlocksCategory() {
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Grass block", "MoulaTime", Material.GRASS, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Snowy grass", "Creeper999", Material.SNOW_BLOCK, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Podzol", "PhasePvP", Material.DIRT, (short) 2));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Dirt", "zachman228", Material.DIRT, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Sand", "rugofluk", Material.SAND, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Sandstone", "Praxis8", Material.SANDSTONE, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Red sand", "OmniSulfur", Material.SAND, (short) 1));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Old gravel", "nafi", Material.GRAVEL, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Gravel", "Emilka45", Material.GRAVEL, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Lava", "Spe", Material.LAVA_BUCKET, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Water (1)", "emack0714", Material.WATER_BUCKET, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Water (2)", "H3XR", Material.WATER_BUCKET, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Ice block", "icytouch", Material.ICE, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Sponge", "pomi44", Material.SPONGE, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Clay block", "jkoberna", Material.CLAY, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Brick (1)", "BrickInTheHead", Material.CLAY_BRICK, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Brick (2)", "ThaBrick", Material.CLAY_BRICK, (short) 0));
		otherBlocksCategory.add(MenuItemManager.createMenuItem("Slime block", "Trauwka", Material.SLIME_BALL, (short) 0));
	}

	private void setupPeopleCategory() {
		peopleCategory.add(MenuItemManager.createMenuItem("Troll", "Trollface20", Material.WEB, (short) 0));
		peopleCategory.add(MenuItemManager.createMenuItem("Santa (1)", "Santa314", Material.WOOL, (short) 14));
		peopleCategory.add(MenuItemManager.createMenuItem("Santa (2)", "Kazzykid", Material.WOOL, (short) 14));
		peopleCategory.add(MenuItemManager.createMenuItem("Robot Steve", "RobotHole", Material.SKULL_ITEM, (short) 3));
		peopleCategory.add(MenuItemManager.createMenuItem("C-3PO", "C3PO15", Material.GOLD_BLOCK, (short) 0));
		peopleCategory.add(MenuItemManager.createMenuItem("R2D2", "R2D2", Material.WOOL, (short) 11));
		peopleCategory.add(MenuItemManager.createMenuItem("Storm trooper", "xmrw", Material.WOOL, (short) 0));
		peopleCategory.add(MenuItemManager.createMenuItem("Surgeon", "Marshton", Material.WOOL, (short) 9));
		peopleCategory.add(MenuItemManager.createMenuItem("Jake (Adventure Time)", "gresh123", Material.WOOL, (short) 1));
	}

	private void setupRedstoneCategory() {
		redstoneCategory.add(MenuItemManager.createMenuItem("Redstone block (1)", "LordStrike72", Material.REDSTONE_BLOCK, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Redstone block (2)", "C_Cman", Material.REDSTONE_BLOCK, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Piston", "JL2579", Material.PISTON_BASE, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Sticky piston", "Panda4994", Material.PISTON_STICKY_BASE, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Piston base", "FlyZiii", Material.PISTON_MOVING_PIECE, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Redstone lamp (1)", "AutoSoup", Material.REDSTONE_LAMP_ON, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Redstone lamp (2)", "Jellyfish", Material.REDSTONE_LAMP_ON, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Dispenser (1)", "scemm", Material.DISPENSER, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Dispenser (2)", "DispenserLP", Material.DISPENSER, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Dispenser (3)", "xXSiiKSiiNSXx", Material.DISPENSER, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("TNT (1)", "MHF_TNT", Material.TNT, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("TNT (2)", "MHF_TNT2", Material.TNT, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("TNT (3)", "Eternal", Material.TNT, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Command block (1)", "LoveBug53", Material.COMMAND, (short) 0));
		redstoneCategory.add(MenuItemManager.createMenuItem("Command block (2)", "monkey354", Material.COMMAND, (short) 0));
	}

	private void setupReferencesCategory() {

	}

	private void setupSlimesCategory() {
		slimesCategory.add(MenuItemManager.createMenuItem("Slime", "MHF_Slime", Material.SLIME_BALL, (short) 0));
		slimesCategory.add(MenuItemManager.createMenuItem("Magma cube", "MHF_LavaSlime", Material.MAGMA_CREAM, (short) 0));
		slimesCategory.add(MenuItemManager.createMenuItem("Dark red slime", "inferno800", Material.WOOL, (short) 14));
		slimesCategory.add(MenuItemManager.createMenuItem("Red slime", "AlexSuperHD", Material.WOOL, (short) 14));
		slimesCategory.add(MenuItemManager.createMenuItem("Orange slime", "md_5", Material.WOOL, (short) 1));
		slimesCategory.add(MenuItemManager.createMenuItem("Red/Yellow slime", "Shilo56", Material.WOOL, (short) 4));
		slimesCategory.add(MenuItemManager.createMenuItem("Yellow slime (1)", "scottdang", Material.WOOL, (short) 4));
		slimesCategory.add(MenuItemManager.createMenuItem("Yellow slime (2)", "Wyvern234", Material.WOOL, (short) 4));
		slimesCategory.add(MenuItemManager.createMenuItem("Yellow slime (3)", "drybowser151", Material.WOOL, (short) 4));
		slimesCategory.add(MenuItemManager.createMenuItem("Yellow slime (4)", "nelsyto", Material.WOOL, (short) 4));
		slimesCategory.add(MenuItemManager.createMenuItem("Yellow/Green slime", "netssanchez", Material.WOOL, (short) 5));
		slimesCategory.add(MenuItemManager.createMenuItem("Green slime (1)", "nilaro", Material.WOOL, (short) 5));
		slimesCategory.add(MenuItemManager.createMenuItem("Green slime (2)", "firebot86", Material.WOOL, (short) 5));
		slimesCategory.add(MenuItemManager.createMenuItem("Light cyan slime", "mixa4", Material.WOOL, (short) 9));
		slimesCategory.add(MenuItemManager.createMenuItem("Light blue slime (1)", "IronPigCraft", Material.WOOL, (short) 3));
		slimesCategory.add(MenuItemManager.createMenuItem("Light blue slime (2)", "Sebastiian", Material.WOOL, (short) 3));
		slimesCategory.add(MenuItemManager.createMenuItem("Cyan slime (1)", "redsnow9", Material.WOOL, (short) 9));
		slimesCategory.add(MenuItemManager.createMenuItem("Cyan slime (2)", "zilon1", Material.WOOL, (short) 9));
		slimesCategory.add(MenuItemManager.createMenuItem("Blue slime", "Deathbeam", Material.WOOL, (short) 11));
		slimesCategory.add(MenuItemManager.createMenuItem("Dark blue slime", "troopmaster", Material.WOOL, (short) 11));
		slimesCategory.add(MenuItemManager.createMenuItem("Blue/Gray slime", "ijevin", Material.WOOL, (short) 11));
		slimesCategory.add(MenuItemManager.createMenuItem("Purple slime (1)", "Baecke15", Material.WOOL, (short) 10));
		slimesCategory.add(MenuItemManager.createMenuItem("Purple slime (2)", "wydoo", Material.WOOL, (short) 10));
		slimesCategory.add(MenuItemManager.createMenuItem("Purple slime (3)", "gunju11", Material.WOOL, (short) 10));
		slimesCategory.add(MenuItemManager.createMenuItem("Magenta slime", "NewRequiem", Material.WOOL, (short) 2));
		slimesCategory.add(MenuItemManager.createMenuItem("Pink slime", "Pink__Slime", Material.WOOL, (short) 6));
		slimesCategory.add(MenuItemManager.createMenuItem("White/Blue slime", "Jorichi", Material.WOOL, (short) 0));
		slimesCategory.add(MenuItemManager.createMenuItem("White slime", "solsa", Material.WOOL, (short) 0));
		slimesCategory.add(MenuItemManager.createMenuItem("Gray slime", "JulianClark", Material.WOOL, (short) 7));
		slimesCategory.add(MenuItemManager.createMenuItem("Black slime", "Teminator1311", Material.WOOL, (short) 15));
		slimesCategory.add(MenuItemManager.createMenuItem("Slime with sunglasses", "invalidd", Material.SLIME_BALL, (short) 0));
		slimesCategory.add(MenuItemManager.createMenuItem("Green science slime", "conman234", Material.WOOL, (short) 5));
		slimesCategory.add(MenuItemManager.createMenuItem("Blue science slime", "maximka1221", Material.WOOL, (short) 11));
		slimesCategory.add(MenuItemManager.createMenuItem("Slime with hair", "WyvernHunterZ", Material.SLIME_BALL, (short) 0));
		slimesCategory.add(MenuItemManager.createMenuItem("Gold slime", "Domcame", Material.GOLD_BLOCK, (short) 0));
	}

	private void setupStoneAndOresCategory() {
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Quartz block", "bubbadawg01", Material.QUARTZ_BLOCK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Iron block", "metalhedd", Material.IRON_BLOCK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Lapis block", "whiteliteepic2", Material.LAPIS_BLOCK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Gold block", "teachdaire", Material.GOLD_BLOCK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Diamond block", "Fyspyguy", Material.DIAMOND_BLOCK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Emerald block", "dunkeroni", Material.EMERALD_BLOCK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Redstone ore", "annayirb", Material.REDSTONE_ORE, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Diamond ore", "akaBruce", Material.DIAMOND_ORE, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Emerald ore", "Tereneckla", Material.EMERALD_ORE, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Stone", "Robbydeezle", Material.STONE, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Stone brick", "Cakers", Material.SMOOTH_BRICK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Obsidian", "loiwiol", Material.OBSIDIAN, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Bedrock", "dylansams", Material.BEDROCK, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Old cobblestone", "klington", Material.COBBLESTONE, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Cobblestone", "_Rience", Material.COBBLESTONE, (short) 0));
		stoneAndOresCategory.add(MenuItemManager.createMenuItem("Mossy cobblestone", "Khrenan", Material.MOSSY_COBBLESTONE, (short) 0));
	}

	private void setupWoodCategory() {
		woodCategory.add(MenuItemManager.createMenuItem("Oak log", "MHF_OakLog", Material.LOG, (short) 0));
		woodCategory.add(MenuItemManager.createMenuItem("Spruce log", "Benlisted", Material.LOG, (short) 1));
		woodCategory.add(MenuItemManager.createMenuItem("Dark oak log", "bendablob2", Material.LOG_2, (short) 1));
		woodCategory.add(MenuItemManager.createMenuItem("Jungle log", "Thypthon", Material.LOG, (short) 3));
		woodCategory.add(MenuItemManager.createMenuItem("Mossy log", "Conan420", Material.LOG, (short) 0));
		woodCategory.add(MenuItemManager.createMenuItem("Leaves (1)", "rsfx", Material.LEAVES, (short) 0));
		woodCategory.add(MenuItemManager.createMenuItem("Leaves (2)", "bmpeti", Material.LEAVES, (short) 0));
		woodCategory.add(MenuItemManager.createMenuItem("Leaves (3)", "AlphaPieter", Material.LEAVES, (short) 0));
		woodCategory.add(MenuItemManager.createMenuItem("Dark leaves", "half_bit", Material.LEAVES, (short) 1));
		woodCategory.add(MenuItemManager.createMenuItem("Birch Leaves", "kc33", Material.LEAVES, (short) 2));
		woodCategory.add(MenuItemManager.createMenuItem("Wooden planks", "guung", Material.WOOD, (short) 0));
		woodCategory.add(MenuItemManager.createMenuItem("Bookshelf", "BowAimbot", Material.BOOKSHELF, (short) 0));
	}

	public List<MenuItem> getMainMenu() {
		return mainMenu;
	}

	public List<MenuItem> getExtraHeadsMenu() {
		return extraHeadsMenu;
	}

	public List<MenuItem> getMobsCategory() {
		return mobsCategory;
	}

	public List<MenuItem> getAnimalsCategory() {
		return animalsCategory;
	}

	public List<MenuItem> getChristmasCategory() {
		return christmasCategory;
	}

	public List<MenuItem> getColoredBlocksCategory() {
		return coloredBlocksCategory;
	}

	public List<MenuItem> getDecorationBlocksCategory() {
		return decorationBlocksCategory;
	}

	public List<MenuItem> getDecorationItemsCategory() {
		return decorationItemsCategory;
	}

	public List<MenuItem> getElectronicsCategory() {
		return electronicsCategory;
	}

	public List<MenuItem> getFoodAndDrinksCategory() {
		return foodAndDrinksCategory;
	}

	public List<MenuItem> getFruitAndPlantsCategory() {
		return fruitAndPlantsCategory;
	}

	public List<MenuItem> getMinecraftItemsCategory() {
		return minecraftItemsCategory;
	}

	public List<MenuItem> getNetherCategory() {
		return netherCategory;
	}

	public List<MenuItem> getOtherBlocksCategory() {
		return otherBlocksCategory;
	}

	public List<MenuItem> getPeopleCategory() {
		return peopleCategory;
	}

	public List<MenuItem> getRedstoneCategory() {
		return redstoneCategory;
	}

	public List<MenuItem> getReferencesCategory() {
		return referencesCategory;
	}

	public List<MenuItem> getSlimesCategory() {
		return slimesCategory;
	}

	public List<MenuItem> getStoneAndOresCategory() {
		return stoneAndOresCategory;
	}

	public List<MenuItem> getWoodCategory() {
		return woodCategory;
	}

}
