package me.deejayarroba.craftheads.listeners;

import me.deejayarroba.craftheads.menu.*;
import me.deejayarroba.craftheads.util.MessageManager;
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
		MenuManager menuManager = MenuManager.getInstance();
		CategoryManager categoryManager = CategoryManager.getInstance();

		Menu menu = menuManager.getMenu(inventory.getTitle());
		MenuItem menuItem = menu.getMenuItem(clickedItem.getItemMeta().getDisplayName());

		Category category = categoryManager.getCategory(inventory.getTitle());
		Head head = category.getHead(clickedItem.getItemMeta().getDisplayName());

		if (menu != null)
			if (menuItem != null)
				menuItem.executeAction(p);

		if (category != null)
			if (head != null)
				head.executeAction(p);

	}
}
