package net.natureprairies.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.natureprairies.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SLATE_PLACED_KEY);

        //BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                //GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_PLACED_KEY);


    }
}
