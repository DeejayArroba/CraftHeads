package me.deejayarroba.craftheads.listeners;

import me.deejayarroba.craftheads.util.ChatUtil;
import me.deejayarroba.craftheads.util.HeadUtil;
import me.deejayarroba.craftheads.util.MessageManager;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

	MessageManager msg = MessageManager.getInstance();
	ChatUtil chatUtil = ChatUtil.getInstance();
	HeadUtil headUtil = HeadUtil.getInstance();

	@EventHandler
	public void onChatEvent(AsyncPlayerChatEvent e) {
		if (chatUtil.isRequestingHead(e.getPlayer())) {
			if (e.getMessage().contains(" ")) {
				e.setCancelled(true);
				msg.bad(e.getPlayer(), "That's not a valid user, type the username again!");
			} else {
				headUtil.giveHead(e.getPlayer(), e.getMessage(), e.getMessage());
				msg.good(e.getPlayer(), "You now have " + ChatColor.AQUA + e.getMessage() + ChatColor.GREEN + "'s head!");
				chatUtil.setRequestingHead(e.getPlayer(), false);
				e.setCancelled(true);
			}

		}
	}
}