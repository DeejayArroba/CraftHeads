package me.deejayarroba.craftheads.menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuItem {

	private Material material;
	private String name;
	private short damage;
	private MenuItemAction action;

	public MenuItem(String name, Material material, short damage, MenuItemAction action) {
		this.material = material;
		this.name = ChatColor.AQUA + name;
		this.damage = damage;
		this.action = action;
	}

	public ItemStack getItemStack() {
		ItemStack itemStack = new ItemStack(material, 1, damage);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(name);
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}

	public String getName() {
		return name;
	}

	public void executeAction(Player p) {
		action.click(p);
	}

}
