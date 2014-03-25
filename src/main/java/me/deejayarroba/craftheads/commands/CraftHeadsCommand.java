package me.deejayarroba.craftheads.commands;

import me.deejayarroba.craftheads.util.AbstractCommand;
import me.deejayarroba.craftheads.util.MessageManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CraftHeadsCommand extends AbstractCommand {

	MessageManager msg = MessageManager.getInstance();

	public CraftHeadsCommand(String command, String usage, String description) {
		super(command, usage, description);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("craftheads") && sender.hasPermission("craftheads.use")) {
			if (sender instanceof Player) {
				Player s = (Player) sender;
				if (args.length > 0) {
					msg.bad(s, "You don't need any arguments!");
					return true;
				} else {
					// Open the menu here
					//s.openInventory(InvClickEvent.mainMenu.getInventory());
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
