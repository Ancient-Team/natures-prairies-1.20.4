package net.natureprairies.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.natureprairies.block.Flowers;
import net.natureprairies.world.biome.Modbiomes;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule LAVENDER = makeStateRule(Flowers.LAWENDER);
    private static final MaterialRules.MaterialRule BLUE_LAVENDER = makeStateRule(Flowers.BLUE_LAVENDER);

    private static final MaterialRules.MaterialRule PINK_LAVENDER = makeStateRule(Flowers.PINK_LAWENDER);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, LAVENDER), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(Modbiomes.HIGHLANDS_LAVENDER_FIELDS),
                                MaterialRules.condition(MaterialRules.surface(), LAVENDER)),
                        MaterialRules.condition(MaterialRules.surface(), BLUE_LAVENDER)),
                MaterialRules.condition(MaterialRules.surface(), PINK_LAVENDER)
        );
    }
    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
