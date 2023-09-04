package net.kai.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kai.tutorialmod.block.ModBlocks;
import net.kai.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CRACK_BLOCK);
        addDrop(ModBlocks.RAW_CRACK_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);

        addDrop(ModBlocks.CRACK_ORE, copperLikeOreDrops(ModBlocks.CRACK_ORE, ModItems.RAW_CRACK));  // oreDrops pra ser uma ore normal com só 1 drop :3
        addDrop(ModBlocks.DEEPSLATE_CRACK_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_CRACK_ORE, ModItems.RAW_CRACK));
        addDrop(ModBlocks.END_STONE_CRACK_ORE, copperLikeOreDrops(ModBlocks.END_STONE_CRACK_ORE, ModItems.RAW_CRACK));
        addDrop(ModBlocks.NETHER_CRACK_ORE, copperLikeOreDrops(ModBlocks.NETHER_CRACK_ORE, ModItems.RAW_CRACK));
    }


    //usa um control click no oreDrops pra ver mais paradas que nem isso
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

}
