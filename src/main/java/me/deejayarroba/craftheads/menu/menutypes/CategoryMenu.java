package me.deejayarroba.craftheads.menu.menutypes;

import me.deejayarroba.craftheads.Main;
import me.deejayarroba.craftheads.menu.Menu;
import me.deejayarroba.craftheads.menu.MenuItem;
import me.deejayarroba.craftheads.menu.MenuItemAction;
import me.deejayarroba.craftheads.skulls.Skulls;
import me.deejayarroba.craftheads.util.Items;
import me.deejayarroba.craftheads.util.MessageManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class CategoryMenu extends Menu {

	JSONObject category;
	MessageManager msg = MessageManager.getInstance();

	public CategoryMenu(JSONObject category) {
		this.category = category;
		name = (String) category.get("Name");
		menuItems = new ArrayList<>();



		JSONArray heads = (JSONArray) category.get("Heads");

		for (Object o : heads) {
			final JSONObject head = (JSONObject) o;
			final float price = (long) head.get("Price") > 0 ? (long) head.get("Price"): Main.defaultHeadPrice;

			Items.ItemStackBuilder itemStackBuilder = Items.editor(Skulls.getCustomSkull((String) head.get("URL")))
					.setName(ChatColor.AQUA + "" + ChatColor.BOLD + head.get("Name"));

			if(Main.economy != null) {
				if(price > 0) {
					itemStackBuilder.addLore(ChatColor.AQUA + "Price: " + ChatColor.GREEN + price);
				} else {
					itemStackBuilder.addLore(ChatColor.AQUA + "Price: " + ChatColor.GREEN + "FREE");
				}
			}

			final ItemStack itemStack = itemStackBuilder.build();

			menuItems.add(new MenuItem(itemStack, new MenuItemAction() {
				@Override
				public void execute(Player p) {
					ItemStack headItem = Items.editor(Skulls.getCustomSkull((String) head.get("URL")))
							.setName(ChatColor.GOLD + "Head: " + ChatColor.AQUA + head.get("Name"))
							.build();

					if(Main.economy != null) {
						double balance = Main.economy.getBalance(p);
						if(balance < price) {
							// Player can't afford the head
							msg.bad(p, "You can't afford that head!");
							return;
						}
					}
					// If the inventory is full
					if(p.getInventory().firstEmpty() == -1) {
						msg.bad(p, "Your inventory is full!");
					} else {
						if(Main.economy != null && price > 0) {
							// Player can afford the head
							Main.economy.withdrawPlayer(p, price);
							msg.good(p, "You bought a head for " + ChatColor.AQUA + price);
						}
						p.getInventory().addItem(headItem);
						msg.good(p, "You now have: " + itemStack.getItemMeta().getDisplayName());
					}
				}
			}
			));
		}

		placeItems();

	}

	public JSONObject getCategory() {
		return category;
	}

}
