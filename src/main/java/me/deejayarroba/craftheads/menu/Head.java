package me.deejayarroba.craftheads.menu;

import me.deejayarroba.craftheads.util.HeadUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Head {

	private Material material;
	private String name;
	private String headName;
	private short damage;
	private boolean safe;

	HeadUtil headUtil = HeadUtil.getInstance();

	public Head(String name, String headName, Material material, short damage, boolean safe) {
		this.material = material;
		this.name = ChatColor.AQUA + name;
		this.headName = headName;
		this.damage = damage;
		this.safe = safe;
	}

	public Head(String name, String headName, Material material, short damage) {
		this.material = material;
		this.name = ChatColor.AQUA + name;
		this.headName = headName;
		this.damage = damage;
		this.safe = false;
	}

	public ItemStack getItemStack() {
		ItemStack itemStack = new ItemStack(material, 1, damage);
		ItemMeta itemMeta = itemStack.getItemMeta();

		itemMeta.setDisplayName(name);
		if (safe)
			itemMeta.setLore(Arrays.asList(ChatColor.ITALIC + "" + ChatColor.GREEN + "Safe"));
		itemStack.setItemMeta(itemMeta);

		return itemStack;
	}

	public String getHeadName() {
		return headName;
	}

	public String getName() {
		return name;
	}

	public void executeAction(Player p) {
		headUtil.giveHead(p, headName, name);
	}

}
