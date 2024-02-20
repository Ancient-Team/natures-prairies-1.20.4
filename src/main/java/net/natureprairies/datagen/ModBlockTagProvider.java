package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.natureprairies.block.ModFlowers;
import net.natureprairies.block.SlateBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(SlateBlocks.SLATE_BLOCK)
                .add(SlateBlocks.SLATE_BLOCK_SLAB)
                .add(SlateBlocks.SLATE_BLOCK_STAIRS)
                .add(SlateBlocks.SLATE_ORE)
                //.add(SlateBlocks.COBBLED_SLATE)
                //.add(SlateBlocks.COBBLED_SLATE_SLAB)
                //.add(SlateBlocks.COBBLED_SLATE_STAIRS)
                .add(SlateBlocks.SMOOTH_SLATE)
                .add(SlateBlocks.SMOOTH_SLATE_SLAB)
                .add(SlateBlocks.SMOOTH_SLATE_STAIRS)
                .add(SlateBlocks.POLISHED_SLATE)
                .add(SlateBlocks.POLISHED_SLATE_SLAB)
                .add(SlateBlocks.POLISHED_SLATE_STAIRS)
                .add(SlateBlocks.SLATE_BRICKS)
                .add(SlateBlocks.SLATE_BRICK_SLAB)
                .add(SlateBlocks.SLATE_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_SLATE_BRICKS)
                .add(SlateBlocks.CRACKED_SLATE_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS)
                .add(SlateBlocks.SMALL_SLATE_BRICKS)
                .add(SlateBlocks.SMALL_SLATE_BRICK_SLAB)
                .add(SlateBlocks.SMALL_SLATE_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_SMALL_SLATE_BRICKS)
                .add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS)
                .add(SlateBlocks.CHISELED_SLATE)
                .add(SlateBlocks.SLATE_PILLAR)
                .add(SlateBlocks.SLATE_LANTERN)
                .add(SlateBlocks.SLATE_TILES)
                .add(SlateBlocks.OVERGROWN_SLATE)

                //.add(Blocks.QUARTZ_BLOCK)
                //.add(SlateBlocks.COBBLED_QUARTZ)
                //.add(SlateBlocks.COBBLED_QUARTZ_SLAB)
                //.add(SlateBlocks.COBBLED_QUARTZ_STAIRS)
                //.add(Blocks.SMOOTH_QUARTZ)
                //.add(Blocks.SMOOTH_QUARTZ_SLAB)
                //.add(Blocks.SMOOTH_QUARTZ_STAIRS)
                .add(SlateBlocks.POLISHED_QUARTZ)
                .add(SlateBlocks.POLISHED_QUARTZ_SLAB)
                .add(SlateBlocks.POLISHED_QUARTZ_STAIRS)
                //.add(Blocks.QUARTZ_BRICKS)
                .add(SlateBlocks.QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_QUARTZ_BRICKS)
                .add(SlateBlocks.CRACKED_QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.SMALL_QUARTZ_BRICKS)
                .add(SlateBlocks.SMALL_QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.SMALL_QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICKS)
                .add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.QUARTZ_TILES)
                //.add(Blocks.CHISELED_QUARTZ_BLOCK)
                //.add(Blocks.QUARTZ_PILLAR)
                .add(SlateBlocks.QUARTZ_LANTERN);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(SlateBlocks.SLATE_BLOCK)
                .add(SlateBlocks.SLATE_BLOCK_SLAB)
                .add(SlateBlocks.SLATE_BLOCK_STAIRS)
                //.add(SlateBlocks.COBBLED_SLATE)
                //.add(SlateBlocks.COBBLED_SLATE_SLAB)
                //.add(SlateBlocks.COBBLED_SLATE_STAIRS)
                .add(SlateBlocks.SMOOTH_SLATE)
                .add(SlateBlocks.SMOOTH_SLATE_SLAB)
                .add(SlateBlocks.SMOOTH_SLATE_STAIRS)
                .add(SlateBlocks.POLISHED_SLATE)
                .add(SlateBlocks.POLISHED_SLATE_SLAB)
                .add(SlateBlocks.POLISHED_SLATE_STAIRS)
                .add(SlateBlocks.SLATE_BRICKS)
                .add(SlateBlocks.SLATE_BRICK_SLAB)
                .add(SlateBlocks.SLATE_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_SLATE_BRICKS)
                .add(SlateBlocks.CRACKED_SLATE_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS)
                .add(SlateBlocks.SMALL_SLATE_BRICKS)
                .add(SlateBlocks.SMALL_SLATE_BRICK_SLAB)
                .add(SlateBlocks.SMALL_SLATE_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_SMALL_SLATE_BRICKS)
                .add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS)
                .add(SlateBlocks.CHISELED_SLATE)
                .add(SlateBlocks.SLATE_PILLAR)
                .add(SlateBlocks.SLATE_LANTERN)
                .add(SlateBlocks.SLATE_TILES)
                .add(SlateBlocks.OVERGROWN_SLATE)

                //.add(Blocks.QUARTZ_BLOCK)
                //.add(SlateBlocks.COBBLED_QUARTZ)
                //.add(SlateBlocks.COBBLED_QUARTZ_SLAB)
                //.add(SlateBlocks.COBBLED_QUARTZ_STAIRS)
                //.add(Blocks.SMOOTH_QUARTZ)
                //.add(Blocks.SMOOTH_QUARTZ_SLAB)
                //.add(Blocks.SMOOTH_QUARTZ_STAIRS)
                .add(SlateBlocks.POLISHED_QUARTZ)
                .add(SlateBlocks.POLISHED_QUARTZ_SLAB)
                .add(SlateBlocks.POLISHED_QUARTZ_STAIRS)
                //.add(Blocks.QUARTZ_BRICKS)
                .add(SlateBlocks.QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_QUARTZ_BRICKS)
                .add(SlateBlocks.CRACKED_QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.SMALL_QUARTZ_BRICKS)
                .add(SlateBlocks.SMALL_QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.SMALL_QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICKS)
                .add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_SLAB)
                .add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_STAIRS)
                .add(SlateBlocks.QUARTZ_TILES)
                //.add(Blocks.CHISELED_QUARTZ_BLOCK)
                //.add(Blocks.QUARTZ_PILLAR)
                .add(SlateBlocks.QUARTZ_LANTERN);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(SlateBlocks.OVERGROWN_SLATE);

        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModFlowers.LAWENDER)
                .add(ModFlowers.PINK_LAWENDER)
                .add(ModFlowers.BLUE_LAVENDER)
                .add(ModFlowers.CLOVER)
                .add(ModFlowers.CROCUS)
                .add(ModFlowers.PUSHKINIA);
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModFlowers.LAWENDER)
                .add(ModFlowers.PINK_LAWENDER)
                .add(ModFlowers.BLUE_LAVENDER)
                .add(ModFlowers.CLOVER)
                .add(ModFlowers.CROCUS)
                .add(ModFlowers.PUSHKINIA);

        //getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                //.add(ModBlocks.END_STONE_RUBY_ORE);
    }
}

