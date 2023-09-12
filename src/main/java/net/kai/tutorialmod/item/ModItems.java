package net.kai.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kai.tutorialmod.TutorialMod;
import net.kai.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CRACK = registerItem("crack", new Item(new FabricItemSettings())); //all lowercase, no spaces
    public static final Item RAW_CRACK = registerItem("raw_crack", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TINY_KAI = registerItem("tiny_kai", new Item(new FabricItemSettings().food(ModFoodComponents.TINY_KAI)));
    public static final Item EVIDENCE = registerItem("evidence",
            new Item(new FabricItemSettings()));

    public static final Item STUPID_GUN = registerItem("stupid_gun",
            new Item(new FabricItemSettings().maxCount(1)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){ //adicionar os itens na aba de ingredientes do creative
        entries.add(CRACK);
        entries.add(RAW_CRACK);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering mod items for "+ TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
