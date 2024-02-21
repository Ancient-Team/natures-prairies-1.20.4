package net.natureprairies.world;

import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;
import net.natureprairies.NaturesPrairies;
import net.natureprairies.block.ModFlowers;
import net.natureprairies.block.SlateBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SLATE_KEY = registerKey("slate_patch");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_KEY = registerKey("quartz_patch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> FLOWER_LAWENDER_FIELDS_KEY = registerKey("lavender_fields_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PUSHKINIA_KEY = registerKey("pushkinia_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CROCUS_KEY = registerKey("crocus_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLOVER_KEY = registerKey("clover_patch");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);


        List<OreFeatureConfig.Target> slatePatch =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, SlateBlocks.SLATE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, SlateBlocks.SLATE_ORE.getDefaultState()));

        //List<OreFeatureConfig.Target> quartzPatch =
                //List.of(OreFeatureConfig.createTarget(netherReplacables, Blocks.QUARTZ_BLOCK.getDefaultState()));

        register(context, SLATE_KEY, Feature.ORE, new OreFeatureConfig(slatePatch, 12));
        //register(context, QUARTZ_KEY, Feature.ORE, new OreFeatureConfig(quartzPatch, 32));


        register(context, PUSHKINIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModFlowers.PUSHKINIA)))));

        register(context, CROCUS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModFlowers.CROCUS)))));

        register(context, CLOVER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModFlowers.CLOVER)))));

        register(context,
                FLOWER_LAWENDER_FIELDS_KEY,
                Feature.FLOWER,
                new RandomPatchFeatureConfig(20,
                12,
                4,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(1645L,
                                new DoublePerlinNoiseSampler.NoiseParameters(12, 40.0D),
                                38.08333340F,
                                 List.of(
                                         ModFlowers.LAWENDER.getDefaultState(),
                                         ModFlowers.BLUE_LAVENDER.getDefaultState(),
                                         ModFlowers.PINK_LAWENDER.getDefaultState()
                                 )
                        ))
                )
                )
        );

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(NaturesPrairies.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}