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

public class SlateBlocks {

    public static final Block SLATE_ORE = registerBlock("slate_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block SLATE_BLOCK = registerBlock("slate_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BLOCK_SLAB = registerBlock("slate_block_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BLOCK_STAIRS = registerBlock("slate_block_stairs",
            new StairsBlock(SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BLOCK_WALL = registerBlock("slate_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block QUARTZ_BLOCK_WALL = registerBlock("quartz_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    //public static final Block COBBLED_SLATE = registerBlock("cobbled_slate",
            //new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    //public static final Block COBBLED_SLATE_SLAB = registerBlock("cobbled_slate_slab",
            //new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    //public static final Block COBBLED_SLATE_STAIRS = registerBlock("cobbled_slate_stairs",
            //new StairsBlock(COBBLED_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    //public static final Block COBBLED_QUARTZ = registerBlock("cobbled_quartz",
            //new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    //public static final Block COBBLED_QUARTZ_SLAB = registerBlock("cobbled_quartz_slab",
            //new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    //public static final Block COBBLED_QUARTZ_STAIRS = registerBlock("cobbled_quartz_stairs",
            //new StairsBlock(COBBLED_QUARTZ.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block SMOOTH_SLATE = registerBlock("smooth_slate",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMOOTH_SLATE_SLAB = registerBlock("smooth_slate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMOOTH_SLATE_STAIRS = registerBlock("smooth_slate_stairs",
            new StairsBlock(SMOOTH_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMOOTH_SLATE_WALL = registerBlock("smooth_slate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SLATE = registerBlock("polished_slate",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_SLATE_SLAB = registerBlock("polished_slate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_SLATE_STAIRS = registerBlock("polished_slate_stairs",
            new StairsBlock(POLISHED_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_SLATE_WALL = registerBlock("polished_slate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block POLISHED_QUARTZ = registerBlock("polished_quartz",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_QUARTZ_SLAB = registerBlock("polished_quartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_QUARTZ_STAIRS = registerBlock("polished_quartz_stairs",
            new StairsBlock(POLISHED_QUARTZ.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_QUARTZ_WALL = registerBlock("polished_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_BRICKS = registerBlock("slate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BRICK_SLAB = registerBlock("slate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs",
            new StairsBlock(SLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SLATE_BRICK_WALL = registerBlock("slate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SLATE_BRICKS = registerBlock("cracked_slate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SLATE_BRICK_SLAB = registerBlock("cracked_slate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SLATE_BRICK_STAIRS = registerBlock("cracked_slate_brick_stairs",
            new StairsBlock(CRACKED_SLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SLATE_BRICK_WALL = registerBlock("cracked_slate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_QUARTZ_BRICK_SLAB = registerBlock("cracked_quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_QUARTZ_BRICK_STAIRS = registerBlock("cracked_quartz_brick_stairs",
            new StairsBlock(CRACKED_QUARTZ_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_QUARTZ_BRICK_WALL = registerBlock("cracked_quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block SMALL_SLATE_BRICKS = registerBlock("small_slate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMALL_SLATE_BRICK_SLAB = registerBlock("small_slate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMALL_SLATE_BRICK_STAIRS = registerBlock("small_slate_brick_stairs",
            new StairsBlock(SMALL_SLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block SMALL_SLATE_BRICK_WALL = registerBlock("small_slate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block SMALL_QUARTZ_BRICKS = registerBlock("small_quartz_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block SMALL_QUARTZ_BRICK_SLAB = registerBlock("small_quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block SMALL_QUARTZ_BRICK_STAIRS = registerBlock("small_quartz_brick_stairs",
            new StairsBlock(SMALL_QUARTZ_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block SMALL_QUARTZ_BRICK_WALL = registerBlock("small_quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_SMALL_SLATE_BRICKS = registerBlock("cracked_small_slate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SMALL_SLATE_BRICK_SLAB = registerBlock("cracked_small_slate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SMALL_SLATE_BRICK_STAIRS = registerBlock("cracked_small_slate_brick_stairs",
            new StairsBlock(CRACKED_SMALL_SLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_SMALL_SLATE_BRICK_WALL = registerBlock("cracked_small_slate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block CRACKED_SMALL_QUARTZ_BRICKS = registerBlock("cracked_small_quartz_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_SMALL_QUARTZ_BRICK_SLAB = registerBlock("cracked_small_quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_SMALL_QUARTZ_BRICK_STAIRS = registerBlock("cracked_small_quartz_brick_stairs",
            new StairsBlock(CRACKED_SMALL_QUARTZ_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_SMALL_QUARTZ_BRICK_WALL = registerBlock("cracked_small_quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_SLATE = registerBlock("chiseled_slate",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block SLATE_TILES = registerBlock("slate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_PILLAR = registerBlock("slate_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block OVERGROWN_SLATE = registerBlock("overgrown_slate",
            new GrassBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));

    public static final Block SLATE_LANTERN = registerBlock("slate_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).luminance((state) -> 13)));

    public static final Block QUARTZ_LANTERN = registerBlock("quartz_lantern",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).sounds(BlockSoundGroup.STONE).luminance((state) -> 13)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NaturesPrairies.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        NaturesPrairies.LOGGER.info("Registering ModBlocks for " + NaturesPrairies.MODID);
    }
}
