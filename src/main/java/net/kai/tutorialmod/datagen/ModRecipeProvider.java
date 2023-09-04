package net.kai.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kai.tutorialmod.block.ModBlocks;
import net.kai.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> CRACK_SMELTABLES = List.of(ModItems.RAW_CRACK,
            ModBlocks.CRACK_ORE, ModBlocks.DEEPSLATE_CRACK_ORE, ModBlocks.NETHER_CRACK_ORE, ModBlocks.END_STONE_CRACK_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //control click nesses metodos com offer pra ver outros similares, EXTREMAMENTE UTIL!!!
        offerSmelting(exporter, CRACK_SMELTABLES, RecipeCategory.MISC, ModItems.CRACK, 0.7f, 100, "crack");
        offerBlasting(exporter, CRACK_SMELTABLES, RecipeCategory.MISC, ModItems.CRACK, 0.7f, 50, "crack");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CRACK, RecipeCategory.DECORATIONS, ModBlocks.CRACK_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_CRACK, RecipeCategory.DECORATIONS, ModBlocks.RAW_CRACK_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.SLIME_BALL)
                .input('R', Items.NOTE_BLOCK)
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .criterion(hasItem(Items.NOTE_BLOCK), conditionsFromItem(Items.NOTE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SOUND_BLOCK)));
    }
}
