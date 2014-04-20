package me.deejayarroba.craftheads.util;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class ChatUtil {

	private List<String> requestingHead = new ArrayList<String>();
	private static ChatUtil instance = new ChatUtil();

	public boolean isRequestingHead(Player p) {
		return requestingHead.contains(p.getName());
	}

	public void setRequestingHead(Player p, boolean requesting) {
		if (requesting) {
			if (!requestingHead.contains(p.getName()))
				requestingHead.add(p.getName());
		} else {
			requestingHead.remove(p.getName());
		}
	}

	public static ChatUtil getInstance() {
		return instance;
	}

}
