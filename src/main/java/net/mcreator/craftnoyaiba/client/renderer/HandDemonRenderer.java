
package net.mcreator.craftnoyaiba.client.renderer;

public class HandDemonRenderer extends MobRenderer<HandDemonEntity, ModelHandDemon<HandDemonEntity>> {

	public HandDemonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHandDemon(context.bakeLayer(ModelHandDemon.LAYER_LOCATION)), 0.5f);

	}

	@Override
	protected void scale(HandDemonEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2.5f, 2.5f, 2.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HandDemonEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/handdemon.png");
	}

}
