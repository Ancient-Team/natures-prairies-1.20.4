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
import net.natureprairies.block.Flowers;
import net.natureprairies.block.Quartz;
import net.natureprairies.block.Slate;
import net.natureprairies.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Slate.SLATE_BLOCK);
        addDrop(Slate.SLATE_BLOCK_STAIRS);
        addDrop(Slate.SLATE_BLOCK_SLAB);
        addDrop(Slate.SLATE_BLOCK_WALL);

        addDrop(Quartz.QUARTZ_BLOCK_WALL);

        addDrop(Slate.SMOOTH_SLATE);
        addDrop(Slate.SMOOTH_SLATE_STAIRS);
        addDrop(Slate.SMOOTH_SLATE_SLAB);
        addDrop(Slate.SMOOTH_SLATE_WALL);

        addDrop(Quartz.SMOOTH_QUARTZ_WALL);

        addDrop(Slate.POLISHED_SLATE);
        addDrop(Slate.POLISHED_SLATE_STAIRS);
        addDrop(Slate.POLISHED_SLATE_SLAB);
        addDrop(Slate.POLISHED_SLATE_WALL);

        addDrop(Slate.SLATE_BRICKS);
        addDrop(Slate.SLATE_BRICK_STAIRS);
        addDrop(Slate.SLATE_BRICK_SLAB);
        addDrop(Slate.SLATE_BRICK_WALL);
        addDrop(Slate.CRACKED_SLATE_BRICKS);

        addDrop(Slate.SMALL_SLATE_BRICKS);
        addDrop(Slate.SMALL_SLATE_BRICK_STAIRS);
        addDrop(Slate.SMALL_SLATE_BRICK_SLAB);
        addDrop(Slate.SMALL_SLATE_BRICK_WALL);
        addDrop(Slate.CRACKED_SMALL_SLATE_BRICKS);

        addDrop(Slate.SLATE_PILLAR);
        addDrop(Slate.SLATE_TILES);
        addDrop(Slate.CHISELED_SLATE);

        addDrop(Quartz.POLISHED_QUARTZ);
        addDrop(Quartz.POLISHED_QUARTZ_STAIRS);
        addDrop(Quartz.POLISHED_QUARTZ_SLAB);
        addDrop(Quartz.POLISHED_QUARTZ_WALL);

        addDrop(Quartz.QUARTZ_BRICK_STAIRS);
        addDrop(Quartz.QUARTZ_BRICK_SLAB);
        addDrop(Quartz.QUARTZ_BRICK_WALL);
        addDrop(Quartz.CRACKED_QUARTZ_BRICKS);

        addDrop(Quartz.SMALL_QUARTZ_BRICKS);
        addDrop(Quartz.SMALL_QUARTZ_BRICK_STAIRS);
        addDrop(Quartz.SMALL_QUARTZ_BRICK_SLAB);
        addDrop(Quartz.SMALL_QUARTZ_BRICK_WALL);
        addDrop(Quartz.CRACKED_SMALL_QUARTZ_BRICKS);

        addDrop(Quartz.QUARTZ_TILES);

        addDrop(Slate.SLATE_LANTERN);
        addDrop(Quartz.QUARTZ_LANTERN);

        addDrop(Slate.OVERGROWN_SLATE, dropsWithSilkTouch(Slate.OVERGROWN_SLATE, ItemEntry.builder(Slate.SLATE_BLOCK)));
        addDrop(Quartz.OVERGROWN_QUARTZ, dropsWithSilkTouch(Quartz.OVERGROWN_QUARTZ, ItemEntry.builder(Blocks.QUARTZ_BLOCK)));

        addDrop(Flowers.LAWENDER);
        addDrop(Flowers.PINK_LAWENDER);
        addDrop(Flowers.BLUE_LAVENDER);
        addDrop(Flowers.CLOVES);
        addDrop(Flowers.CROCUS);
        addDrop(Flowers.PUSHKINIA);
        addDrop(Flowers.RED_ROSE);
        addPottedPlantDrops(Flowers.POTTED_LAWENDER);
        addPottedPlantDrops(Flowers.POTTED_PINK_LAWENDER);
        addPottedPlantDrops(Flowers.POTTED_BLUE_LAVENDER);
        addPottedPlantDrops(Flowers.POTTED_CLOVES);
        addPottedPlantDrops(Flowers.POTTED_CROCUS);
        addPottedPlantDrops(Flowers.POTTED_PUSHKINIA);
        addPottedPlantDrops(Flowers.POTTED_RED_ROSE);

        addDrop(Slate.DEEPSLATE_SLATE_ORE, copperLikeOreDrops(Slate.DEEPSLATE_SLATE_ORE, ModItems.SLATE));
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
