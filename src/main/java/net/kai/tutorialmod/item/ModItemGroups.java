package net.kai.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kai.tutorialmod.TutorialMod;
import net.kai.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CRACK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "crack"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crack"))
                    .icon(() -> new ItemStack(ModItems.CRACK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.CRACK);
                        entries.add(ModItems.RAW_CRACK);
                        entries.add(ModItems.TINY_KAI);
                        entries.add(ModItems.EVIDENCE);
                        entries.add(ModItems.STUPID_GUN);

                        entries.add(ModBlocks.CRACK_BLOCK);
                        entries.add(ModBlocks.RAW_CRACK_BLOCK);

                        entries.add(ModBlocks.CRACK_ORE);
                        entries.add(ModBlocks.DEEPSLATE_CRACK_ORE);
                        entries.add(ModBlocks.NETHER_CRACK_ORE);
                        entries.add(ModBlocks.END_STONE_CRACK_ORE);
                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(Items.FURNACE);
                        entries.add(Items.COAL_BLOCK);

                        entries.add(ModBlocks.CRACK_DOOR);
                        entries.add(ModBlocks.CRACK_TRAPDOOR);
                        entries.add(ModBlocks.CRACK_STAIRS);
                        entries.add(ModBlocks.CRACK_SLAB);
                        entries.add(ModBlocks.CRACK_BUTTON);
                        entries.add(ModBlocks.CRACK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACK_FENCE);
                        entries.add(ModBlocks.CRACK_FENCE_GATE);
                        entries.add(ModBlocks.CRACK_WALL);
                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Resgister Item Groups for "+TutorialMod.MOD_ID);
    }
}
