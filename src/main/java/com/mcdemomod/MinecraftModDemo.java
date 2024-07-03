package com.mcdemomod;

import com.mcdemomod.block.ModBlocks;
import com.mcdemomod.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftModDemo implements ModInitializer {
	public static final String MOD_ID = "minecraft-mod-demo";
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraft-mod-demo");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.initialize();
	}
}