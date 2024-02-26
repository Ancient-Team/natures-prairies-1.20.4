package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.natureprairies.block.ModFlowers;
import net.natureprairies.block.SlateBlocks;
import net.natureprairies.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool slatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.SLATE_BLOCK);
        //BlockStateModelGenerator.BlockTexturePool cobbledSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.COBBLED_SLATE);
        BlockStateModelGenerator.BlockTexturePool smoothSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.SMOOTH_SLATE);
        BlockStateModelGenerator.BlockTexturePool polishedSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.POLISHED_SLATE);
        BlockStateModelGenerator.BlockTexturePool slateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.SLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedSlateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.CRACKED_SLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smallSlateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.SMALL_SLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedSmallSlateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.CRACKED_SMALL_SLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.POLISHED_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool quartzBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BLOCK);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        //BlockStateModelGenerator.BlockTexturePool cobbledQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.COBBLED_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool crackedQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.CRACKED_QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smallQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.SMALL_QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedSmallQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICKS);

        Identifier slateId = ModelIds.getBlockModelId(SlateBlocks.SLATE_BLOCK);
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.BOTTOM, slateId)
                .inherit(TextureKey.BOTTOM, TextureKey.PARTICLE)
                .put(TextureKey.TOP, TextureMap.getSubId(SlateBlocks.OVERGROWN_SLATE, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(SlateBlocks.OVERGROWN_SLATE, "_side"));
        Models.CUBE_BOTTOM_TOP.upload(SlateBlocks.OVERGROWN_SLATE, textureMap, blockStateModelGenerator.modelCollector);

        BlockStateVariant[] blockStateVariants = BlockStateModelGenerator.createModelVariantWithRandomHorizontalRotations(ModelIds.getBlockModelId(SlateBlocks.OVERGROWN_SLATE));
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(SlateBlocks.OVERGROWN_SLATE, blockStateVariants));

        blockStateModelGenerator.registerSimpleCubeAll(SlateBlocks.SLATE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(SlateBlocks.SLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(SlateBlocks.QUARTZ_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(SlateBlocks.CHISELED_SLATE);
        blockStateModelGenerator.registerSimpleCubeAll(SlateBlocks.SLATE_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(SlateBlocks.QUARTZ_LANTERN);

        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.LAWENDER, ModFlowers.POTTED_LAWENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.PINK_LAWENDER, ModFlowers.POTTED_PINK_LAWENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.BLUE_LAVENDER, ModFlowers.POTTED_BLUE_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.CLOVES, ModFlowers.POTTED_CLOVES, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.CROCUS, ModFlowers.POTTED_CROCUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.PUSHKINIA, ModFlowers.POTTED_PUSHKINIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.RED_ROSE, ModFlowers.POTTED_RED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);

        slatePool.stairs(SlateBlocks.SLATE_BLOCK_STAIRS);
        slatePool.slab(SlateBlocks.SLATE_BLOCK_SLAB);
        slatePool.wall(SlateBlocks.SLATE_BLOCK_WALL);

        //quartzBlockPool.stairs(Blocks.QUARTZ_STAIRS);
        //quartzBlockPool.slab(Blocks.QUARTZ_SLAB);
        //quartzBlockPool.wall(SlateBlocks.QUARTZ_BLOCK_WALL);


        //cobbledSlatePool.stairs(SlateBlocks.COBBLED_SLATE_STAIRS);
        //cobbledSlatePool.slab(SlateBlocks.COBBLED_SLATE_SLAB);

        //cobbledQuartzPool.stairs(SlateBlocks.COBBLED_QUARTZ_STAIRS);
        //cobbledQuartzPool.slab(SlateBlocks.COBBLED_QUARTZ_SLAB);

        smoothSlatePool.stairs(SlateBlocks.SMOOTH_SLATE_STAIRS);
        smoothSlatePool.slab(SlateBlocks.SMOOTH_SLATE_SLAB);
        smoothSlatePool.wall(SlateBlocks.SMOOTH_SLATE_WALL);

        smoothQuartzPool.stairs(Blocks.SMOOTH_QUARTZ_STAIRS);
        smoothQuartzPool.slab(Blocks.SMOOTH_QUARTZ_SLAB);
        smoothQuartzPool.wall(SlateBlocks.SMOOTH_QUARTZ_WALL);

        polishedSlatePool.slab(SlateBlocks.POLISHED_SLATE_SLAB);
        polishedSlatePool.stairs(SlateBlocks.POLISHED_SLATE_STAIRS);
        polishedSlatePool.wall(SlateBlocks.POLISHED_SLATE_WALL);

        polishedQuartzPool.slab(SlateBlocks.POLISHED_QUARTZ_SLAB);
        polishedQuartzPool.stairs(SlateBlocks.POLISHED_QUARTZ_STAIRS);
        polishedQuartzPool.wall(SlateBlocks.POLISHED_QUARTZ_WALL);

        slateBrickPool.slab(SlateBlocks.SLATE_BRICK_SLAB);
        slateBrickPool.stairs(SlateBlocks.SLATE_BRICK_STAIRS);
        slateBrickPool.wall(SlateBlocks.SLATE_BRICK_WALL);

        quartzBrickPool.slab(SlateBlocks.QUARTZ_BRICK_SLAB);
        quartzBrickPool.stairs(SlateBlocks.QUARTZ_BRICK_STAIRS);
        quartzBrickPool.wall(SlateBlocks.QUARTZ_BRICK_WALL);

        crackedSlateBrickPool.slab(SlateBlocks.CRACKED_SLATE_BRICK_SLAB);
        crackedSlateBrickPool.stairs(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS);
        crackedSlateBrickPool.wall(SlateBlocks.CRACKED_SLATE_BRICK_WALL);

        crackedQuartzBrickPool.slab(SlateBlocks.CRACKED_QUARTZ_BRICK_SLAB);
        crackedQuartzBrickPool.stairs(SlateBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
        crackedQuartzBrickPool.wall(SlateBlocks.CRACKED_QUARTZ_BRICK_WALL);

        smallSlateBrickPool.slab(SlateBlocks.SMALL_SLATE_BRICK_SLAB);
        smallSlateBrickPool.stairs(SlateBlocks.SMALL_SLATE_BRICK_STAIRS);
        smallSlateBrickPool.wall(SlateBlocks.SMALL_SLATE_BRICK_WALL);

        smallQuartzBrickPool.slab(SlateBlocks.SMALL_QUARTZ_BRICK_SLAB);
        smallQuartzBrickPool.stairs(SlateBlocks.SMALL_QUARTZ_BRICK_STAIRS);
        smallQuartzBrickPool.wall(SlateBlocks.SMALL_QUARTZ_BRICK_WALL);

        crackedSmallSlateBrickPool.slab(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB);
        crackedSmallSlateBrickPool.stairs(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS);
        crackedSmallSlateBrickPool.wall(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_WALL);

        crackedSmallQuartzBrickPool.slab(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_SLAB);
        crackedSmallQuartzBrickPool.stairs(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_STAIRS);
        crackedSmallQuartzBrickPool.wall(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.SLATE, Models.GENERATED);

    }
}
