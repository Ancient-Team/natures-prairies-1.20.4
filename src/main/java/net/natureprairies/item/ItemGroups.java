package net.natureprairies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.natureprairies.NaturesPrairies;
import net.natureprairies.block.Ceramic;
import net.natureprairies.block.Flowers;
import net.natureprairies.block.Quartz;
import net.natureprairies.block.Slate;

public class ItemGroups {

    public static final ItemGroup NATURES_PRAIRIES_FOLIAGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NaturesPrairies.MODID, "natureprairiesfoliage"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.natureprairiesfoliage"))
                    .icon(() -> new ItemStack(Flowers.LAWENDER)).entries((displayContext, entries) -> {
                        entries.add(Flowers.LAWENDER);
                        entries.add(Flowers.PINK_LAWENDER);
                        entries.add(Flowers.BLUE_LAVENDER);
                        entries.add(Flowers.CLOVES);
                        entries.add(Flowers.CROCUS);
                        entries.add(Flowers.PUSHKINIA);
                        entries.add(Flowers.RED_ROSE);
                    }).build());
    public static final ItemGroup NATURES_PRAIRIES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NaturesPrairies.MODID, "natureprairies"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.natureprairies"))
                    .icon(() -> new ItemStack(ModItems.SLATE)).entries((displayContext, entries) -> {

                        entries.add(Slate.SLATE_BLOCK);
                        entries.add(Slate.SMOOTH_SLATE);
                        entries.add(Slate.POLISHED_SLATE);
                        entries.add(Slate.SLATE_BRICKS);
                        entries.add(Slate.CRACKED_SLATE_BRICKS);
                        entries.add(Slate.SMALL_SLATE_BRICKS);
                        entries.add(Slate.CRACKED_SMALL_SLATE_BRICKS);


                        entries.add(Slate.SLATE_TILES);

                        entries.add(Slate.SLATE_BLOCK_STAIRS);
                        entries.add(Slate.SMOOTH_SLATE_STAIRS);
                        entries.add(Slate.POLISHED_SLATE_STAIRS);
                        entries.add(Slate.SLATE_BRICK_STAIRS);
                        entries.add(Slate.SMALL_SLATE_BRICK_STAIRS);




                        entries.add(Slate.CHISELED_SLATE);

                        entries.add(Slate.SLATE_BLOCK_SLAB);
                        entries.add(Slate.SMOOTH_SLATE_SLAB);
                        entries.add(Slate.POLISHED_SLATE_SLAB);
                        entries.add(Slate.SLATE_BRICK_SLAB);
                        entries.add(Slate.SMALL_SLATE_BRICK_SLAB);

                        entries.add(Slate.SLATE_LANTERN);

                        entries.add(Slate.SLATE_BLOCK_WALL);
                        entries.add(Slate.SMOOTH_SLATE_WALL);
                        entries.add(Slate.POLISHED_SLATE_WALL);
                        entries.add(Slate.SLATE_BRICK_WALL);
                        entries.add(Slate.SMALL_SLATE_BRICK_WALL);

                        entries.add(Slate.SLATE_PILLAR);



                        entries.add(Blocks.QUARTZ_BLOCK);
                        entries.add(Blocks.SMOOTH_QUARTZ);
                        entries.add(Quartz.POLISHED_QUARTZ);
                        entries.add(Blocks.QUARTZ_BRICKS);
                        entries.add(Quartz.CRACKED_QUARTZ_BRICKS);
                        entries.add(Quartz.SMALL_QUARTZ_BRICKS);
                        entries.add(Quartz.CRACKED_SMALL_QUARTZ_BRICKS);

                        entries.add(Quartz.QUARTZ_TILES);

                        entries.add(Blocks.QUARTZ_STAIRS);
                        entries.add(Blocks.SMOOTH_QUARTZ_STAIRS);
                        entries.add(Quartz.POLISHED_QUARTZ_STAIRS);
                        entries.add(Quartz.QUARTZ_BRICK_STAIRS);
                        entries.add(Quartz.SMALL_QUARTZ_BRICK_STAIRS);


                        entries.add(Blocks.CHISELED_QUARTZ_BLOCK);

                        entries.add(Blocks.QUARTZ_SLAB);
                        entries.add(Blocks.SMOOTH_QUARTZ_SLAB);
                        entries.add(Quartz.POLISHED_QUARTZ_SLAB);
                        entries.add(Quartz.QUARTZ_BRICK_SLAB);
                        entries.add(Quartz.SMALL_QUARTZ_BRICK_SLAB);

                        entries.add(Quartz.QUARTZ_LANTERN);

                        entries.add(Quartz.QUARTZ_BLOCK_WALL);
                        entries.add(Quartz.SMOOTH_QUARTZ_WALL);
                        entries.add(Quartz.POLISHED_QUARTZ_WALL);
                        entries.add(Quartz.QUARTZ_BRICK_WALL);
                        entries.add(Quartz.SMALL_QUARTZ_BRICK_WALL);


                        entries.add(Blocks.QUARTZ_PILLAR);



                        entries.add(Slate.DEEPSLATE_SLATE_ORE);
                        entries.add(ModItems.SLATE);

                        entries.add(Blocks.NETHER_QUARTZ_ORE);
                        entries.add(Items.QUARTZ);

                        //entries.add(Ceramic.CERAMIC_BLEND);
                        //entries.add(Ceramic.CERAMIC_BLOCK);
                        //entries.add(Ceramic.CERAMIC_SHINGLES);
                        //entries.add(Ceramic.CERAMIC_SHINGLES_SLAB);
                        //entries.add(Ceramic.CERAMIC_SHINGLES_STAIRS);

                        //entries.add(ModItems.CERAMIC_BLEND_LUMP);
                        //entries.add(ModItems.CERAMIC_LUMP);

                        //entries.add(Slate.OVERGROWN_SLATE);
                        //entries.add(Quartz.OVERGROWN_QUARTZ);

                    }).build());


    public static void registerItemGroupsModule() {
        NaturesPrairies.LOGGER.info("Registering ItemGroups for " + NaturesPrairies.MODID);
    }
}