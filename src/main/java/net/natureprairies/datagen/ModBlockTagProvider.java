package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
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
                .add(Slate.SLATE_BLOCK)
                .add(Slate.SLATE_BLOCK_SLAB)
                .add(Slate.SLATE_BLOCK_STAIRS)
                .add(Slate.DEEPSLATE_SLATE_ORE)
                .add(Slate.SMOOTH_SLATE)
                .add(Slate.SMOOTH_SLATE_SLAB)
                .add(Slate.SMOOTH_SLATE_STAIRS)
                .add(Slate.POLISHED_SLATE)
                .add(Slate.POLISHED_SLATE_SLAB)
                .add(Slate.POLISHED_SLATE_STAIRS)
                .add(Slate.SLATE_BRICKS)
                .add(Slate.SLATE_BRICK_SLAB)
                .add(Slate.SLATE_BRICK_STAIRS)
                .add(Slate.CRACKED_SLATE_BRICKS)
                .add(Slate.SMALL_SLATE_BRICKS)
                .add(Slate.SMALL_SLATE_BRICK_SLAB)
                .add(Slate.SMALL_SLATE_BRICK_STAIRS)
                .add(Slate.CRACKED_SMALL_SLATE_BRICKS)
                .add(Slate.CHISELED_SLATE)
                .add(Slate.SLATE_PILLAR)
                .add(Slate.SLATE_LANTERN)
                .add(Slate.SLATE_TILES)
                .add(Slate.OVERGROWN_SLATE)


                .add(Quartz.POLISHED_QUARTZ)
                .add(Quartz.POLISHED_QUARTZ_SLAB)
                .add(Quartz.POLISHED_QUARTZ_STAIRS)

                .add(Quartz.QUARTZ_BRICK_SLAB)
                .add(Quartz.QUARTZ_BRICK_STAIRS)
                .add(Quartz.CRACKED_QUARTZ_BRICKS)
                .add(Quartz.SMALL_QUARTZ_BRICKS)
                .add(Quartz.SMALL_QUARTZ_BRICK_SLAB)
                .add(Quartz.SMALL_QUARTZ_BRICK_STAIRS)
                .add(Quartz.CRACKED_SMALL_QUARTZ_BRICKS)
                .add(Quartz.QUARTZ_TILES)
                .add(Quartz.QUARTZ_LANTERN)
                .add(Quartz.OVERGROWN_QUARTZ)

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


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(Slate.SLATE_BLOCK)
                .add(Slate.SLATE_BLOCK_SLAB)
                .add(Slate.SLATE_BLOCK_STAIRS)
                .add(Slate.DEEPSLATE_SLATE_ORE)
                .add(Slate.SMOOTH_SLATE)
                .add(Slate.SMOOTH_SLATE_SLAB)
                .add(Slate.SMOOTH_SLATE_STAIRS)
                .add(Slate.POLISHED_SLATE)
                .add(Slate.POLISHED_SLATE_SLAB)
                .add(Slate.POLISHED_SLATE_STAIRS)
                .add(Slate.SLATE_BRICKS)
                .add(Slate.SLATE_BRICK_SLAB)
                .add(Slate.SLATE_BRICK_STAIRS)
                .add(Slate.CRACKED_SLATE_BRICKS)
                .add(Slate.SMALL_SLATE_BRICKS)
                .add(Slate.SMALL_SLATE_BRICK_SLAB)
                .add(Slate.SMALL_SLATE_BRICK_STAIRS)
                .add(Slate.CRACKED_SMALL_SLATE_BRICKS)
                .add(Slate.CHISELED_SLATE)
                .add(Slate.SLATE_PILLAR)
                .add(Slate.SLATE_LANTERN)
                .add(Slate.SLATE_TILES)
                .add(Slate.OVERGROWN_SLATE)



                .add(Quartz.POLISHED_QUARTZ)
                .add(Quartz.POLISHED_QUARTZ_SLAB)
                .add(Quartz.POLISHED_QUARTZ_STAIRS)

                .add(Quartz.QUARTZ_BRICK_SLAB)
                .add(Quartz.QUARTZ_BRICK_STAIRS)
                .add(Quartz.CRACKED_QUARTZ_BRICKS)
                .add(Quartz.SMALL_QUARTZ_BRICKS)
                .add(Quartz.SMALL_QUARTZ_BRICK_SLAB)
                .add(Quartz.SMALL_QUARTZ_BRICK_STAIRS)
                .add(Quartz.CRACKED_SMALL_QUARTZ_BRICKS)
                .add(Quartz.QUARTZ_TILES)
                .add(Quartz.QUARTZ_LANTERN)
                .add(Quartz.OVERGROWN_QUARTZ)

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

        //getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                //.add(ModBlocks.END_STONE_RUBY_ORE);
    }
}

