package net.tempestwind.serpentarium.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tempestwind.serpentarium.SerpentariumMod;

public class ModBlocks {

    public static  final Block SNAKESHED_BLOCK = registerBlock("snakeshed_block",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.5f).nonOpaque()), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SerpentariumMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(SerpentariumMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        SerpentariumMod.LOGGER.info("Registering mod blocks for Serpentarium");
    }

}
