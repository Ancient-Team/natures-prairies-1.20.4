package net.natureprairies.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.natureprairies.NaturesPrairies;

public class Ceramic {

    //Ceramic Main

    public static final Block CERAMIC_BLEND = registerBlock("ceramic_blend",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CERAMIC_BLOCK = registerBlock("ceramic_block",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_SHINGLES = registerBlock("ceramic_shingles",
            new PillarBlock(FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_SHINGLES_SLAB = registerBlock("ceramic_shingles_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_SHINGLES_STAIRS = registerBlock("ceramic_shingles_stairs",
            new StairsBlock(CERAMIC_SHINGLES.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));


    //Ceramic Pots


    public static final Block CERAMIC_POT_GREEK = registerBlock("ceramic_pot_greek",
            new FlowerPotBlock(Blocks.AIR, FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_POT_EGYPTIAN = registerBlock("ceramic_pot_egyptian",
            new FlowerPotBlock(Blocks.AIR, FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_POT_ROMAN = registerBlock("ceramic_pot_roman",
            new FlowerPotBlock(Blocks.AIR, FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_POT_JAPANESE = registerBlock("ceramic_pot_japanese",
            new FlowerPotBlock(Blocks.AIR, FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_POT_AZTEC = registerBlock("ceramic_pot_aztec",
            new FlowerPotBlock(Blocks.AIR, FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_POT_NORDIC = registerBlock("ceramic_pot_nordic",
            new FlowerPotBlock(Blocks.AIR, FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CERAMIC_POT_SLAVIC = registerBlock("ceramic_pot_slavic",
            new FlowerPotBlock(Blocks.AIR, FabricBlockSettings
                    .copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.STONE)));











    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NaturesPrairies.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerCeramicModule() {
        NaturesPrairies.LOGGER.info("Registering Ceramic for " + NaturesPrairies.MODID);
    }
}
