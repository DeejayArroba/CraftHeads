package me.deejayarroba.craftheads.menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuItem {

	private Material material;
	private String name;
	private short itemStackDurability;
	private MenuItemAction action;

	public MenuItem(String name, Material material, short itemStackDurability, MenuItemAction action) {
		this.material = material;
		this.name = ChatColor.AQUA + name;
		this.itemStackDurability = itemStackDurability;
		this.action = action;
	}

	public ItemStack getItemStack() {
		ItemStack itemStack = new ItemStack(material, 1);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(name);
		itemStack.setItemMeta(itemMeta);
		itemStack.setDurability(itemStackDurability);
		return itemStack;
	}

	public String getName() {
		return name;
	}

	public void executeAction(Player p) {
		action.click(p);
	}

}
