package net.tempestwind.serpentarium;

import net.fabricmc.api.ModInitializer;
import net.tempestwind.serpentarium.block.ModBlocks;
import net.tempestwind.serpentarium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerpentariumMod implements ModInitializer {

	public static final String MOD_ID = "serpentarium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
