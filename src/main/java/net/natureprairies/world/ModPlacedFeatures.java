package net.natureprairies.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.natureprairies.NaturesPrairies;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SLATE_PLACED_KEY = registerKey("slate_patch_placed");
    //public static final RegistryKey<PlacedFeature> QUARTZ_PLACED_KEY = registerKey("quartz_patch_placed");

    public static final RegistryKey <PlacedFeature> HIGHLANDS_FLOWER_LAVENDER_FIELDS_PLACED = registerKey("highlands_flower_lavender_fields_placed");
    public static final RegistryKey <PlacedFeature> FLOWER_LAVENDER_FIELDS_PLACED = registerKey("flower_lavender_fields_placed");

    public static final  RegistryKey<PlacedFeature> PUSHKINIA_PLACED_KEY = registerKey("pushkinia_patch_placed");
    public static final  RegistryKey<PlacedFeature> CROCUS_PLACED_KEY = registerKey("crocus_patch_placed");
    public static final  RegistryKey<PlacedFeature> CLOVES_PLACED_KEY = registerKey("cloves_patch_placed");
    public static final  RegistryKey<PlacedFeature> RED_ROSE_PLACED_KEY = registerKey("red_rose_patch_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeaturesRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        registerKey(context, SLATE_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLATE_KEY),
                ModPatchPlacement.modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));

        //register(context, QUARTZ_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_KEY),
                //ModPatchPlacement.modifiersWithCount(2, // Veins per Chunk
                        //HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(48))));

        registerKey(context,
                HIGHLANDS_FLOWER_LAVENDER_FIELDS_PLACED,
                configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HIGHLANDS_FLOWER_LAWENDER_FIELDS_KEY),
                CountPlacementModifier.of(180),
                RarityFilterPlacementModifier.of(3),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );
        registerKey(context,
                FLOWER_LAVENDER_FIELDS_PLACED,
                configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FLOWER_LAWENDER_FIELDS_KEY),
                CountPlacementModifier.of(180),
                RarityFilterPlacementModifier.of(3),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        registerKey(context, PUSHKINIA_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PUSHKINIA_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        registerKey(context, CROCUS_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CROCUS_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        registerKey(context, CLOVES_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CLOVES_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        registerKey(context, RED_ROSE_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_ROSE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(NaturesPrairies.MODID, name));
    }

    private static void registerKey(Registerable <PlacedFeature> context, RegistryKey <PlacedFeature> key, RegistryEntry <ConfiguredFeature <?, ?>> configuration, List <PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature <FC>> void registerKey(Registerable <PlacedFeature> context, RegistryKey <PlacedFeature> key, RegistryEntry <ConfiguredFeature <?, ?>> configuration, PlacementModifier... modifiers) {
        registerKey(context, key, configuration, List.of(modifiers));
    }

}
