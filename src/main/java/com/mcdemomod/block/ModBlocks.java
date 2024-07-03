package com.mcdemomod.block;

import com.mcdemomod.MinecraftModDemo;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block POSKY_BLOCK = register("posky_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static Block register(String name, Block block) {
        Identifier id = Identifier.of(MinecraftModDemo.MOD_ID, name);

        BlockItem blockItem = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, id, blockItem);


        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {}
}
