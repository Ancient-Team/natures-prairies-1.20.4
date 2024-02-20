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
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.CLOVER, ModFlowers.POTTED_CLOVER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.CROCUS, ModFlowers.POTTED_CROCUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModFlowers.PUSHKINIA, ModFlowers.POTTED_PUSHKINIA, BlockStateModelGenerator.TintType.NOT_TINTED);

        slatePool.stairs(SlateBlocks.SLATE_BLOCK_STAIRS);
        slatePool.slab(SlateBlocks.SLATE_BLOCK_SLAB);

        quartzBlockPool.stairs(Blocks.QUARTZ_STAIRS);
        quartzBlockPool.slab(Blocks.QUARTZ_SLAB);

        //cobbledSlatePool.stairs(SlateBlocks.COBBLED_SLATE_STAIRS);
        //cobbledSlatePool.slab(SlateBlocks.COBBLED_SLATE_SLAB);

        //cobbledQuartzPool.stairs(SlateBlocks.COBBLED_QUARTZ_STAIRS);
        //cobbledQuartzPool.slab(SlateBlocks.COBBLED_QUARTZ_SLAB);

        smoothSlatePool.stairs(SlateBlocks.SMOOTH_SLATE_STAIRS);
        smoothSlatePool.slab(SlateBlocks.SMOOTH_SLATE_SLAB);

        smoothQuartzPool.stairs(Blocks.SMOOTH_QUARTZ_STAIRS);
        smoothQuartzPool.slab(Blocks.SMOOTH_QUARTZ_SLAB);

        polishedSlatePool.slab(SlateBlocks.POLISHED_SLATE_SLAB);
        polishedSlatePool.stairs(SlateBlocks.POLISHED_SLATE_STAIRS);

        polishedQuartzPool.slab(SlateBlocks.POLISHED_QUARTZ_SLAB);
        polishedQuartzPool.stairs(SlateBlocks.POLISHED_QUARTZ_STAIRS);

        slateBrickPool.slab(SlateBlocks.SLATE_BRICK_SLAB);
        slateBrickPool.stairs(SlateBlocks.SLATE_BRICK_STAIRS);

        quartzBrickPool.slab(SlateBlocks.QUARTZ_BRICK_SLAB);
        quartzBrickPool.stairs(SlateBlocks.QUARTZ_BRICK_STAIRS);

        crackedSlateBrickPool.slab(SlateBlocks.CRACKED_SLATE_BRICK_SLAB);
        crackedSlateBrickPool.stairs(SlateBlocks.CRACKED_SLATE_BRICK_STAIRS);

        crackedQuartzBrickPool.slab(SlateBlocks.CRACKED_QUARTZ_BRICK_SLAB);
        crackedQuartzBrickPool.stairs(SlateBlocks.CRACKED_QUARTZ_BRICK_STAIRS);

        smallSlateBrickPool.slab(SlateBlocks.SMALL_SLATE_BRICK_SLAB);
        smallSlateBrickPool.stairs(SlateBlocks.SMALL_SLATE_BRICK_STAIRS);

        smallQuartzBrickPool.slab(SlateBlocks.SMALL_QUARTZ_BRICK_SLAB);
        smallQuartzBrickPool.stairs(SlateBlocks.SMALL_QUARTZ_BRICK_STAIRS);

        crackedSmallSlateBrickPool.slab(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_SLAB);
        crackedSmallSlateBrickPool.stairs(SlateBlocks.CRACKED_SMALL_SLATE_BRICK_STAIRS);

        crackedSmallQuartzBrickPool.slab(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_SLAB);
        crackedSmallQuartzBrickPool.stairs(SlateBlocks.CRACKED_SMALL_QUARTZ_BRICK_STAIRS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.SLATE, Models.GENERATED);

    }
}
