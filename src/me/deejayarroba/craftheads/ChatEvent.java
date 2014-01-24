package me.deejayarroba.craftheads;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

	MsgManager msg = MsgManager.getInstance();

	@EventHandler
	public void onChatEvent(AsyncPlayerChatEvent e) {
		if (InvClickEvent.isChatTagged.containsKey(e.getPlayer())) {
			if(InvClickEvent.isChatTagged.get(e.getPlayer())){
				if (e.getMessage().contains(" ")){
					e.setCancelled(true);
					msg.bad(e.getPlayer(), "That's not a valid user, type the username again!");
				} else {
					Main.giveSkull(e.getPlayer(), e.getMessage(), e.getMessage());
					msg.good(e.getPlayer(), "You now have " + ChatColor.AQUA + e.getMessage() + ChatColor.GREEN + "'s head!");
					InvClickEvent.isChatTagged.put(e.getPlayer(), false);
					e.setCancelled(true);
				}

			}
		}
	}
}