package me.deejayarroba.craftheads.menu.menus;

import me.deejayarroba.craftheads.menu.Menu;
import me.deejayarroba.craftheads.menu.MenuItemAction;
import me.deejayarroba.craftheads.util.HeadUtil;
import me.deejayarroba.craftheads.util.MessageManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class MainMenu extends Menu {

	HeadUtil headUtil = HeadUtil.getInstance();
	MessageManager msg = MessageManager.getInstance();

	public MainMenu(String name, Material material, short damage) {
		super(name, material, damage);
	}

	@Override
	public void setup() {
		add("Get your own head!", Material.SKULL_ITEM, (short) 2, 2, new MenuItemAction() {
			@Override
			public void click(Player p) {
				headUtil.giveHead(p, p.getName(), p.getName());
				msg.good(p, "Here's your own head!");
			}
		});

		add("Extra heads!", Material.CAKE, (short) 0, 4, new MenuItemAction() {
			@Override
			public void click(Player p) {

			}
		});

		add("Get someone else's head!", Material.GOLDEN_APPLE, (short) 0, 6, new MenuItemAction() {
			@Override
			public void click(Player p) {

			}
		});
	}

}
