package net.natureprairies.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();
        ModFlowerGeneration.generateFlowers();
    }
}