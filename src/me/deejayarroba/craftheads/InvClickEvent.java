package me.deejayarroba.craftheads;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.HashMap;
import java.util.Map;

public class InvClickEvent implements Listener {

	public static Map<Player, Boolean> isChatTagged = new HashMap<Player, Boolean>();
	MsgManager msg = MsgManager.getInstance();

	@EventHandler
	public void click(InventoryClickEvent event) {
		HumanEntity entity = event.getWhoClicked();
		if ((entity instanceof Player)) {
			Player p = (Player)entity;
//-----------------------------MAIN MENU------------------------------------------------
			if (event.getInventory().getTitle().equals(MainMenu.MenuTitle)) {
				event.setCancelled(true);
				if (event.getCurrentItem().getType() == Material.SKULL_ITEM) {
					Main.giveSkull(p, p.getName(), p.getName());
					msg.good(p, "You now have your own head!");
					p.closeInventory();
				}
				if (event.getCurrentItem().getType() == Material.CAKE) {
					p.closeInventory();
					p.openInventory(MicroblocksHub.microblockMenu);
				}
				if (event.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
					p.closeInventory();
					isChatTagged.put(p, true);
					msg.good(p, "Type the username of the head in chat!");
				}
				else {
					return;
				}
			}
//-----------------------------MICROBLOCKS HUB------------------------------------------
			if (event.getInventory().getTitle().equals(MicroblocksHub.MenuTitle)) {
				event.setCancelled(true);
				if (event.getCurrentItem().getType() == Material.GRASS) {
					p.closeInventory();
					p.openInventory(BlocksMenu.menu);
				}
				if (event.getCurrentItem().getType() == Material.BOW) {
					p.closeInventory();
					p.openInventory(MobMenu.menu);
				}
				if (event.getCurrentItem().getType() == Material.TNT) {
					p.closeInventory();
					p.openInventory(BonusMenu.menu);
				}
				else {
					return;
				}
			}
//-----------------------------BLOCKS MENU----------------------------------------------
			if (event.getInventory().getTitle().equals(BlocksMenu.MenuTitle)) {
				event.setCancelled(true);
				if (event.getCurrentItem().getType() == Material.SKULL_ITEM) {
					String itemName = event.getCurrentItem().getItemMeta().getDisplayName();
					Main.giveSkull(p, BlocksMenu.headList.get(itemName), itemName);
					char first = itemName.charAt(2);
					if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
						msg.good(p, "You now have an " + itemName + ChatColor.GREEN + " head!");
					} else msg.good(p, "You now have a " + itemName + ChatColor.GREEN + " head!");
					p.closeInventory();
				}
				else return;
			}
//-----------------------------MOBS MENU----------------------------------------------
			if (event.getInventory().getTitle().equals(MobMenu.MenuTitle)) {
				event.setCancelled(true);
				if (event.getCurrentItem().getType() == Material.SKULL_ITEM) {
					String itemName = event.getCurrentItem().getItemMeta().getDisplayName();
					Main.giveSkull(p, MobMenu.headList.get(itemName), itemName);
					char first = itemName.charAt(2);
					if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
						msg.good(p, "You now have an " + itemName + ChatColor.GREEN + " head!");
					} else msg.good(p, "You now have a " + itemName + ChatColor.GREEN + " head!");
					p.closeInventory();
				}
				else return;

			}
//-----------------------------BONUS MENU----------------------------------------------
			if (event.getInventory().getTitle().equals(BonusMenu.MenuTitle)) {
				event.setCancelled(true);
				if (event.getCurrentItem().getType() == Material.SKULL_ITEM) {
					String itemName = event.getCurrentItem().getItemMeta().getDisplayName();
					Main.giveSkull(p, BonusMenu.headList.get(itemName), itemName);
					char first = itemName.charAt(2);
					if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
						msg.good(p, "You now have an " + itemName + ChatColor.GREEN + " head!");
					} else msg.good(p, "You now have a " + itemName + ChatColor.GREEN + " head!");
					p.closeInventory();
				}
			} else return;
		}
	}

}
