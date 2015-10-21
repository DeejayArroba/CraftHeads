package me.deejayarroba.craftheads.skulls;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import me.deejayarroba.craftheads.util.Reflections;
import org.apache.commons.codec.binary.Base64;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public class Skulls {

	private static final Base64 base64 = new Base64();
	private String id;

	private Skulls(String id) {
		this.id = id;
	}

	/**
	 * Return a skull that has a custom texture specified by url.
	 *
	 * @param url skin url
	 * @return itemstack
	 */
	public static ItemStack getCustomSkull(String url) {
		GameProfile profile = new GameProfile(UUID.randomUUID(), null);
		PropertyMap propertyMap = profile.getProperties();
		if (propertyMap == null) {
			throw new IllegalStateException("Profile doesn't contain a property map");
		}
		byte[] encodedData = base64.encode(String.format("{textures:{SKIN:{url:\"%s\"}}}", url).getBytes());
		propertyMap.put("textures", new Property("textures", new String(encodedData)));
		ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		ItemMeta headMeta = head.getItemMeta();
		Class<?> headMetaClass = headMeta.getClass();
		Reflections.getField(headMetaClass, "profile", GameProfile.class).set(headMeta, profile);
		head.setItemMeta(headMeta);
		return head;
	}

	/**
	 * Return a skull of a player.
	 *
	 * @param name player's name
	 * @return itemstack
	 */
	public static ItemStack getPlayerSkull(String name) {
		ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
		SkullMeta meta = (SkullMeta) itemStack.getItemMeta();
		meta.setOwner(name);
		itemStack.setItemMeta(meta);
		return itemStack;
	}

	/**
	 * Return the skull's id.
	 *
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Return the skull of the enum.
	 *
	 * @return itemstack
	 */
	public ItemStack getSkull() {
		ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta meta = (SkullMeta) itemStack.getItemMeta();
		meta.setOwner(id);
		itemStack.setItemMeta(meta);
		return itemStack;
	}

}
