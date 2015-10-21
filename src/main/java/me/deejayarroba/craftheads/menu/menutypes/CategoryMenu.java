package me.deejayarroba.craftheads.menu.menutypes;

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
import java.util.function.Consumer;

public class CategoryMenu extends Menu {

	JSONObject category;
	MessageManager msg = MessageManager.getInstance();

	public CategoryMenu(JSONObject category) {
		this.category = category;
		name = (String) category.get("Name");
		menuItems = new ArrayList<>();



		JSONArray heads = (JSONArray) category.get("Heads");
		heads.forEach(new Consumer() {
			@Override
			public void accept(Object o) {
				final JSONObject head = (JSONObject) o;
				final ItemStack itemStack = Items.editor(Skulls.getCustomSkull((String) head.get("URL")))
						.setName(ChatColor.AQUA + (String) head.get("Name"))
						.build();

				menuItems.add(new MenuItem(itemStack,
						new MenuItemAction() {
							@Override
							public void execute(Player p) {
								ItemStack headItem = Items.editor(Skulls.getCustomSkull((String) head.get("URL")))
										.setName(ChatColor.GOLD + "Head: " + ChatColor.AQUA + head.get("Name"))
										.build();

								// If the inventory is full
								if(p.getInventory().firstEmpty() == -1) {
									msg.bad(p, "Your inventory is full!");
								} else {
									p.getInventory().addItem(headItem);
									msg.good(p, "You now have: " + itemStack.getItemMeta().getDisplayName());
								}
							}
						}
				));
			}
		});

		placeItems();

	}

	public JSONObject getCategory() {
		return category;
	}

}
