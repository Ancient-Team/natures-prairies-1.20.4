package net.natureprairies;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.natureprairies.datagen.*;
import net.natureprairies.world.ModConfiguredFeatures;
import net.natureprairies.world.ModPlacedFeatures;
import net.natureprairies.world.biome.Modbiomes;

public class NaturesPrairiesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(EnglishLangProvider::new);
		pack.addProvider(ModWorldGenerator::new);
		//pack.addProvider(ModAdvancementProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Modbiomes::bootstrap);
	}
}