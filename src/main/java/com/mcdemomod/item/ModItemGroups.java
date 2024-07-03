package com.mcdemomod.item;

import com.mcdemomod.MinecraftModDemo;
import com.mcdemomod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MinecraftModDemo.MOD_ID, "item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.minecraft_mod"))
                    .icon(() -> new ItemStack(Items.DIAMOND_SWORD)).entries((displayContext, entries) -> {
                        // ADD ITEMS
                        entries.add(ModBlocks.POSKY_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        MinecraftModDemo.LOGGER.info("Registering Item Groups for " + MinecraftModDemo.MOD_ID);
    }
}
