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

public class Slate {

    public static final Block DEEPSLATE_SLATE_ORE = registerBlock("deepslate_slate_ore",
            new Block (FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SLATE_BLOCK = registerBlock("slate_block",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BLOCK_SLAB = registerBlock("slate_block_slab",
            new SlabBlock(FabricBlockSettings.
                    copyOf(Blocks.DRIPSTONE_BLOCK).
                    sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BLOCK_STAIRS = registerBlock("slate_block_stairs",
            new StairsBlock(SLATE_BLOCK.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BLOCK_WALL = registerBlock("slate_block_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SMOOTH_SLATE = registerBlock("smooth_slate",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMOOTH_SLATE_SLAB = registerBlock("smooth_slate_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMOOTH_SLATE_STAIRS = registerBlock("smooth_slate_stairs",
            new StairsBlock(SMOOTH_SLATE.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMOOTH_SLATE_WALL = registerBlock("smooth_slate_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block POLISHED_SLATE = registerBlock("polished_slate",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_SLATE_SLAB = registerBlock("polished_slate_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_SLATE_STAIRS = registerBlock("polished_slate_stairs",
            new StairsBlock(POLISHED_SLATE.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_SLATE_WALL = registerBlock("polished_slate_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SLATE_BRICKS = registerBlock("slate_bricks",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SLATE_BRICKS = registerBlock("cracked_slate_bricks",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BRICK_SLAB = registerBlock("slate_brick_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs",
            new StairsBlock(SLATE_BRICKS.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BRICK_WALL = registerBlock("slate_brick_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SMALL_SLATE_BRICKS = registerBlock("small_slate_bricks",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SMALL_SLATE_BRICKS = registerBlock("cracked_small_slate_bricks",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMALL_SLATE_BRICK_SLAB = registerBlock("small_slate_brick_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMALL_SLATE_BRICK_STAIRS = registerBlock("small_slate_brick_stairs",
            new StairsBlock(SMALL_SLATE_BRICKS.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMALL_SLATE_BRICK_WALL = registerBlock("small_slate_brick_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block CHISELED_SLATE = registerBlock("chiseled_slate",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SLATE_TILES = registerBlock("slate_tiles",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SLATE_PILLAR = registerBlock("slate_pillar",
            new PillarBlock(FabricBlockSettings
                    .copyOf(Blocks.DRIPSTONE_BLOCK)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SLATE_LANTERN = registerBlock("slate_lantern",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.GLOWSTONE)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .luminance((state) -> 13)));

    public static final Block OVERGROWN_SLATE = registerBlock("overgrown_slate",
            new GrassBlock(FabricBlockSettings
                    .copyOf(Blocks.MOSSY_COBBLESTONE)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NaturesPrairies.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerSlateModule() {
        NaturesPrairies.LOGGER.info("Registering Slate for " + NaturesPrairies.MODID);
    }
}