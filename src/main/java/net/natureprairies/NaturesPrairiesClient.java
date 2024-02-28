package net.natureprairies;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.natureprairies.block.Flowers;


public class NaturesPrairiesClient  implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.PINK_LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.BLUE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.CLOVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.CROCUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.PUSHKINIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.RED_ROSE, RenderLayer.getCutout());


        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.POTTED_LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.POTTED_PINK_LAWENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.POTTED_BLUE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.POTTED_CLOVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.POTTED_CROCUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.POTTED_PUSHKINIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Flowers.POTTED_RED_ROSE, RenderLayer.getCutout());

    }
}