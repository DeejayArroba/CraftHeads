package me.deejayarroba.craftheads;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuItem {

	private Material material;
	private String name;
	private String headName;
	private short itemStackDurability;

	public MenuItem(String name, String headName, Material material, short itemStackDurability) {
		this.material = material;
		this.name = name;
		this.headName = headName;
		this.itemStackDurability = itemStackDurability;
	}

	public ItemStack getItemStack() {
		ItemStack itemStack = new ItemStack(material, 1);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName("" + name);
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
