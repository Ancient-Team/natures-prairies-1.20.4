package net.natureprairies.datagen;

import com.llamalad7.mixinextras.lib.apache.commons.ObjectUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.natureprairies.block.ModBlocks;
import net.natureprairies.block.ModFlowers;
import net.natureprairies.block.SlateBlocks;
import net.natureprairies.item.ModItems;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerShapelessRecipe(exporter, Items.ORANGE_DYE, ModFlowers.CLOVER, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.PINK_DYE, ModFlowers.PINK_LAWENDER, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.BLUE_DYE, ModFlowers.BLUE_LAVENDER, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.LIGHT_BLUE_DYE, ModFlowers.PUSHKINIA, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.PURPLE_DYE, ModFlowers.CROCUS, String.valueOf(RecipeCategory.MISC), 1);
        offerShapelessRecipe(exporter, Items.MAGENTA_DYE, ModFlowers.LAWENDER, String.valueOf(RecipeCategory.MISC), 1);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,ModItems.SLATE,RecipeCategory.BUILDING_BLOCKS, SlateBlocks.SLATE_BLOCK);

        //offerSmelting(exporter, List.of(SlateBlocks.COBBLED_SLATE), RecipeCategory.MISC, SlateBlocks.SLATE_BLOCK,
                //0.7f, 200, "slate");

        offerSmelting(exporter, List.of(SlateBlocks.SLATE_BLOCK), RecipeCategory.MISC, SlateBlocks.SMOOTH_SLATE,
                0.7f, 200, "slate");

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SlateBlocks.POLISHED_SLATE, SlateBlocks.SLATE_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SlateBlocks.POLISHED_QUARTZ, Blocks.SMOOTH_QUARTZ);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SlateBlocks.SLATE_BRICKS, SlateBlocks.POLISHED_SLATE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, SlateBlocks.POLISHED_QUARTZ);

        offerCrackingRecipe(exporter, SlateBlocks.CRACKED_SLATE_BRICKS, SlateBlocks.SLATE_BRICKS);

        offerCrackingRecipe(exporter, SlateBlocks.CRACKED_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SlateBlocks.SMALL_SLATE_BRICKS, SlateBlocks.SLATE_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SlateBlocks.SMALL_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);

        offerCrackingRecipe(exporter, SlateBlocks.CRACKED_SMALL_SLATE_BRICKS, SlateBlocks.SMALL_SLATE_BRICKS);

        offerCrackingRecipe(exporter, SlateBlocks.CRACKED_SMALL_QUARTZ_BRICKS, SlateBlocks.SMALL_QUARTZ_BRICKS);

        //offerChiseledBlockRecipe(exporter, RecipeCategory.MISC, SlateBlocks.CHISELED_SLATE, SlateBlocks.COBBLED_SLATE_SLAB);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,SlateBlocks.SLATE_PILLAR, 2)
                .pattern("x")
                .pattern("x")
                .input('x', Ingredient.ofItems(SlateBlocks.POLISHED_SLATE_SLAB))
                .criterion(hasItem(SlateBlocks.SLATE_BLOCK), conditionsFromItem(SlateBlocks.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(SlateBlocks.SLATE_PILLAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,SlateBlocks.SLATE_LANTERN, 1)
                .pattern(" y ")
                .pattern("yxy")
                .pattern(" y ")
                .input('y', Ingredient.ofItems(ModItems.SLATE))
                .input('x', Ingredient.ofItems(Blocks.GLOWSTONE))
                .criterion(hasItem(SlateBlocks.SLATE_BLOCK), conditionsFromItem(SlateBlocks.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(SlateBlocks.SLATE_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,SlateBlocks.QUARTZ_LANTERN, 1)
                .pattern(" y ")
                .pattern("yxy")
                .pattern(" y ")
                .input('y', Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .input('x', Ingredient.ofItems(Blocks.GLOWSTONE))
                .criterion(hasItem(SlateBlocks.SLATE_BLOCK), conditionsFromItem(SlateBlocks.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(SlateBlocks.QUARTZ_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,SlateBlocks.SLATE_TILES, 2)
                .pattern("yx")
                .pattern("xy")
                .input('x', Ingredient.ofItems(SlateBlocks.SMOOTH_SLATE))
                .input('y', Ingredient.ofItems(SlateBlocks.POLISHED_SLATE))
                .criterion(hasItem(SlateBlocks.SLATE_BLOCK), conditionsFromItem(SlateBlocks.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(SlateBlocks.SLATE_TILES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,SlateBlocks.QUARTZ_TILES, 2)
                .pattern("yx")
                .pattern("xy")
                .input('x', Ingredient.ofItems(Blocks.SMOOTH_QUARTZ))
                .input('y', Ingredient.ofItems(SlateBlocks.POLISHED_QUARTZ))
                .criterion(hasItem(SlateBlocks.SLATE_BLOCK), conditionsFromItem(SlateBlocks.SLATE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(SlateBlocks.QUARTZ_TILES)));

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.SLATE_BLOCK_SLAB,SlateBlocks.SLATE_BLOCK);
        //offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.COBBLED_SLATE_SLAB,SlateBlocks.COBBLED_SLATE);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.SMOOTH_SLATE_SLAB,SlateBlocks.SMOOTH_SLATE);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.POLISHED_SLATE_SLAB,SlateBlocks.POLISHED_SLATE);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.SLATE_BRICK_SLAB,SlateBlocks.SLATE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.CRACKED_SLATE_BRICK_SLAB,SlateBlocks.CRACKED_SLATE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.SMALL_SLATE_BRICK_SLAB,SlateBlocks.SMALL_SLATE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB,SlateBlocks.CRACKED_SMALL_SLATE_BRICKS);



        createStairsRecipe(SlateBlocks.SLATE_BLOCK_STAIRS, Ingredient.ofItems(SlateBlocks.SLATE_BLOCK));
        //createStairsRecipe(SlateBlocks.COBBLED_SLATE_STAIRS, Ingredient.ofItems(SlateBlocks.COBBLED_SLATE));
        createStairsRecipe(SlateBlocks.SMOOTH_SLATE_STAIRS, Ingredient.ofItems(SlateBlocks.SMOOTH_SLATE));
        createStairsRecipe(SlateBlocks.POLISHED_SLATE_STAIRS, Ingredient.ofItems(SlateBlocks.POLISHED_SLATE));
        createStairsRecipe(SlateBlocks.SLATE_BRICK_STAIRS, Ingredient.ofItems(SlateBlocks.SLATE_BRICKS));
        createStairsRecipe(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS, Ingredient.ofItems(SlateBlocks.CRACKED_SLATE_BRICKS));
        createStairsRecipe(SlateBlocks.SMALL_SLATE_BRICK_STAIRS, Ingredient.ofItems(SlateBlocks.SMALL_SLATE_BRICKS));
        createStairsRecipe(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS, Ingredient.ofItems(SlateBlocks.CRACKED_SMALL_SLATE_BRICKS));

        //offerSmelting(exporter, List.of(SlateBlocks.COBBLED_QUARTZ), RecipeCategory.MISC, Blocks.QUARTZ_BLOCK,
                //0.7f, 200, "quartz");

        offerSmelting(exporter, List.of(Blocks.QUARTZ_BLOCK), RecipeCategory.MISC, Blocks.SMOOTH_QUARTZ,
                0.7f, 200, "quartz");




    }
}
