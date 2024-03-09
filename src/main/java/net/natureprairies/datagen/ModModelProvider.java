package net.natureprairies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.natureprairies.block.Ceramic;
import net.natureprairies.block.Flowers;
import net.natureprairies.block.Quartz;
import net.natureprairies.block.Slate;
import net.natureprairies.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool slatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Slate.SLATE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool smoothSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Slate.SMOOTH_SLATE);
        BlockStateModelGenerator.BlockTexturePool polishedSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Slate.POLISHED_SLATE);
        BlockStateModelGenerator.BlockTexturePool slateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Slate.SLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smallSlateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Slate.SMALL_SLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Quartz.POLISHED_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool smallQuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Quartz.SMALL_QUARTZ_BRICKS);

        Identifier slateId = ModelIds.getBlockModelId(Slate.SLATE_BLOCK);
        TextureMap OvergrownSlatetextureMap = new TextureMap()
                .put(TextureKey.BOTTOM, slateId)
                .inherit(TextureKey.BOTTOM, TextureKey.PARTICLE)
                .put(TextureKey.TOP, TextureMap.getSubId(Slate.OVERGROWN_SLATE, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(Slate.OVERGROWN_SLATE, "_side"));
        Models.CUBE_BOTTOM_TOP.upload(Slate.OVERGROWN_SLATE, OvergrownSlatetextureMap, blockStateModelGenerator.modelCollector);

        BlockStateVariant[] OvergrownSlateBlockStateVariants = BlockStateModelGenerator.createModelVariantWithRandomHorizontalRotations(ModelIds.getBlockModelId(Slate.OVERGROWN_SLATE));
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(Slate.OVERGROWN_SLATE, OvergrownSlateBlockStateVariants));

        Identifier quartzId = ModelIds.getBlockModelId(Blocks.QUARTZ_BLOCK);
        TextureMap OvergrownQuartzTextureMap = new TextureMap()
                .put(TextureKey.BOTTOM, quartzId)
                .inherit(TextureKey.BOTTOM, TextureKey.PARTICLE)
                .put(TextureKey.TOP, TextureMap.getSubId(Quartz.OVERGROWN_QUARTZ, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(Quartz.OVERGROWN_QUARTZ, "_side"));
        Models.CUBE_BOTTOM_TOP.upload(Quartz.OVERGROWN_QUARTZ, OvergrownQuartzTextureMap, blockStateModelGenerator.modelCollector);

        BlockStateVariant[] OvergrownQuartzBlockStateVariants = BlockStateModelGenerator.createModelVariantWithRandomHorizontalRotations(ModelIds.getBlockModelId(Quartz.OVERGROWN_QUARTZ));
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(Quartz.OVERGROWN_QUARTZ, OvergrownQuartzBlockStateVariants));

        blockStateModelGenerator.registerSimpleCubeAll(Slate.SLATE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(Slate.DEEPSLATE_SLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(Quartz.QUARTZ_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(Slate.CHISELED_SLATE);
        blockStateModelGenerator.registerSimpleCubeAll(Slate.SLATE_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Quartz.QUARTZ_LANTERN);

        blockStateModelGenerator.registerFlowerPotPlant(Flowers.LAWENDER, Flowers.POTTED_LAWENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Flowers.PINK_LAWENDER, Flowers.POTTED_PINK_LAWENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Flowers.BLUE_LAVENDER, Flowers.POTTED_BLUE_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Flowers.CLOVES, Flowers.POTTED_CLOVES, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Flowers.CROCUS, Flowers.POTTED_CROCUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Flowers.PUSHKINIA, Flowers.POTTED_PUSHKINIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Flowers.RED_ROSE, Flowers.POTTED_RED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);

        slatePool.stairs(Slate.SLATE_BLOCK_STAIRS);
        slatePool.slab(Slate.SLATE_BLOCK_SLAB);
        slatePool.wall(Slate.SLATE_BLOCK_WALL);

        smoothSlatePool.stairs(Slate.SMOOTH_SLATE_STAIRS);
        smoothSlatePool.slab(Slate.SMOOTH_SLATE_SLAB);
        smoothSlatePool.wall(Slate.SMOOTH_SLATE_WALL);

        smoothQuartzPool.stairs(Blocks.SMOOTH_QUARTZ_STAIRS);
        smoothQuartzPool.slab(Blocks.SMOOTH_QUARTZ_SLAB);
        smoothQuartzPool.wall(Quartz.SMOOTH_QUARTZ_WALL);

        polishedSlatePool.slab(Slate.POLISHED_SLATE_SLAB);
        polishedSlatePool.stairs(Slate.POLISHED_SLATE_STAIRS);
        polishedSlatePool.wall(Slate.POLISHED_SLATE_WALL);

        polishedQuartzPool.slab(Quartz.POLISHED_QUARTZ_SLAB);
        polishedQuartzPool.stairs(Quartz.POLISHED_QUARTZ_STAIRS);
        polishedQuartzPool.wall(Quartz.POLISHED_QUARTZ_WALL);

        slateBrickPool.slab(Slate.SLATE_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(Slate.CRACKED_SLATE_BRICKS);
        slateBrickPool.stairs(Slate.SLATE_BRICK_STAIRS);
        slateBrickPool.wall(Slate.SLATE_BRICK_WALL);

        quartzBrickPool.slab(Quartz.QUARTZ_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(Quartz.CRACKED_QUARTZ_BRICKS);
        quartzBrickPool.stairs(Quartz.QUARTZ_BRICK_STAIRS);
        quartzBrickPool.wall(Quartz.QUARTZ_BRICK_WALL);


        smallSlateBrickPool.slab(Slate.SMALL_SLATE_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(Slate.CRACKED_SMALL_SLATE_BRICKS);
        smallSlateBrickPool.stairs(Slate.SMALL_SLATE_BRICK_STAIRS);
        smallSlateBrickPool.wall(Slate.SMALL_SLATE_BRICK_WALL);

        smallQuartzBrickPool.slab(Quartz.SMALL_QUARTZ_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(Quartz.CRACKED_SMALL_QUARTZ_BRICKS);
        smallQuartzBrickPool.stairs(Quartz.SMALL_QUARTZ_BRICK_STAIRS);
        smallQuartzBrickPool.wall(Quartz.SMALL_QUARTZ_BRICK_WALL);

        //Ceramic

        blockStateModelGenerator.registerSimpleCubeAll(Ceramic.CERAMIC_BLEND);
        blockStateModelGenerator.registerSimpleCubeAll(Ceramic.CERAMIC_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ceramicShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ceramic.CERAMIC_SHINGLES);
        ceramicShinglesPool.slab(Ceramic.CERAMIC_SHINGLES_SLAB);
        ceramicShinglesPool.stairs(Ceramic.CERAMIC_SHINGLES_STAIRS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.SLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CERAMIC_BLEND_LUMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CERAMIC_LUMP, Models.GENERATED);

    }
}
