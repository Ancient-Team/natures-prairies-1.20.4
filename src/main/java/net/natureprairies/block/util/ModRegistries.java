package net.natureprairies.block.util;

import net.minecraft.block.ComposterBlock;
import net.natureprairies.block.ModFlowers;

public class ModRegistries {
    public static void registerModRegistries() {
        registerModCompostables();
    }

    private static void registerModCompostables() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModFlowers.LAWENDER, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModFlowers.BLUE_LAVENDER, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModFlowers.PINK_LAWENDER, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModFlowers.CLOVER, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModFlowers.CROCUS, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModFlowers.PUSHKINIA, 0.9f);
    }
}
