
package net.mcreator.craftnoyaiba.client.renderer;

public class FlameBreathingFormRenderer extends GeoEntityRenderer<FlameBreathingFormEntity> {
	public FlameBreathingFormRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FlameBreathingFormModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new FlameBreathingFormLayer(this));
	}

	@Override
	public RenderType getRenderType(FlameBreathingFormEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FlameBreathingFormEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}