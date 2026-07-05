package net.phase.roofed;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import net.phase.roofed.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Roofed implements ModInitializer {
	public static final String MOD_ID = "roofed";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
