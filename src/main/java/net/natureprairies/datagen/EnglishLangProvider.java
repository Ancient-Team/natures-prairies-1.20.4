package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.natureprairies.block.Flowers;
import net.natureprairies.block.Quartz;
import net.natureprairies.block.Slate;

import net.natureprairies.item.ModItems;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Slate.DEEPSLATE_SLATE_ORE, "Deepslate Slate Ore");
        //Quartz Ore

        translationBuilder.add(Slate.SLATE_BLOCK, "Slate Block");
        translationBuilder.add(Slate.SLATE_BLOCK_SLAB, "Slate Slab");
        translationBuilder.add(Slate.SLATE_BLOCK_STAIRS, "Slate Stairs");
        translationBuilder.add(Slate.SLATE_BLOCK_WALL, "Slate Wall");

        //Quartz Block
        //Quartz Block Slab
        //Quartz Block Stairs
        translationBuilder.add(Quartz.QUARTZ_BLOCK_WALL, "Quartz Wall");

        translationBuilder.add(Slate.SMOOTH_SLATE, "Smooth Slate");
        translationBuilder.add(Slate.SMOOTH_SLATE_SLAB, "Smooth Slate Slab");
        translationBuilder.add(Slate.SMOOTH_SLATE_STAIRS, "Smooth Slate Stairs");
        translationBuilder.add(Slate.SMOOTH_SLATE_WALL, "Smooth Slate Wall");

        //Smooth Quartz
        //Smooth Quartz Slab
        //Smooth Quartz Stairs
        translationBuilder.add(Quartz.SMOOTH_QUARTZ_WALL, "Smooth Quartz Wall");

        translationBuilder.add(Slate.POLISHED_SLATE, "Polished Slate");
        translationBuilder.add(Slate.POLISHED_SLATE_SLAB, "Polished Slate Slab");
        translationBuilder.add(Slate.POLISHED_SLATE_STAIRS, "Polished Slate Stairs");
        translationBuilder.add(Slate.POLISHED_SLATE_WALL, "Polished Slate Wall");

        translationBuilder.add(Quartz.POLISHED_QUARTZ, "Polished Quartz");
        translationBuilder.add(Quartz.POLISHED_QUARTZ_SLAB, "Polished Quartz Slab");
        translationBuilder.add(Quartz.POLISHED_QUARTZ_STAIRS, "Polished Quartz Stairs");
        translationBuilder.add(Quartz.POLISHED_QUARTZ_WALL, "Polished Quartz Wall");

        translationBuilder.add(Slate.SLATE_BRICKS, "Slate Bricks");
        translationBuilder.add(Slate.CRACKED_SLATE_BRICKS, "Cracked Slate Bricks");
        translationBuilder.add(Slate.SLATE_BRICK_SLAB, "Slate Brick Slab");
        translationBuilder.add(Slate.SLATE_BRICK_STAIRS, "Slate Brick Stairs");
        translationBuilder.add(Slate.SLATE_BRICK_WALL, "Slate Brick Wall");

        //Quartz Bricks
        translationBuilder.add(Quartz.CRACKED_QUARTZ_BRICKS, "Cracked Quartz Bricks");
        translationBuilder.add(Quartz.QUARTZ_BRICK_SLAB, "Quartz Brick Slab");
        translationBuilder.add(Quartz.QUARTZ_BRICK_STAIRS, "Quartz Brick Stairs");
        translationBuilder.add(Quartz.QUARTZ_BRICK_WALL, "Quartz Brick Wall");

        translationBuilder.add(Slate.SMALL_SLATE_BRICKS, "Small Slate Bricks");
        translationBuilder.add(Slate.CRACKED_SMALL_SLATE_BRICKS, "Cracked Small Slate Bricks");
        translationBuilder.add(Slate.SMALL_SLATE_BRICK_SLAB, "Small Slate Brick Slab");
        translationBuilder.add(Slate.SMALL_SLATE_BRICK_STAIRS, "Small Slate Brick Stairs");
        translationBuilder.add(Slate.SMALL_SLATE_BRICK_WALL, "Small Slate Brick Wall");

        translationBuilder.add(Quartz.SMALL_QUARTZ_BRICKS, "Small Quartz Bricks");
        translationBuilder.add(Quartz.CRACKED_SMALL_QUARTZ_BRICKS, "Cracked Small Quartz Bricks");
        translationBuilder.add(Quartz.SMALL_QUARTZ_BRICK_SLAB, "Small Quartz Brick Slab");
        translationBuilder.add(Quartz.SMALL_QUARTZ_BRICK_STAIRS, "Small Quartz Brick Stairs");
        translationBuilder.add(Quartz.SMALL_QUARTZ_BRICK_WALL, "Small Quartz Brick Wall");

        translationBuilder.add(Slate.CHISELED_SLATE, "Chiseled Slate");
        //Chiseled Quartz

        translationBuilder.add(Slate.SLATE_TILES, "Slate Tiles");
        translationBuilder.add(Quartz.QUARTZ_TILES, "Quartz Tiles");

        translationBuilder.add(Slate.SLATE_PILLAR, "Slate Pillar");
        //Quartz Pillar

        translationBuilder.add(Slate.SLATE_LANTERN, "Slate Lantern");
        translationBuilder.add(Quartz.QUARTZ_LANTERN, "Quartz Lantern");

        translationBuilder.add(Slate.OVERGROWN_SLATE, "Overgrown Slate NO");
        translationBuilder.add(Quartz.OVERGROWN_QUARTZ, "Overgrown Quartz NO");

        translationBuilder.add(Flowers.LAWENDER, "Lawender");
        translationBuilder.add(Flowers.PINK_LAWENDER, "Pink Lawender");
        translationBuilder.add(Flowers.BLUE_LAVENDER, "Blue Lavender");
        translationBuilder.add(Flowers.CLOVES, "Cloves");
        translationBuilder.add(Flowers.CROCUS, "Crocus");
        translationBuilder.add(Flowers.PUSHKINIA, "Pushkinia");
        translationBuilder.add(Flowers.RED_ROSE, "Red Rose");

        translationBuilder.add(ModItems.SLATE, "Slate");

        translationBuilder.add("itemgroup.natureprairies", "Nature's Prairies");
        translationBuilder.add("itemgroup.natureprairiesfoliage", "Nature's Prairies Foliage");
    }
}