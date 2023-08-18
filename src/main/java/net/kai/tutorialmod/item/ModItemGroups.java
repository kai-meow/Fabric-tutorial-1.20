package net.kai.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kai.tutorialmod.TutorialMod;
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
                        entries.add(ModItems.CRACK);
                        entries.add(ModItems.RAW_CRACK);
                        entries.add(Items.FURNACE);
                        entries.add(Items.COAL_BLOCK);
                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Resgister Item Groups for "+TutorialMod.MOD_ID);
    }
}