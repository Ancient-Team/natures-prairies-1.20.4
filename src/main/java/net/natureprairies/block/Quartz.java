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

public class Quartz {

    //Quartz Ore


    //Quartz Block
    //Quartz Block Slab
    //Quartz Block Stairs
    public static final Block QUARTZ_BLOCK_WALL = registerBlock("quartz_block_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));


    //Smooth Quartz
    //Smooth Quartz Slab
    //Smooth Quartz Stairs
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));


    public static final Block POLISHED_QUARTZ = registerBlock("polished_quartz",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_QUARTZ_SLAB = registerBlock("polished_quartz_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_QUARTZ_STAIRS = registerBlock("polished_quartz_stairs",
            new StairsBlock(POLISHED_QUARTZ.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_QUARTZ_WALL = registerBlock("polished_quartz_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));


    //Quartz Bricks
    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_SLAB)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BLOCK.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_STAIRS)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));


    public static final Block SMALL_QUARTZ_BRICKS = registerBlock("small_quartz_bricks",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_SMALL_QUARTZ_BRICKS = registerBlock("cracked_small_quartz_bricks",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMALL_QUARTZ_BRICK_SLAB = registerBlock("small_quartz_brick_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMALL_QUARTZ_BRICK_STAIRS = registerBlock("small_quartz_brick_stairs",
            new StairsBlock(SMALL_QUARTZ_BRICKS.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SMALL_QUARTZ_BRICK_WALL = registerBlock("small_quartz_brick_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));


    //Chiseled Quartz


    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.STONE)));


    //Quartz Pillar


    public static final Block QUARTZ_LANTERN = registerBlock("quartz_lantern",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.GLOWSTONE)
                    .sounds(BlockSoundGroup.STONE)
                    .luminance((state) -> 13)));


    public static final Block OVERGROWN_QUARTZ = registerBlock("overgrown_quartz",
            new GrassBlock(FabricBlockSettings
                    .copyOf(Blocks.WARPED_NYLIUM)
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NaturesPrairies.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerQuartzModule() {
        NaturesPrairies.LOGGER.info("Registering Quartz for " + NaturesPrairies.MODID);
    }
}
