package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.natureprairies.block.Ceramic;
import net.natureprairies.block.Flowers;
import net.natureprairies.block.Quartz;
import net.natureprairies.block.Slate;
import net.natureprairies.item.ModItems;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerShapelessRecipe(exporter, Items.ORANGE_DYE, Flowers.CLOVES, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.PINK_DYE, Flowers.PINK_LAWENDER, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.BLUE_DYE, Flowers.BLUE_LAVENDER, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.LIGHT_BLUE_DYE, Flowers.PUSHKINIA, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.PURPLE_DYE, Flowers.CROCUS, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.MAGENTA_DYE, Flowers.LAWENDER, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.RED_DYE, Flowers.RED_ROSE, String.valueOf(RecipeCategory.MISC), 1);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,ModItems.SLATE,RecipeCategory.BUILDING_BLOCKS, Slate.SLATE_BLOCK);



        //offerSmelting(exporter, List.of(SlateBlocks.COBBLED_SLATE), RecipeCategory.MISC, SlateBlocks.SLATE_BLOCK,
                //0.7f, 200, "slate");

        offerSmelting(exporter, List.of(Slate.SLATE_BLOCK), RecipeCategory.MISC, Slate.SMOOTH_SLATE,
                0.7f, 200, "slate");

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Slate.POLISHED_SLATE, Slate.SLATE_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Quartz.POLISHED_QUARTZ, Blocks.SMOOTH_QUARTZ);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Slate.SLATE_BRICKS, Slate.POLISHED_SLATE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, Quartz.POLISHED_QUARTZ);

        offerCrackingRecipe(exporter, Slate.CRACKED_SLATE_BRICKS, Slate.SLATE_BRICKS);

        offerCrackingRecipe(exporter, Quartz.CRACKED_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Slate.SMALL_SLATE_BRICKS, Slate.SLATE_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Quartz.SMALL_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

        offerCrackingRecipe(exporter, Slate.CRACKED_SMALL_SLATE_BRICKS, Slate.SMALL_SLATE_BRICKS);

        offerCrackingRecipe(exporter, Quartz.CRACKED_SMALL_QUARTZ_BRICKS, Quartz.SMALL_QUARTZ_BRICKS);

        //offerChiseledBlockRecipe(exporter, RecipeCategory.MISC, SlateBlocks.CHISELED_SLATE, SlateBlocks.COBBLED_SLATE_SLAB);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Slate.SLATE_PILLAR, 2)
                .pattern("x")
                .pattern("x")
                .input('x', Ingredient.ofItems(Slate.POLISHED_SLATE_SLAB))
                .criterion(hasItem(Slate.SLATE_BLOCK), conditionsFromItem(Slate.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(Slate.SLATE_PILLAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Slate.SLATE_LANTERN, 1)
                .pattern(" y ")
                .pattern("yxy")
                .pattern(" y ")
                .input('y', Ingredient.ofItems(ModItems.SLATE))
                .input('x', Ingredient.ofItems(Blocks.GLOWSTONE))
                .criterion(hasItem(Slate.SLATE_BLOCK), conditionsFromItem(Slate.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(Slate.SLATE_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Quartz.QUARTZ_LANTERN, 1)
                .pattern(" y ")
                .pattern("yxy")
                .pattern(" y ")
                .input('y', Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .input('x', Ingredient.ofItems(Blocks.GLOWSTONE))
                .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(Quartz.QUARTZ_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Slate.SLATE_TILES, 2)
                .pattern("yx")
                .pattern("xy")
                .input('x', Ingredient.ofItems(Slate.SMOOTH_SLATE))
                .input('y', Ingredient.ofItems(Slate.POLISHED_SLATE))
                .criterion(hasItem(Slate.SLATE_BLOCK), conditionsFromItem(Slate.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(Slate.SLATE_TILES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Quartz.QUARTZ_TILES, 2)
                .pattern("yx")
                .pattern("xy")
                .input('x', Ingredient.ofItems(Blocks.SMOOTH_QUARTZ))
                .input('y', Ingredient.ofItems(Quartz.POLISHED_QUARTZ))
                .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(Quartz.QUARTZ_TILES)));

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SLATE_BLOCK_SLAB,Slate.SLATE_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SMOOTH_SLATE_SLAB,Slate.SMOOTH_SLATE);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, Slate.POLISHED_SLATE_SLAB,Slate.POLISHED_SLATE);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SLATE_BRICK_SLAB,Slate.SLATE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SMALL_SLATE_BRICK_SLAB,Slate.SMALL_SLATE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SLATE_BLOCK_WALL, Slate.SLATE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SMOOTH_SLATE_WALL, Slate.SMOOTH_SLATE);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Slate.POLISHED_SLATE_WALL, Slate.POLISHED_SLATE);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SLATE_BRICK_WALL, Slate.SLATE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Slate.SMALL_SLATE_BRICK_WALL, Slate.SMALL_SLATE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Quartz.QUARTZ_BLOCK_WALL, Blocks.QUARTZ_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Quartz.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Quartz.POLISHED_QUARTZ_WALL, Quartz.POLISHED_QUARTZ);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Quartz.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, Quartz.SMALL_QUARTZ_BRICK_WALL, Quartz.SMALL_QUARTZ_BRICKS);

        createStairsRecipe(Slate.SLATE_BLOCK_STAIRS, Ingredient.ofItems(Slate.SLATE_BLOCK))
                .criterion(hasItem(Slate.SLATE_BLOCK), conditionsFromItem(Slate.SLATE_BLOCK))
                .offerTo(exporter);
        createStairsRecipe(Slate.SMOOTH_SLATE_STAIRS, Ingredient.ofItems(Slate.SMOOTH_SLATE))
                .criterion(hasItem(Slate.SMOOTH_SLATE), conditionsFromItem(Slate.SMOOTH_SLATE))
                .offerTo(exporter);
        createStairsRecipe(Slate.POLISHED_SLATE_STAIRS, Ingredient.ofItems(Slate.POLISHED_SLATE))
                .criterion(hasItem(Slate.POLISHED_SLATE), conditionsFromItem(Slate.POLISHED_SLATE))
                .offerTo(exporter);
        createStairsRecipe(Slate.SLATE_BRICK_STAIRS, Ingredient.ofItems(Slate.SLATE_BRICKS))
                .criterion(hasItem(Slate.SLATE_BRICKS), conditionsFromItem(Slate.SLATE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(Slate.SMALL_SLATE_BRICK_STAIRS, Ingredient.ofItems(Slate.SMALL_SLATE_BRICKS))
                .criterion(hasItem(Slate.SMALL_SLATE_BRICKS), conditionsFromItem(Slate.SMALL_SLATE_BRICKS))
                .offerTo(exporter);


        createStairsRecipe(Quartz.POLISHED_QUARTZ_STAIRS, Ingredient.ofItems(Quartz.POLISHED_QUARTZ))
                .criterion(hasItem(Quartz.POLISHED_QUARTZ), conditionsFromItem(Quartz.POLISHED_QUARTZ))
                .offerTo(exporter);
        createStairsRecipe(Quartz.QUARTZ_BRICK_STAIRS, Ingredient.ofItems(Blocks.QUARTZ_BRICKS))
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(Quartz.SMALL_QUARTZ_BRICK_STAIRS, Ingredient.ofItems(Quartz.SMALL_QUARTZ_BRICKS))
                .criterion(hasItem(Quartz.SMALL_QUARTZ_BRICKS), conditionsFromItem(Quartz.SMALL_QUARTZ_BRICKS))
                .offerTo(exporter);


        //offerSmelting(exporter, List.of(SlateBlocks.COBBLED_QUARTZ), RecipeCategory.MISC, Blocks.QUARTZ_BLOCK,
                //0.7f, 200, "quartz");

        offerSmelting(exporter, List.of(Blocks.QUARTZ_BLOCK), RecipeCategory.MISC, Blocks.SMOOTH_QUARTZ,
                0.7f, 200, "quartz");

        //Ceramic

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CERAMIC_BLEND_LUMP, 8)
                .pattern("yx")
                .pattern("xy")
                .input('x', Ingredient.ofItems(Items.CLAY_BALL))
                .input('y', Ingredient.ofItems(Blocks.GRAVEL))
                .criterion(hasItem(Items.CLAY_BALL), conditionsFromItem(Items.CLAY_BALL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CERAMIC_BLEND_LUMP)));

        offerSmelting(exporter, List.of(Ceramic.CERAMIC_BLEND), RecipeCategory.MISC, Ceramic.CERAMIC_BLOCK,
                0.7f, 200, "ceramic");

        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,ModItems.CERAMIC_BLEND_LUMP,RecipeCategory.BUILDING_BLOCKS, Ceramic.CERAMIC_BLEND);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,ModItems.CERAMIC_LUMP,RecipeCategory.BUILDING_BLOCKS, Ceramic.CERAMIC_BLOCK);

        offerSmelting(exporter, List.of(ModItems.CERAMIC_BLEND_LUMP), RecipeCategory.MISC, ModItems.CERAMIC_LUMP,
                0.7f, 200, "ceramic");

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Ceramic.CERAMIC_SHINGLES, Ceramic.CERAMIC_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, Ceramic.CERAMIC_SHINGLES_SLAB,Ceramic.CERAMIC_SHINGLES);

        createStairsRecipe(Ceramic.CERAMIC_SHINGLES_STAIRS, Ingredient.ofItems(Ceramic.CERAMIC_SHINGLES))
                .criterion(hasItem(Ceramic.CERAMIC_SHINGLES), conditionsFromItem(Ceramic.CERAMIC_SHINGLES))
                .offerTo(exporter);

        //Ceramic Pots

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.FLOWER_POT, 1)
                .pattern("x x")
                .pattern(" x ")
                .input('x', Ingredient.ofItems(ModItems.CERAMIC_LUMP))
                .criterion(hasItem(ModItems.CERAMIC_LUMP), conditionsFromItem(ModItems.CERAMIC_LUMP))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.FLOWER_POT)));

ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Ceramic.CERAMIC_POT_GREEK, 1)
                .pattern("xyx")
                .pattern(" x ")
                .input('x', Ingredient.ofItems(Ceramic.CERAMIC_BLEND))
                .input('y', Ingredient.ofItems(Items.LIGHT_BLUE_DYE))
                .criterion(hasItem(Ceramic.CERAMIC_BLEND), conditionsFromItem(Ceramic.CERAMIC_BLEND))
                .offerTo(exporter, new Identifier(getRecipeName(Ceramic.CERAMIC_POT_GREEK)));



    }
}
