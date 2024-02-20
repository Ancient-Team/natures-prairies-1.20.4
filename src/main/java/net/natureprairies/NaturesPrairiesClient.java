package net.natureprairies;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.natureprairies.block.ModBlocks;
import net.natureprairies.block.ModFlowers;

public class NaturesPrairiesClient  implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.PINK_LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.BLUE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.CLOVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.CROCUS, RenderLayer.getCutout());


        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.POTTED_LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.POTTED_PINK_LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.POTTED_BLUE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.POTTED_CLOVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModFlowers.POTTED_CROCUS, RenderLayer.getCutout());

    }
}