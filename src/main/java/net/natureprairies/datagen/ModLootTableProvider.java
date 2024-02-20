package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.natureprairies.block.ModFlowers;
import net.natureprairies.block.SlateBlocks;
import net.natureprairies.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(SlateBlocks.SLATE_BLOCK);
        addDrop(SlateBlocks.SLATE_BLOCK_STAIRS);
        addDrop(SlateBlocks.SLATE_BLOCK_SLAB);

        //addDrop(SlateBlocks.COBBLED_SLATE);
        //addDrop(SlateBlocks.COBBLED_SLATE_STAIRS);
        //addDrop(SlateBlocks.COBBLED_SLATE_SLAB);

        addDrop(SlateBlocks.SMOOTH_SLATE);
        addDrop(SlateBlocks.SMOOTH_SLATE_STAIRS);
        addDrop(SlateBlocks.SMOOTH_SLATE_SLAB);

        addDrop(SlateBlocks.POLISHED_SLATE);
        addDrop(SlateBlocks.POLISHED_SLATE_STAIRS);
        addDrop(SlateBlocks.POLISHED_SLATE_SLAB);

        addDrop(SlateBlocks.SLATE_BRICKS);
        addDrop(SlateBlocks.SLATE_BRICK_STAIRS);
        addDrop(SlateBlocks.SLATE_BRICK_SLAB);
        addDrop(SlateBlocks.CRACKED_SLATE_BRICKS);
        addDrop(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS);
        addDrop(SlateBlocks.CRACKED_SLATE_BRICK_SLAB);

        addDrop(SlateBlocks.SMALL_SLATE_BRICKS);
        addDrop(SlateBlocks.SMALL_SLATE_BRICK_STAIRS);
        addDrop(SlateBlocks.SMALL_SLATE_BRICK_SLAB);
        addDrop(SlateBlocks.CRACKED_SMALL_SLATE_BRICKS);
        addDrop(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS);
        addDrop(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB);

        addDrop(SlateBlocks.SLATE_PILLAR);
        addDrop(SlateBlocks.SLATE_TILES);
        addDrop(SlateBlocks.CHISELED_SLATE);

        addDrop(Blocks.QUARTZ_BLOCK);

        //addDrop(SlateBlocks.COBBLED_QUARTZ);
        //addDrop(SlateBlocks.COBBLED_QUARTZ_STAIRS);
        //addDrop(SlateBlocks.COBBLED_QUARTZ_SLAB);

        //addDrop(Blocks.SMOOTH_QUARTZ);
        //addDrop(Blocks.SMOOTH_QUARTZ_STAIRS);
        //addDrop(Blocks.SMOOTH_QUARTZ_SLAB);

        addDrop(SlateBlocks.POLISHED_QUARTZ);
        addDrop(SlateBlocks.POLISHED_QUARTZ_STAIRS);
        addDrop(SlateBlocks.POLISHED_QUARTZ_SLAB);

        //addDrop(Blocks.QUARTZ_BRICKS);
        addDrop(SlateBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(SlateBlocks.QUARTZ_BRICK_SLAB);

        addDrop(SlateBlocks.CRACKED_QUARTZ_BRICKS);
        addDrop(SlateBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
        addDrop(SlateBlocks.CRACKED_QUARTZ_BRICK_SLAB);

        addDrop(SlateBlocks.SMALL_QUARTZ_BRICKS);
        addDrop(SlateBlocks.SMALL_QUARTZ_BRICK_STAIRS);
        addDrop(SlateBlocks.SMALL_QUARTZ_BRICK_SLAB);

        addDrop(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICKS);
        addDrop(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_STAIRS);
        addDrop(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_SLAB);

        addDrop(SlateBlocks.QUARTZ_TILES);
        //addDrop(Blocks.CHISELED_QUARTZ_BLOCK);
        //addDrop(Blocks.QUARTZ_PILLAR);

        addDrop(SlateBlocks.SLATE_LANTERN);
        addDrop(SlateBlocks.QUARTZ_LANTERN);

        addDrop(SlateBlocks.OVERGROWN_SLATE, dropsWithSilkTouch(SlateBlocks.OVERGROWN_SLATE, ItemEntry.builder(SlateBlocks.SLATE_BLOCK)));

        addDrop(ModFlowers.LAWENDER);
        addDrop(ModFlowers.PINK_LAWENDER);
        addDrop(ModFlowers.BLUE_LAVENDER);
        addDrop(ModFlowers.CLOVER);
        addDrop(ModFlowers.CROCUS);
        addDrop(ModFlowers.PUSHKINIA);
        addPottedPlantDrops(ModFlowers.POTTED_LAWENDER);
        addPottedPlantDrops(ModFlowers.POTTED_PINK_LAWENDER);
        addPottedPlantDrops(ModFlowers.POTTED_BLUE_LAVENDER);
        addPottedPlantDrops(ModFlowers.POTTED_CLOVER);
        addPottedPlantDrops(ModFlowers.POTTED_CROCUS);
        addPottedPlantDrops(ModFlowers.POTTED_PUSHKINIA);

        addDrop(SlateBlocks.SLATE_ORE, copperLikeOreDrops(SlateBlocks.SLATE_ORE, ModItems.SLATE));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 7.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
