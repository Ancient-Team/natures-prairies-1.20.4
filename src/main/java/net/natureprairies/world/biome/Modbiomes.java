package net.natureprairies.world.biome;

import net.minecraft.client.sound.MusicType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.natureprairies.NaturesPrairies;
import net.natureprairies.world.ModPlacedFeatures;

public class Modbiomes {
    public static final RegistryKey<Biome> HIGHLANDS_LAVENDER_FIELDS = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(NaturesPrairies.MODID, "highlands_lavender_fields"));
    public static void bootstrap(Registerable<Biome> context) {
        context.register(HIGHLANDS_LAVENDER_FIELDS, HighlandsLavenderFields(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);

    }
    public static Biome HighlandsLavenderFields(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        //spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.PORCUPINE, 2, 3, 5));

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 4, 4));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addDefaultDisks(biomeBuilder);
        DefaultBiomeFeatures.addEmeraldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, VegetationPlacedFeatures.TREES_MEADOW);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HIGHLANDS_FLOWER_LAVENDER_FIELDS_PLACED);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_GRASS_PLAIN);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);



        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.8f)
                .temperature(0.5f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x0E4ECF)
                        .waterFogColor(0x0E4ECF)
                        .skyColor(0x78A7FF)
                        .grassColor(0x83BB6D)
                        .foliageColor(0x63A948)
                        .fogColor(0x78A7FF)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_MEADOW)).build())
                .build();
    }

}
