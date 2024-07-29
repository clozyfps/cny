
package net.mcreator.craftnoyaiba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnoyaiba.entity.HandDemonEntity;
import net.mcreator.craftnoyaiba.client.model.ModelHandDemon;

import com.mojang.blaze3d.vertex.PoseStack;

public class HandDemonRenderer extends MobRenderer<HandDemonEntity, ModelHandDemon<HandDemonEntity>> {
	public HandDemonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHandDemon(context.bakeLayer(ModelHandDemon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(HandDemonEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.3f, 1.3f, 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(HandDemonEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/handdemon.png");
	}
}
