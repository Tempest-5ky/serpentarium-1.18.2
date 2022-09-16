package net.tempestwind.serpentarium.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tempestwind.serpentarium.SerpentariumMod;

public class ModItemGroup {
    public static final ItemGroup SERPENTARIUM = FabricItemGroupBuilder.build(new Identifier(SerpentariumMod.MOD_ID, "serpentarium"),
            () -> new ItemStack(ModItems.VENOM_SACK));
}
