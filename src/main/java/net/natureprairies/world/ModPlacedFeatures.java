package net.natureprairies.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.natureprairies.NaturesPrairies;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SLATE_PLACED_KEY = registerKey("slate_patch_placed");
    //public static final RegistryKey<PlacedFeature> QUARTZ_PLACED_KEY = registerKey("quartz_patch_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeaturesRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SLATE_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLATE_KEY),
                ModPatchPlacement.modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(0))));

        //register(context, QUARTZ_PLACED_KEY, configuredFeaturesRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_KEY),
                //ModPatchPlacement.modifiersWithCount(2, // Veins per Chunk
                        //HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(48))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(NaturesPrairies.MODID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
