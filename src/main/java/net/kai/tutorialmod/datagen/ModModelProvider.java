package net.kai.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kai.tutorialmod.block.ModBlocks;
import net.kai.tutorialmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_CRACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CRACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CRACK, Models.GENERATED);

        itemModelGenerator.register(ModItems.TINY_KAI, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVIDENCE, Models.GENERATED);

        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
    }
}
