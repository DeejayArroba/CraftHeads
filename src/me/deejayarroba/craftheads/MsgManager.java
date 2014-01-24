package me.deejayarroba.craftheads;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MsgManager {

	String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "CraftHeads" + ChatColor.DARK_GRAY + "] " + ChatColor.RESET;

	private MsgManager() { }

	private static MsgManager instance = new MsgManager();

	public static MsgManager getInstance() {
		return instance;
	}

	public void info(Player p, String msg) {
		msg(p, ChatColor.YELLOW, msg);
	}

	public void good(Player p, String msg) {
		msg(p, ChatColor.GREEN, msg);
	}

	public void bad(Player p, String msg) {
		msg(p, ChatColor.RED, msg);
	}

	public void msg(Player p, ChatColor color, String msg) {

		p.sendMessage(prefix + color + msg);

	}
}
