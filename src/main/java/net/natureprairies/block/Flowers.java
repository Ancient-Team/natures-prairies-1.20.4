package net.natureprairies.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.natureprairies.NaturesPrairies;

public class Flowers {


    public static final Block LAWENDER = registerBlock("lawender",
            new FlowerBlock(StatusEffects.REGENERATION, 5, FabricBlockSettings
                    .copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    public static final Block POTTED_LAWENDER = Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, "potted_lawender"),
            new FlowerPotBlock(LAWENDER, FabricBlockSettings
                    .copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));


    public static final Block PINK_LAWENDER = registerBlock("pink_lawender",
            new FlowerBlock(StatusEffects.REGENERATION, 10, FabricBlockSettings
                    .copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    public static final Block POTTED_PINK_LAWENDER = Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, "potted_pink_lawender"),
            new FlowerPotBlock(PINK_LAWENDER, FabricBlockSettings
                    .copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));


    public static final Block BLUE_LAVENDER = registerBlock("blue_lavender",
            new FlowerBlock(StatusEffects.REGENERATION, 15, FabricBlockSettings
                    .copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    public static final Block POTTED_BLUE_LAVENDER = Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, "potted_blue_lavender"),
            new FlowerPotBlock(BLUE_LAVENDER, FabricBlockSettings
                    .copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));


    public static final Block CLOVES = registerBlock("cloves",
            new FlowerBlock(StatusEffects.ABSORPTION, 11, FabricBlockSettings
                    .copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    public static final Block POTTED_CLOVES = Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, "potted_clover"),
            new FlowerPotBlock(CLOVES, FabricBlockSettings
                    .copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));


    public static final Block CROCUS = registerBlock("crocus",
            new FlowerBlock(StatusEffects.ABSORPTION, 6, FabricBlockSettings
                    .copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    public static final Block POTTED_CROCUS = Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, "potted_crocus"),
            new FlowerPotBlock(CROCUS, FabricBlockSettings
                    .copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));


    public static final Block PUSHKINIA = registerBlock("pushkinia",
            new FlowerBlock(StatusEffects.SATURATION, 7, FabricBlockSettings
                    .copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    public static final Block POTTED_PUSHKINIA = Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, "potted_pushkinia"),
            new FlowerPotBlock(PUSHKINIA, FabricBlockSettings
                    .copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));


    public static final Block RED_ROSE = registerBlock("red_rose",
            new FlowerBlock(StatusEffects.HEALTH_BOOST, 9, FabricBlockSettings
                    .copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    public static final Block POTTED_RED_ROSE = Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, "potted_red_rose"),
            new FlowerPotBlock(RED_ROSE, FabricBlockSettings
                    .copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NaturesPrairies.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NaturesPrairies.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerFlowersModule() {
        NaturesPrairies.LOGGER.info("Registering Flowers for " + NaturesPrairies.MODID);
    }
}
