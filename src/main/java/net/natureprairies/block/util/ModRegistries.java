package net.natureprairies.block.util;

import net.minecraft.block.ComposterBlock;
import net.natureprairies.block.Flowers;

public class ModRegistries {
    public static void registerModRegistries() {
        registerModCompostables();
    }

    private static void registerModCompostables() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Flowers.LAWENDER, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Flowers.BLUE_LAVENDER, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Flowers.PINK_LAWENDER, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Flowers.CLOVES, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Flowers.CROCUS, 0.9f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Flowers.PUSHKINIA, 0.9f);
    }
}
