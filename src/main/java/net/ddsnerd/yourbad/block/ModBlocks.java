package net.ddsnerd.yourbad.block;

import net.ddsnerd.yourbad.item.ModItemGroup;
import net.ddsnerd.yourbad.yourbad;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.block.*;

public class ModBlocks {

    public static final Block END_TITANIUM_ORE = registerBlock("end_titanium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.5f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(yourbad.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(yourbad.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        yourbad.LOGGER.info("Registering ModBlocks for " + yourbad.MOD_ID);
    }
}
