package net.natureprairies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.natureprairies.NaturesPrairies;
import net.natureprairies.block.SlateBlocks;
import net.natureprairies.block.ModFlowers;

import java.util.List;

public class ModItemGroups {

    public static final ItemGroup NATURES_PRAIRIES_FOLIAGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NaturesPrairies.MODID, "natureprairiesfoliage"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.natureprairiesfoliage"))
                    .icon(() -> new ItemStack(ModFlowers.LAWENDER)).entries((displayContext, entries) -> {
                        entries.add(ModFlowers.LAWENDER);
                        entries.add(ModFlowers.PINK_LAWENDER);
                        entries.add(ModFlowers.BLUE_LAVENDER);
                        entries.add(ModFlowers.CLOVES);
                        entries.add(ModFlowers.CROCUS);
                        entries.add(ModFlowers.PUSHKINIA);
                        entries.add(ModFlowers.RED_ROSE);
                    }).build());
    public static final ItemGroup NATURES_PRAIRIES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NaturesPrairies.MODID, "natureprairies"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.natureprairies"))
                    .icon(() -> new ItemStack(ModItems.SLATE)).entries((displayContext, entries) -> {

                        entries.add(SlateBlocks.SLATE_BLOCK);
                        //entries.add(SlateBlocks.COBBLED_SLATE);
                        entries.add(SlateBlocks.SMOOTH_SLATE);
                        entries.add(SlateBlocks.POLISHED_SLATE);
                        entries.add(SlateBlocks.SLATE_BRICKS);
                        entries.add(SlateBlocks.CRACKED_SLATE_BRICKS);
                        entries.add(SlateBlocks.SMALL_SLATE_BRICKS);
                        entries.add(SlateBlocks.CRACKED_SMALL_SLATE_BRICKS);


                        entries.add(SlateBlocks.SLATE_TILES);

                        entries.add(SlateBlocks.SLATE_BLOCK_STAIRS);
                        //entries.add(SlateBlocks.COBBLED_SLATE_STAIRS);
                        entries.add(SlateBlocks.SMOOTH_SLATE_STAIRS);
                        entries.add(SlateBlocks.POLISHED_SLATE_STAIRS);
                        entries.add(SlateBlocks.SLATE_BRICK_STAIRS);
                        entries.add(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS);
                        entries.add(SlateBlocks.SMALL_SLATE_BRICK_STAIRS);
                        entries.add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS);



                        entries.add(SlateBlocks.CHISELED_SLATE);

                        entries.add(SlateBlocks.SLATE_BLOCK_SLAB);
                        //entries.add(SlateBlocks.COBBLED_SLATE_SLAB);
                        entries.add(SlateBlocks.SMOOTH_SLATE_SLAB);
                        entries.add(SlateBlocks.POLISHED_SLATE_SLAB);
                        entries.add(SlateBlocks.SLATE_BRICK_SLAB);
                        entries.add(SlateBlocks.CRACKED_SLATE_BRICK_SLAB);
                        entries.add(SlateBlocks.SMALL_SLATE_BRICK_SLAB);
                        entries.add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB);

                        entries.add(SlateBlocks.SLATE_LANTERN);

                        entries.add(SlateBlocks.SLATE_BLOCK_WALL);
                        entries.add(SlateBlocks.SMOOTH_SLATE_WALL);
                        entries.add(SlateBlocks.POLISHED_SLATE_WALL);
                        entries.add(SlateBlocks.SLATE_BRICK_WALL);
                        entries.add(SlateBlocks.CRACKED_SLATE_BRICK_WALL);
                        entries.add(SlateBlocks.SMALL_SLATE_BRICK_WALL);
                        entries.add(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_WALL);

                        entries.add(SlateBlocks.SLATE_PILLAR);

                        //entries.add(SlateBlocks.OVERGROWN_SLATE);


                        entries.add(Blocks.QUARTZ_BLOCK);
                        //entries.add(SlateBlocks.COBBLED_QUARTZ);
                        entries.add(Blocks.SMOOTH_QUARTZ);
                        entries.add(SlateBlocks.POLISHED_QUARTZ);
                        entries.add(Blocks.QUARTZ_BRICKS);
                        entries.add(SlateBlocks.CRACKED_QUARTZ_BRICKS);
                        entries.add(SlateBlocks.SMALL_QUARTZ_BRICKS);
                        entries.add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICKS);

                        entries.add(SlateBlocks.QUARTZ_TILES);

                        entries.add(Blocks.QUARTZ_STAIRS);
                        //entries.add(SlateBlocks.COBBLED_QUARTZ_STAIRS);
                        entries.add(Blocks.SMOOTH_QUARTZ_STAIRS);
                        entries.add(SlateBlocks.POLISHED_QUARTZ_STAIRS);
                        entries.add(SlateBlocks.QUARTZ_BRICK_STAIRS);
                        entries.add(SlateBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
                        entries.add(SlateBlocks.SMALL_QUARTZ_BRICK_STAIRS);
                        entries.add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_STAIRS);


                        entries.add(Blocks.CHISELED_QUARTZ_BLOCK);

                        entries.add(Blocks.QUARTZ_SLAB);
                        //entries.add(SlateBlocks.COBBLED_QUARTZ_SLAB);
                        entries.add(Blocks.SMOOTH_QUARTZ_SLAB);
                        entries.add(SlateBlocks.POLISHED_QUARTZ_SLAB);
                        entries.add(SlateBlocks.QUARTZ_BRICK_SLAB);
                        entries.add(SlateBlocks.CRACKED_QUARTZ_BRICK_SLAB);
                        entries.add(SlateBlocks.SMALL_QUARTZ_BRICK_SLAB);
                        entries.add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_SLAB);

                        entries.add(SlateBlocks.QUARTZ_LANTERN);

                        entries.add(SlateBlocks.QUARTZ_BLOCK_WALL);
                        entries.add(SlateBlocks.SMOOTH_QUARTZ_WALL);
                        entries.add(SlateBlocks.POLISHED_QUARTZ_WALL);
                        entries.add(SlateBlocks.QUARTZ_BRICK_WALL);
                        entries.add(SlateBlocks.CRACKED_QUARTZ_BRICK_WALL);
                        entries.add(SlateBlocks.SMALL_QUARTZ_BRICK_WALL);
                        entries.add(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_WALL);

                        entries.add(Blocks.QUARTZ_PILLAR);



                        entries.add(SlateBlocks.SLATE_ORE);
                        entries.add(ModItems.SLATE);

                        entries.add(Blocks.NETHER_QUARTZ_ORE);
                        entries.add(Items.QUARTZ);







                    }).build());


    public static void registerItemGroups() {
        NaturesPrairies.LOGGER.info("Registering Item Groups for " + NaturesPrairies.MODID);
    }
}