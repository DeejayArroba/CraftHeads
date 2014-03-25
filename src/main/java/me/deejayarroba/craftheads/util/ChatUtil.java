package me.deejayarroba.craftheads.util;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class ChatUtil {

	private Map<String, Boolean> requestingHead = new HashMap<String, Boolean>();
	private static ChatUtil instance = new ChatUtil();

	public boolean isRequestingHead(Player p) {
		return requestingHead.get(p.getName());
	}

	public void setRequestingHead(Player p, boolean requesting) {
		requestingHead.put(p.getName(), requesting);
	}

	public static ChatUtil getInstance() {
		return instance;
	}

}
