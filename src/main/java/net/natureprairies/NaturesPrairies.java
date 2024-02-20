package net.natureprairies;

import net.fabricmc.api.ModInitializer;

import net.natureprairies.block.ModBlocks;
import net.natureprairies.block.ModFlowers;
import net.natureprairies.block.SlateBlocks;
import net.natureprairies.item.ModItemGroups;
import net.natureprairies.item.ModItems;
import net.natureprairies.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturesPrairies implements ModInitializer
     {
	public static final String MODID = "natures-prairies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Natures Prairies is initializing!");

		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModFlowers.registerModBlocks();
		SlateBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModItems.registerModItems();
	}


}