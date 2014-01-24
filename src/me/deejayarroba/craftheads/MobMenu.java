package me.deejayarroba.craftheads;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class MobMenu {

	public static String MenuTitle = "Mob heads";
	public static Inventory menu = null;

	public static Map<String, String> headList = new HashMap<String, String>();

	public static void createHeads() {
		headList.clear();
		headList.put(ChatColor.AQUA + "Blaze", "MHF_Blaze");
		headList.put(ChatColor.AQUA + "Cave Spider", "MHF_CaveSpider");
		headList.put(ChatColor.AQUA + "Chicken", "MHF_Chicken");
		headList.put(ChatColor.AQUA + "Cow", "MHF_Cow");
		headList.put(ChatColor.AQUA + "Enderman", "MHF_Enderman");
		headList.put(ChatColor.AQUA + "Ghast", "MHF_Ghast");
		headList.put(ChatColor.AQUA + "Iron golem", "MHF_Golem");
		headList.put(ChatColor.AQUA + "Herobrine", "MHF_Herobrine");
		headList.put(ChatColor.AQUA + "Magma Cube", "MHF_LavaSlime");
		headList.put(ChatColor.AQUA + "Mooshroom", "MHF_MushroomCow");
		headList.put(ChatColor.AQUA + "Ocelot", "MHF_Ocelot");
		headList.put(ChatColor.AQUA + "Pig", "MHF_Pig");
		headList.put(ChatColor.AQUA + "Zombie Pigman", "MHF_PigZombie");
		headList.put(ChatColor.AQUA + "Sheep", "MHF_Sheep");
		headList.put(ChatColor.AQUA + "Slime", "MHF_Slime");
		headList.put(ChatColor.AQUA + "Spider", "MHF_Spider");
		headList.put(ChatColor.AQUA + "Squid", "MHF_Squid");
		headList.put(ChatColor.AQUA + "Squid 2", "Comcastt");
		headList.put(ChatColor.AQUA + "Villager", "MHF_Villager");
		headList.put(ChatColor.AQUA + "Wither", "MHF_Wither");
		headList.put(ChatColor.AQUA + "Witch", "awesome10987");
	}

	public static void createGUI() {
		createHeads();
		menu = Bukkit.createInventory(null, 27, MenuTitle);
		for(String key : headList.keySet()) {
			ItemStack headItem = new ItemStack(Material.SKULL_ITEM, 1);
			ItemMeta headMeta = headItem.getItemMeta();
			headMeta.setDisplayName(key);
			headItem.setItemMeta(headMeta);
			headItem.setDurability((short)3);
			menu.addItem(headItem);
		}
	}
}
