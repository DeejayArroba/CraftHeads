package me.deejayarroba.craftheads;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class InvClickEvent implements Listener {

	public static Map<Player, Boolean> isChatTagged = new HashMap<Player, Boolean>();
	MsgManager msg = MsgManager.getInstance();
	static MenuManager menuManager = new MenuManager();

	static Menu mainMenu = menuManager.createMenu("CraftHeads menu", menuManager.getMainMenu());
	Menu extraHeadsMenu = menuManager.createMenu("Extra heads", menuManager.getExtraHeadsMenu());

	Menu mobsCategory = menuManager.createMenu("Mobs category", menuManager.getMobsCategory());
	Menu animalsCategory = menuManager.createMenu("Animals category", menuManager.getAnimalsCategory());
	Menu christmasCategory = menuManager.createMenu("Christmas category", menuManager.getChristmasCategory());
	Menu coloredBlocksCategory = menuManager.createMenu("Colored blocks category", menuManager.getColoredBlocksCategory());
	Menu decorationBlocksCategory = menuManager.createMenu("Decoration blocks category", menuManager.getDecorationBlocksCategory());
	Menu decorationItemsCategory = menuManager.createMenu("Decoration items category", menuManager.getDecorationItemsCategory());
	Menu electronicsCategory = menuManager.createMenu("Electronics category", menuManager.getElectronicsCategory());
	Menu foodAndDrinksCategory = menuManager.createMenu("Food and drinks category", menuManager.getFoodAndDrinksCategory());
	Menu fruitAndPlantsCategory = menuManager.createMenu("Fruit and plants category", menuManager.getFruitAndPlantsCategory());
	Menu minecraftItemsCategory = menuManager.createMenu("Minecraft items category", menuManager.getMinecraftItemsCategory());
	Menu netherCategory = menuManager.createMenu("Nether category", menuManager.getNetherCategory());
	Menu otherBlocksCategory = menuManager.createMenu("Other blocks category", menuManager.getOtherBlocksCategory());
	Menu peopleCategory = menuManager.createMenu("People category", menuManager.getPeopleCategory());
	Menu redstoneCategory = menuManager.createMenu("Redstone category", menuManager.getRedstoneCategory());
	Menu slimesCategory = menuManager.createMenu("Slimes category", menuManager.getSlimesCategory());
	Menu stoneAndOresCategory = menuManager.createMenu("Stone and ores category", menuManager.getStoneAndOresCategory());
	Menu woodCategory = menuManager.createMenu("Wood category", menuManager.getWoodCategory());

	@EventHandler
	public void click(InventoryClickEvent event) {
		HumanEntity entity = event.getWhoClicked();
		if (entity instanceof Player) {
			Player p = (Player) entity;

			Inventory inventory = event.getInventory();
			ItemStack clickedItem = event.getCurrentItem();

			for (Menu menu : menuManager.getMenus()) {
				if (inventory.getTitle() == menu.getName()) {
					for (MenuItem menuItem : menu.getMenuItems()) {
						//if (clickedItem.getItemMeta().getDisplayName().equals(menuItem.getItemStack().getItemMeta().getDisplayName())) {
						if (true) {
							if (clickedItem.getType() == menuItem.getItemStack().getType()) {

								if (menu.getName() == mainMenu.getName()) {
									event.setCancelled(true);
									if (clickedItem.getType() == Material.SKULL_ITEM) {
										Main.giveSkull(p, p.getName(), p.getName());
										msg.good(p, "You now have your own head!");
										p.closeInventory();
										return;
									}
									if (event.getCurrentItem().getType() == Material.CAKE) {
										p.closeInventory();
										p.openInventory(extraHeadsMenu.getInventory());
										return;
									}
									if (event.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
										p.closeInventory();
										isChatTagged.put(p, true);
										msg.good(p, "Type the username of the head in chat! (case sensitive)");
										return;
									}
								}

								if (menu.getName() == extraHeadsMenu.getName()) {
									event.setCancelled(true);
									if (clickedItem.getType() == Material.WOOD) {
										p.closeInventory();
										p.openInventory(woodCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.STONE) {
										p.closeInventory();
										p.openInventory(stoneAndOresCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.SPONGE) {
										p.closeInventory();
										p.openInventory(otherBlocksCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.IRON_PICKAXE) {
										p.closeInventory();
										p.openInventory(minecraftItemsCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.REDSTONE_BLOCK) {
										p.closeInventory();
										p.openInventory(redstoneCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.NETHERRACK) {
										p.closeInventory();
										p.openInventory(netherCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.SLIME_BALL) {
										p.closeInventory();
										p.openInventory(slimesCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.MONSTER_EGG) {
										p.closeInventory();
										p.openInventory(mobsCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.COOKED_BEEF) {
										p.closeInventory();
										p.openInventory(foodAndDrinksCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.APPLE) {
										p.closeInventory();
										p.openInventory(fruitAndPlantsCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.DIODE) {
										p.closeInventory();
										p.openInventory(electronicsCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.BED) {
										p.closeInventory();
										p.openInventory(decorationBlocksCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.RAW_FISH) {
										p.closeInventory();
										p.openInventory(decorationItemsCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.WOOL) {
										p.closeInventory();
										p.openInventory(coloredBlocksCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.SKULL_ITEM) {
										p.closeInventory();
										p.openInventory(peopleCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.SNOW_BLOCK) {
										p.closeInventory();
										p.openInventory(christmasCategory.getInventory());
										return;
									} else if (clickedItem.getType() == Material.BONE) {
										p.closeInventory();
										p.openInventory(animalsCategory.getInventory());
										return;
									}
								}

								event.setCancelled(true);
								Main.giveSkull(p, menuItem.getHeadName(), menuItem.getName());

							}
						}
					}
				}
			}
		}
	}

}
