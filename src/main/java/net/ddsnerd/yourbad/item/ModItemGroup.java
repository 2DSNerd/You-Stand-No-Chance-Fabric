package net.ddsnerd.yourbad.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ddsnerd.yourbad.yourbad;
import net.ddsnerd.yourbad.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup SCYTHES = Registry.register(Registries.ITEM_GROUP, new Identifier(yourbad.MOD_ID, "yourbad"),
            FabricItemGroup.builder().displayName(Text.translatable("yourbad.scythes"))
                    .icon(() -> new ItemStack(ModItems.NETHERITESCYTHE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODSCYTHE);
                        entries.add(ModItems.STONESCYTHE);
                        entries.add(ModItems.IRONSCYTHE);
                        entries.add(ModItems.GOLDSCYTHE);
                        entries.add(ModItems.DIAMONDSCYTHE);
                        entries.add(ModItems.NETHERITESCYTHE);
                        entries.add(ModItems.TITANIUMSCYTHE);

                        entries.add(ModItems.TITAINIUMHELMET);
                        entries.add(ModItems.TITAINIUMCHESTPLATE);
                        entries.add(ModItems.TITAINIUMLEGGINGS);
                        entries.add(ModItems.TITAINIUMBOOTS);

                        entries.add(ModBlocks.END_TITANIUM_ORE);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.TITANIUM_NUGGET);
                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}
