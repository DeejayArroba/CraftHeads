package me.deejayarroba.craftheads.menu.menus;

import me.deejayarroba.craftheads.menu.Menu;
import me.deejayarroba.craftheads.menu.MenuItemAction;
import me.deejayarroba.craftheads.menu.MenuManager;
import me.deejayarroba.craftheads.util.ChatUtil;
import me.deejayarroba.craftheads.util.HeadUtil;
import me.deejayarroba.craftheads.util.MessageManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class MainMenu extends Menu {

	HeadUtil headUtil = HeadUtil.getInstance();
	ChatUtil chatUtil = ChatUtil.getInstance();
	MessageManager msg = MessageManager.getInstance();
	MenuManager menuManager;
	private Plugin plugin = Bukkit.getPluginManager().getPlugin("CraftHeads");

	public MainMenu(String name, Material material, short damage) {
		super(name, material, damage);
		menuManager = MenuManager.getInstance();
	}

	@Override
	public void setup() {
		add("Get your own head!", Material.SKULL_ITEM, (short) 3, 2, new MenuItemAction() {
			@Override
			public void click(Player p) {
				headUtil.giveHead(p, p.getName(), p.getName());
				msg.good(p, "Here's your own head!");
			}
		});

		add("Extra heads", Material.CAKE, (short) 0, 4, new MenuItemAction() {
			@Override
			public void click(Player p) {
				menuManager = MenuManager.getInstance();
				if (menuManager.getMenu("Extra heads") != null) {
					p.openInventory(menuManager.getMenu("Extra heads").getInventory());
				}
			}
		});

		add("Get someone else's head", Material.GOLDEN_APPLE, (short) 0, 6, new MenuItemAction() {
			@Override
			public void click(final Player p) {
				msg.good(p, "Type the username of the player's head in chat!");
				msg.good(p, "This request will expire in 30 seconds.");
				chatUtil.setRequestingHead(p, true);
				Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
					@Override
					public void run() {
						msg.info(p, "Head request expired!");
						chatUtil.setRequestingHead(p, false);
					}
				}, 30 * 20);
			}
		});
	}

}
