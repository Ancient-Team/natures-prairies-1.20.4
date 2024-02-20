package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.natureprairies.block.SlateBlocks;
import net.natureprairies.block.ModFlowers;
import net.natureprairies.item.ModItems;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(SlateBlocks.SLATE_BLOCK, "Slate Block");
        translationBuilder.add(SlateBlocks.SLATE_BLOCK_SLAB, "Slate Slab");
        translationBuilder.add(SlateBlocks.SLATE_BLOCK_STAIRS, "Slate Stairs");
        translationBuilder.add(SlateBlocks.SLATE_ORE, "Slate Ore");
        //translationBuilder.add(SlateBlocks.COBBLED_SLATE, "Cobbled Slate");
        //translationBuilder.add(SlateBlocks.COBBLED_SLATE_SLAB, "Cobbled Slate Slab");
        //translationBuilder.add(SlateBlocks.COBBLED_SLATE_STAIRS, "Cobbled Slate Stairs");
        //translationBuilder.add(SlateBlocks.COBBLED_QUARTZ, "Cobbled Quartz");
        //translationBuilder.add(SlateBlocks.COBBLED_QUARTZ_SLAB, "Cobbled Quartz Slab");
        //translationBuilder.add(SlateBlocks.COBBLED_QUARTZ_STAIRS, "Cobbled Quartz Stairs");
        translationBuilder.add(SlateBlocks.SMOOTH_SLATE, "Smooth Slate");
        translationBuilder.add(SlateBlocks.SMOOTH_SLATE_SLAB, "Smooth Slate Slab");
        translationBuilder.add(SlateBlocks.SMOOTH_SLATE_STAIRS, "Smooth Slate Stairs");
        translationBuilder.add(SlateBlocks.POLISHED_SLATE, "Polished Slate");
        translationBuilder.add(SlateBlocks.POLISHED_SLATE_SLAB, "Polished Slate Slab");
        translationBuilder.add(SlateBlocks.POLISHED_SLATE_STAIRS, "Polished Slate Stairs");
        translationBuilder.add(SlateBlocks.CHISELED_SLATE, "Chiseled Slate");
        translationBuilder.add(SlateBlocks.POLISHED_QUARTZ, "Polished Quartz");
        translationBuilder.add(SlateBlocks.POLISHED_QUARTZ_SLAB, "Polished Quartz Slab");
        translationBuilder.add(SlateBlocks.POLISHED_QUARTZ_STAIRS, "Polished Quartz Stairs");
        translationBuilder.add(SlateBlocks.SLATE_TILES, "Slate Tiles");
        translationBuilder.add(SlateBlocks.QUARTZ_TILES, "Quartz Tiles");
        translationBuilder.add(SlateBlocks.SLATE_BRICKS, "Slate Bricks");
        translationBuilder.add(SlateBlocks.SLATE_BRICK_SLAB, "Slate Brick Slab");
        translationBuilder.add(SlateBlocks.SLATE_BRICK_STAIRS, "Slate Brick Stairs");
        translationBuilder.add(SlateBlocks.QUARTZ_BRICK_SLAB, "Quartz Brick Slab");
        translationBuilder.add(SlateBlocks.QUARTZ_BRICK_STAIRS, "Quartz Brick Stairs");
        translationBuilder.add(SlateBlocks.CRACKED_SLATE_BRICKS, "Cracked Slate Bricks");
        translationBuilder.add(SlateBlocks.CRACKED_SLATE_BRICK_SLAB, "Cracked Slate Brick Slab");
        translationBuilder.add(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS, "Cracked Slate Brick Stairs");
        translationBuilder.add(SlateBlocks.CRACKED_QUARTZ_BRICKS, "Cracked Quartz Bricks");
        translationBuilder.add(SlateBlocks.CRACKED_QUARTZ_BRICK_SLAB, "Cracked Quartz Brick Slab");
        translationBuilder.add(SlateBlocks.CRACKED_QUARTZ_BRICK_STAIRS, "Cracked Quartz Brick Stairs");
        translationBuilder.add(SlateBlocks.SMALL_SLATE_BRICKS, "Small Slate Bricks");
        translationBuilder.add(SlateBlocks.SMALL_SLATE_BRICK_SLAB, "Small Slate Brick Slab");
        translationBuilder.add(SlateBlocks.SMALL_SLATE_BRICK_STAIRS, "Small Slate Brick Stairs");
        translationBuilder.add(SlateBlocks.SMALL_QUARTZ_BRICKS, "Small Quartz Bricks");
        translationBuilder.add(SlateBlocks.SMALL_QUARTZ_BRICK_SLAB, "Small Quartz Brick Slab");
        translationBuilder.add(SlateBlocks.SMALL_QUARTZ_BRICK_STAIRS, "Small Quartz Brick Stairs");
        translationBuilder.add(SlateBlocks.CRACKED_SMALL_SLATE_BRICKS, "Cracked Small Slate Bricks");
        translationBuilder.add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB, "Cracked Small Slate Brick Slab");
        translationBuilder.add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS, "Cracked Small Slate Brick Stairs");
        translationBuilder.add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICKS, "Cracked Small Quartz Bricks");
        translationBuilder.add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_SLAB, "Cracked Small Quartz Brick Slab");
        translationBuilder.add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_STAIRS, "Cracked Small Quartz Brick Stairs");
        translationBuilder.add(SlateBlocks.SLATE_PILLAR, "Slate Pillar");
        translationBuilder.add(SlateBlocks.OVERGROWN_SLATE, "Overgrown Slate NO");
        translationBuilder.add(SlateBlocks.SLATE_LANTERN, "Slate Lantern");
        translationBuilder.add(SlateBlocks.QUARTZ_LANTERN, "Quartz Lantern");

        translationBuilder.add(ModFlowers.LAWENDER, "Lawender NO");
        translationBuilder.add(ModFlowers.PINK_LAWENDER, "Pink Lawender NO");
        translationBuilder.add(ModFlowers.BLUE_LAVENDER, "Blue Lavender NO");
        translationBuilder.add(ModFlowers.CLOVER, "Clover NO");
        translationBuilder.add(ModFlowers.CROCUS, "Crocus NO");
        translationBuilder.add(ModFlowers.PUSHKINIA, "Pushkinia NO");

        translationBuilder.add(ModItems.SLATE, "Slate");

        translationBuilder.add("itemgroup.natureprairies", "Nature's Prairies");
        translationBuilder.add("itemgroup.natureprairiesfoliage", "Nature's Prairies Foliage");
    }
}