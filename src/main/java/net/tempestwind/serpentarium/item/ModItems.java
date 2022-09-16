package net.tempestwind.serpentarium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.tempestwind.serpentarium.SerpentariumMod;

import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item VENOM_SACK = registerItem("venom_sac",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SNAKE_SCALES = registerItem("snake_scales",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SerpentariumMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SerpentariumMod.LOGGER.info("Registering mod items for Serpentarium");
    }

}
