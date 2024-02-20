package net.natureprairies.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.natureprairies.NaturesPrairies;
import net.natureprairies.block.SlateBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SLATE_KEY = registerKey("slate_patch");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_KEY = registerKey("quartz_patch");

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


    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(NaturesPrairies.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}