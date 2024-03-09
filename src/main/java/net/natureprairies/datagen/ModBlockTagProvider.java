package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.natureprairies.block.Ceramic;
import net.natureprairies.block.Flowers;
import net.natureprairies.block.Quartz;
import net.natureprairies.block.Slate;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(Slate.DEEPSLATE_SLATE_ORE)

                .add(Slate.SLATE_BLOCK)
                .add(Slate.SLATE_BLOCK_SLAB)
                .add(Slate.SLATE_BLOCK_STAIRS)
                .add(Slate.SLATE_BLOCK_WALL)

                .add(Slate.SMOOTH_SLATE)
                .add(Slate.SMOOTH_SLATE_SLAB)
                .add(Slate.SMOOTH_SLATE_STAIRS)
                .add(Slate.SMOOTH_SLATE_WALL)

                .add(Slate.POLISHED_SLATE)
                .add(Slate.POLISHED_SLATE_SLAB)
                .add(Slate.POLISHED_SLATE_STAIRS)
                .add(Slate.POLISHED_SLATE_WALL)

                .add(Slate.SLATE_BRICKS)
                .add(Slate.CRACKED_SLATE_BRICKS)
                .add(Slate.SLATE_BRICK_SLAB)
                .add(Slate.SLATE_BRICK_STAIRS)
                .add(Slate.SLATE_BRICK_WALL)

                .add(Slate.SMALL_SLATE_BRICKS)
                .add(Slate.CRACKED_SMALL_SLATE_BRICKS)
                .add(Slate.SMALL_SLATE_BRICK_SLAB)
                .add(Slate.SMALL_SLATE_BRICK_STAIRS)
                .add(Slate.SMALL_SLATE_BRICK_WALL)

                .add(Slate.CHISELED_SLATE)

                .add(Slate.SLATE_TILES)

                .add(Slate.SLATE_PILLAR)

                .add(Slate.SLATE_LANTERN)

                .add(Slate.OVERGROWN_SLATE)


                //.add(Blocks.QUARTZ_BLOCK)
                //.add(Blocks.QUARTZ_STAIRS)
                //.add(Blocks.QUARTZ_SLAB)
                .add(Quartz.QUARTZ_BLOCK_WALL)

                //.add(Blocks.SMOOTH_QUARTZ)
                //.add(Blocks.SMOOTH_QUARTZ_STAIRS)
                //.add(Blocks.SMOOTH_QUARTZ_SLAB)
                .add(Quartz.SMOOTH_QUARTZ_WALL)

                .add(Quartz.POLISHED_QUARTZ)
                .add(Quartz.POLISHED_QUARTZ_SLAB)
                .add(Quartz.POLISHED_QUARTZ_STAIRS)
                .add(Quartz.POLISHED_QUARTZ_WALL)

                //.add(Blocks.QUARTZ_BRICKS)
                .add(Quartz.CRACKED_QUARTZ_BRICKS)
                .add(Quartz.QUARTZ_BRICK_SLAB)
                .add(Quartz.QUARTZ_BRICK_STAIRS)
                .add(Quartz.QUARTZ_BRICK_WALL)

                .add(Quartz.SMALL_QUARTZ_BRICKS)
                .add(Quartz.CRACKED_SMALL_QUARTZ_BRICKS)
                .add(Quartz.SMALL_QUARTZ_BRICK_SLAB)
                .add(Quartz.SMALL_QUARTZ_BRICK_STAIRS)
                .add(Quartz.SMALL_QUARTZ_BRICK_WALL)

                //.add(Blocks.CHISELED_QUARTZ_BLOCK)

                .add(Quartz.QUARTZ_TILES)

                //.add(Blocks.QUARTZ_PILLAR)

                .add(Quartz.QUARTZ_LANTERN)

                .add(Quartz.OVERGROWN_QUARTZ)

                .add(Ceramic.CERAMIC_BLOCK)
                .add(Ceramic.CERAMIC_SHINGLES)
                .add(Ceramic.CERAMIC_SHINGLES_SLAB)
                .add(Ceramic.CERAMIC_SHINGLES_STAIRS);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(Ceramic.CERAMIC_BLEND);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(Ceramic.CERAMIC_BLOCK)
                .add(Ceramic.CERAMIC_SHINGLES)
                .add(Ceramic.CERAMIC_SHINGLES_SLAB)
                .add(Ceramic.CERAMIC_SHINGLES_STAIRS)
                .add(Ceramic.CERAMIC_BLEND);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(Slate.DEEPSLATE_SLATE_ORE)

                .add(Slate.SLATE_BLOCK)
                .add(Slate.SLATE_BLOCK_SLAB)
                .add(Slate.SLATE_BLOCK_STAIRS)
                .add(Slate.SLATE_BLOCK_WALL)

                .add(Slate.SMOOTH_SLATE)
                .add(Slate.SMOOTH_SLATE_SLAB)
                .add(Slate.SMOOTH_SLATE_STAIRS)
                .add(Slate.SMOOTH_SLATE_WALL)

                .add(Slate.POLISHED_SLATE)
                .add(Slate.POLISHED_SLATE_SLAB)
                .add(Slate.POLISHED_SLATE_STAIRS)
                .add(Slate.POLISHED_SLATE_WALL)

                .add(Slate.SLATE_BRICKS)
                .add(Slate.CRACKED_SLATE_BRICKS)
                .add(Slate.SLATE_BRICK_SLAB)
                .add(Slate.SLATE_BRICK_STAIRS)
                .add(Slate.SLATE_BRICK_WALL)

                .add(Slate.SMALL_SLATE_BRICKS)
                .add(Slate.CRACKED_SMALL_SLATE_BRICKS)
                .add(Slate.SMALL_SLATE_BRICK_SLAB)
                .add(Slate.SMALL_SLATE_BRICK_STAIRS)
                .add(Slate.SMALL_SLATE_BRICK_WALL)

                .add(Slate.CHISELED_SLATE)

                .add(Slate.SLATE_TILES)

                .add(Slate.SLATE_PILLAR)

                .add(Slate.SLATE_LANTERN)

                .add(Slate.OVERGROWN_SLATE)


                //.add(Blocks.QUARTZ_BLOCK)
                //.add(Blocks.QUARTZ_STAIRS)
                //.add(Blocks.QUARTZ_SLAB)
                .add(Quartz.QUARTZ_BLOCK_WALL)

                //.add(Blocks.SMOOTH_QUARTZ)
                //.add(Blocks.SMOOTH_QUARTZ_STAIRS)
                //.add(Blocks.SMOOTH_QUARTZ_SLAB)
                .add(Quartz.SMOOTH_QUARTZ_WALL)

                .add(Quartz.POLISHED_QUARTZ)
                .add(Quartz.POLISHED_QUARTZ_SLAB)
                .add(Quartz.POLISHED_QUARTZ_STAIRS)
                .add(Quartz.POLISHED_QUARTZ_WALL)

                //.add(Blocks.QUARTZ_BRICKS)
                .add(Quartz.CRACKED_QUARTZ_BRICKS)
                .add(Quartz.QUARTZ_BRICK_SLAB)
                .add(Quartz.QUARTZ_BRICK_STAIRS)
                .add(Quartz.QUARTZ_BRICK_WALL)

                .add(Quartz.SMALL_QUARTZ_BRICKS)
                .add(Quartz.CRACKED_SMALL_QUARTZ_BRICKS)
                .add(Quartz.SMALL_QUARTZ_BRICK_SLAB)
                .add(Quartz.SMALL_QUARTZ_BRICK_STAIRS)
                .add(Quartz.SMALL_QUARTZ_BRICK_WALL)

                //.add(Blocks.CHISELED_QUARTZ_BLOCK)

                .add(Quartz.QUARTZ_TILES)

                //.add(Blocks.QUARTZ_PILLAR)

                .add(Quartz.QUARTZ_LANTERN)

                .add(Quartz.OVERGROWN_QUARTZ);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(Slate.SLATE_BLOCK_WALL)
                .add(Quartz.QUARTZ_BLOCK_WALL)
                .add(Slate.SMOOTH_SLATE_WALL)
                .add(Quartz.SMOOTH_QUARTZ_WALL)
                .add(Slate.POLISHED_SLATE_WALL)
                .add(Quartz.POLISHED_QUARTZ_WALL)
                .add(Slate.SLATE_BRICK_WALL)
                .add(Quartz.QUARTZ_BRICK_WALL)
                .add(Slate.SMALL_SLATE_BRICK_WALL)
                .add(Quartz.SMALL_QUARTZ_BRICK_WALL);


        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(Slate.OVERGROWN_SLATE)
                .add(Quartz.OVERGROWN_QUARTZ);


        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(Flowers.LAWENDER)
                .add(Flowers.PINK_LAWENDER)
                .add(Flowers.BLUE_LAVENDER)
                .add(Flowers.CLOVES)
                .add(Flowers.CROCUS)
                .add(Flowers.PUSHKINIA)
                .add(Flowers.RED_ROSE);
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(Flowers.LAWENDER)
                .add(Flowers.PINK_LAWENDER)
                .add(Flowers.BLUE_LAVENDER)
                .add(Flowers.CLOVES)
                .add(Flowers.CROCUS)
                .add(Flowers.PUSHKINIA)
                .add(Flowers.RED_ROSE);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(Ceramic.CERAMIC_POT_GREEK)
                .add(Ceramic.CERAMIC_POT_EGYPTIAN)
                .add(Ceramic.CERAMIC_POT_ROMAN)
                .add(Ceramic.CERAMIC_POT_JAPANESE)
                .add(Ceramic.CERAMIC_POT_AZTEC)
                .add(Ceramic.CERAMIC_POT_NORDIC)
                .add(Ceramic.CERAMIC_POT_SLAVIC);

        //getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                //.add(ModBlocks.END_STONE_RUBY_ORE);
    }
}

