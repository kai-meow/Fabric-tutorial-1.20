package net.kai.tutorialmod.mixin;

import net.kai.tutorialmod.TutorialMod;
import net.kai.tutorialmod.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useStupidGunModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded,
                                       MatrixStack matrices, VertexConsumerProvider vertexConsumer, int light, int overlay){
        if(stack.isOf(ModItems.STUPID_GUN) && renderMode != ModelTransformationMode.GUI){
            return((ItemRendererAccessor) this).tutorialmod$getModels().getModelManager().getModel(new ModelIdentifier(TutorialMod.MOD_ID, "stupid_gun_3d", "inventory"));
        }
        return value;
    }
}
