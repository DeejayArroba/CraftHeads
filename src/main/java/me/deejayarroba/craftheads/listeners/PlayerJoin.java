package me.deejayarroba.craftheads.listeners;

import me.deejayarroba.craftheads.util.UpdateUtil;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		UpdateUtil.getInstance().updateNotice(e.getPlayer());
	}

}
