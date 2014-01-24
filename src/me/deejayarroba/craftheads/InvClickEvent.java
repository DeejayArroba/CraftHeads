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

	static MainMenu mainMenu = new MainMenu();
	static ExtraHeads extraHeads = new ExtraHeads();
	static BlocksMenu blocksMenu = new BlocksMenu();
	static MobMenu mobMenu = new MobMenu();
	static BonusMenu bonusMenu = new BonusMenu();

	@EventHandler
	public void click(InventoryClickEvent event) {
		HumanEntity entity = event.getWhoClicked();
		if (entity instanceof Player) {
			Player p = (Player)entity;
//-----------------------------MAIN MENU------------------------------------------------
			if (event.getInventory().getTitle().equals(mainMenu.getMenuTitle())) {
				event.setCancelled(true);
				if (event.getCurrentItem().getType() == Material.SKULL_ITEM) {
					Main.giveSkull(p, p.getName(), p.getName());
					msg.good(p, "You now have your own head!");
					p.closeInventory();
				}
				if (event.getCurrentItem().getType() == Material.CAKE) {
					p.closeInventory();
					p.openInventory(extraHeads.getMenu());
				}
				if (event.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
					p.closeInventory();
					isChatTagged.put(p, true);
					msg.good(p, "Type the username of the head in chat! (case sensitive)");
				}
				else {
					return;
				}
			}
//-----------------------------MICROBLOCKS HUB------------------------------------------
			if (event.getInventory().getTitle().equals(extraHeads.getMenuTitle())) {
				event.setCancelled(true);
				if (event.getCurrentItem().getType() == Material.GRASS) {
					p.closeInventory();
					p.openInventory(blocksMenu.getMenu());
				}
				if (event.getCurrentItem().getType() == Material.BOW) {
					p.closeInventory();
					p.openInventory(mobMenu.getMenu());
				}
				if (event.getCurrentItem().getType() == Material.TNT) {
					p.closeInventory();
					p.openInventory(bonusMenu.getMenu());
				}
				else {
					return;
				}
			}
//-----------------------------BLOCKS MENU----------------------------------------------
			if (event.getInventory().getTitle().equals(blocksMenu.getMenuTitle())) {
				MenuItem menuItem = blocksMenu.getManager().getMenuItem(event.getCurrentItem().getItemMeta().getDisplayName());
				if(menuItem != null) {
					char first = menuItem.getName().charAt(2);
					Main.giveSkull(p, menuItem.getHeadName(), menuItem.getName());

					if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
						msg.good(p, "You now have an " + menuItem.getName() + ChatColor.GREEN + " head!");
					} else msg.good(p, "You now have a " + menuItem.getName() + ChatColor.GREEN + " head!");
					p.closeInventory();
				}
				event.setCancelled(true);
				menuItem = null;
			}
//-----------------------------MOBS MENU----------------------------------------------
			if (event.getInventory().getTitle().equals(mobMenu.getMenuTitle())) {
				MenuItem menuItem = mobMenu.getManager().getMenuItem(event.getCurrentItem().getItemMeta().getDisplayName());
				if(menuItem != null) {
					char first = menuItem.getName().charAt(2);
					Main.giveSkull(p, menuItem.getHeadName(), menuItem.getName());
					if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
						msg.good(p, "You now have an " + menuItem.getName() + ChatColor.GREEN + " head!");
					} else msg.good(p, "You now have a " + menuItem.getName() + ChatColor.GREEN + " head!");
					p.closeInventory();
				}
				event.setCancelled(true);
				menuItem = null;
			}
//-----------------------------BONUS MENU----------------------------------------------
			if (event.getInventory().getTitle().equals(bonusMenu.getMenuTitle())) {
				MenuItem menuItem = bonusMenu.getManager().getMenuItem(event.getCurrentItem().getItemMeta().getDisplayName());
				if(menuItem != null) {
					char first = menuItem.getName().charAt(2);
					Main.giveSkull(p, menuItem.getHeadName(), menuItem.getName());
					if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
						msg.good(p, "You now have an " + menuItem.getName() + ChatColor.GREEN + " head!");
					} else msg.good(p, "You now have a " + menuItem.getName() + ChatColor.GREEN + " head!");
					p.closeInventory();
				}
				event.setCancelled(true);
				menuItem = null;
			}
		}
	}

}
