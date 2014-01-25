package me.deejayarroba.craftheads;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin implements Listener {

	static MainMenu mainMenu = new MainMenu();
	static MsgManager msg = MsgManager.getInstance();

	@Override
	public void onEnable() {
		getConfig().addDefault("auto-update", true);
		getConfig().addDefault("update-check", true);
		getConfig().addDefault("metrics", true);
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		if(getConfig().getBoolean("update-check")) {
			if (getConfig().getBoolean("auto-update")) {
				Updater updater = new Updater(this, 70538, this.getFile(), Updater.UpdateType.DEFAULT, true);
			} else {
				Updater updater = new Updater(this, 70538, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false);
				Updater.UpdateResult result = updater.getResult();
				if (result == Updater.UpdateResult.UPDATE_AVAILABLE) {
					getLogger().info("An update for CraftHeads is available");
				}
			}
		}
		if(getConfig().getBoolean("metrics")) {
			try {
				Metrics metrics = new Metrics(this);
				metrics.start();
			} catch (IOException e) {
				System.out.println("Failed to send metrics data");
			}
		}
		getServer().getPluginManager().registerEvents(new InvClickEvent(), this);
		getServer().getPluginManager().registerEvents(new ChatEvent(), this);
		getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {
		InvClickEvent.mobMenu = null;
		InvClickEvent.mainMenu = null;
		InvClickEvent.bonusMenu = null;
		InvClickEvent.extraHeads = null;
		InvClickEvent.blocksMenu = null;
		mainMenu = null;
	}

	public static void giveSkull(Player p, String skullOwner, String itemName) {
		ItemStack skullItem = new ItemStack(Material.SKULL_ITEM);
		skullItem.setDurability((short) 3);
		SkullMeta skullMeta = (SkullMeta) skullItem.getItemMeta();
		skullMeta.setOwner(skullOwner);
		skullMeta.setDisplayName(ChatColor.GREEN + "Head: " + ChatColor.AQUA + itemName);
		skullItem.setItemMeta(skullMeta);
		p.getInventory().addItem(skullItem);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("craftheads") && sender.hasPermission("craftheads.use")) {
			if (sender instanceof Player) {
				Player s = (Player) sender;
				if (args.length > 0) {
					msg.bad(s, "You don't need any arguments!");
					return true;
				} else {
					// Open the menu here
					s.openInventory(mainMenu.getMenu());
					return true;
				}
			} else {
				sender.sendMessage("You can only run this command as a player.");
				return true;
			}
		}
		return false;
	}

	public void updateNotice(Player p) {
		if(getConfig().getBoolean("update-check")) {
			if (!getConfig().getBoolean("auto-update")) {
				if (p.hasPermission("craftheads.updater") || p.isOp()) {
					Updater updater = new Updater(this, 70538, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false);
					Updater.UpdateResult result = updater.getResult();
					if (result == Updater.UpdateResult.UPDATE_AVAILABLE) {
						msg.info(p, "An update is available for CraftHeads. Get it here: " + updater.getLatestFileLink());
					}
				}
			}
		}
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		updateNotice(e.getPlayer());
	}
}
