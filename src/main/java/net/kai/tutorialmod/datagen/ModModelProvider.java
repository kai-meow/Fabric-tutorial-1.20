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
        BlockStateModelGenerator.BlockTexturePool crackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_CRACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_CRACK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        crackPool.stairs(ModBlocks.CRACK_STAIRS);
        crackPool.slab(ModBlocks.CRACK_SLAB);
        crackPool.button(ModBlocks.CRACK_BUTTON);
        crackPool.pressurePlate(ModBlocks.CRACK_PRESSURE_PLATE);
        crackPool.fence(ModBlocks.CRACK_FENCE);
        crackPool.fenceGate(ModBlocks.CRACK_FENCE_GATE);
        crackPool.wall(ModBlocks.CRACK_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.CRACK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CRACK_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CRACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CRACK, Models.GENERATED);

        itemModelGenerator.register(ModItems.TINY_KAI, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVIDENCE, Models.GENERATED);

        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRACK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRACK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRACK_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRACK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRACK_HOE, Models.HANDHELD);
    }
}
