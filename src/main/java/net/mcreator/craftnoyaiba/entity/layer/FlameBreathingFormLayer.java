package net.mcreator.craftnoyaiba.entity.layer;

public class FlameBreathingFormLayer extends GeoRenderLayer<FlameBreathingFormEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("craftnoyaiba", "textures/entities/firstform_animation.png");

	public FlameBreathingFormLayer(GeoRenderer<FlameBreathingFormEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, FlameBreathingFormEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}