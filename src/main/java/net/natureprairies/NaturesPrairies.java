package net.natureprairies;

import net.fabricmc.api.ModInitializer;

import net.natureprairies.block.*;
import net.natureprairies.item.ItemGroups;
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



		ModWorldGeneration.generateModWorldGen();
		ModItems.registerModItems();

		ItemGroups.registerItemGroupsModule();

		Slate.registerSlateModule();
		Quartz.registerQuartzModule();
		Strata.registerStrataModule();
		Ceramic.registerCeramicModule();
		Flowers.registerFlowersModule();
	}


}