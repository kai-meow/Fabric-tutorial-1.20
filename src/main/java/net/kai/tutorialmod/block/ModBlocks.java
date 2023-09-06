package net.kai.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kai.tutorialmod.TutorialMod;
import net.kai.tutorialmod.block.custom.SoundBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block CRACK_BLOCK = registerBlock("crack_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.BAMBOO)));

    public static final Block RAW_CRACK_BLOCK = registerBlock("raw_crack_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));



    public static final Block CRACK_STAIRS = registerBlock("crack_stairs",
            new StairsBlock(ModBlocks.CRACK_BLOCK.getDefaultState() , FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block CRACK_SLAB = registerBlock("crack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));


    public static final Block CRACK_BUTTON = registerBlock("crack_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.IRON, 10, true));

    public static final Block CRACK_PRESSURE_PLATE = registerBlock("crack_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.IRON));


    public static final Block CRACK_FENCE = registerBlock("crack_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block CRACK_FENCE_GATE = registerBlock("crack_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.BAMBOO));

    public static final Block CRACK_WALL = registerBlock("crack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));


    public static final Block CRACK_DOOR = registerBlock("crack_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).nonOpaque(), BlockSetType.IRON)); //.nonOpaque() necessario para transparencia

    public static final Block CRACK_TRAPDOOR = registerBlock("crack_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).nonOpaque(), BlockSetType.IRON));



    public static final Block CRACK_ORE = registerBlock("crack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.0f), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_CRACK_ORE = registerBlock("deepslate_crack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(2.0f), UniformIntProvider.create(2, 5)));

    public static final Block NETHER_CRACK_ORE = registerBlock("nether_crack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(0.7f), UniformIntProvider.create(2, 5)));

    public static final Block END_STONE_CRACK_ORE = registerBlock("end_stone_crack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3.0f), UniformIntProvider.create(4, 7)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering mod blocks for " + TutorialMod.MOD_ID);
    }
}
