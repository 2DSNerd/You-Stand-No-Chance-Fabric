package net.ddsnerd.yourbad.block;

import net.ddsnerd.yourbad.item.ModItemGroup;
import net.ddsnerd.yourbad.yourbad;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.SCYTHESORE);
    public static final Block OAK_TABLE = registerBlock("oak_table",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(6f).requiresTool()), ModItemGroup.SCYTHESORE);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(yourbad.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(yourbad.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        yourbad.LOGGER.info("Registering ModBlocks for" + yourbad.MOD_ID);
    }

}
