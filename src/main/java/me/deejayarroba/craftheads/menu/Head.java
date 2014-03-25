package me.deejayarroba.craftheads.menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Head {

	private Material material;
	private String name;
	private String headName;
	private short itemStackDurability;
	private boolean safe;

	public Head(String name, String headName, Material material, short itemStackDurability, boolean safe) {
		this.material = material;
		this.name = ChatColor.AQUA + name;
		this.headName = headName;
		this.itemStackDurability = itemStackDurability;
		this.safe = safe;
	}

	public Head(String name, String headName, Material material, short itemStackDurability) {
		this.material = material;
		this.name = ChatColor.AQUA + name;
		this.headName = headName;
		this.itemStackDurability = itemStackDurability;
		this.safe = false;
	}

	public ItemStack getItemStack() {
		ItemStack itemStack = new ItemStack(material, 1);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(name);
		itemStack.setItemMeta(itemMeta);
		itemStack.setDurability(itemStackDurability);
		return itemStack;
	}

	public String getHeadName() {
		return headName;
	}

	public String getName() {
		return name;
	}

}
