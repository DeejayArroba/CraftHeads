package me.deejayarroba.craftheads.listeners;

import me.deejayarroba.craftheads.menu.*;
import me.deejayarroba.craftheads.util.MessageManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InvClickEvent implements Listener {

	MessageManager msg = MessageManager.getInstance();

	@EventHandler
	public void click(InventoryClickEvent event) {
		Player p = (Player) event.getWhoClicked();
		Inventory inventory = event.getInventory();
		ItemStack clickedItem = event.getCurrentItem();



		// Check if the inventory is the menu
		if(MenuManager.getMenu(inventory) != null) {
			// Cancel the event to prevent the user from placing an item in the menu
			event.setCancelled(true);
			Menu menu = MenuManager.getMenu(inventory);


			if (clickedItem != null && clickedItem.getType() != Material.AIR) {
				// Check if the menu contains the clicked item
				if(menu.getInventory().contains(clickedItem)) {
					MenuItem menuItem = menu.getMenuItem(clickedItem);
					// Execute the menu item's action
					menuItem.executeAction(p);
				}
			}

		}

	}
}
