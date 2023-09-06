package net.kai.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.kai.tutorialmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRACK_DOOR, RenderLayer.getCutout()); //add transparencia
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRACK_TRAPDOOR, RenderLayer.getCutout());

    }
}
