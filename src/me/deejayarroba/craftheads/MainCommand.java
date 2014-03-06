package me.deejayarroba.craftheads;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommand implements CommandExecutor {

	static MsgManager msg = MsgManager.getInstance();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("craftheads") && sender.hasPermission("craftheads.use")) {
			if (sender instanceof Player) {
				Player s = (Player) sender;
				if (args.length > 0) {
					msg.bad(s, "You don't need any arguments!");
					return true;
				} else {
					// Open the menu here
					s.openInventory(InvClickEvent.mainMenu.getInventory());
					return true;
				}
			} else {
				sender.sendMessage("You can only run this command as a player.");
				return true;
			}
		}
		return false;
	}

}
