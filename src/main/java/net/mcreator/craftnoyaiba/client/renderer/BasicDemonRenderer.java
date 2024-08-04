
package net.mcreator.craftnoyaiba.client.renderer;

public class BasicDemonRenderer extends MobRenderer<BasicDemonEntity, Modelweakdemonfirst<BasicDemonEntity>> {

	public BasicDemonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweakdemonfirst(context.bakeLayer(Modelweakdemonfirst.LAYER_LOCATION)), 0.5f);

		this.addLayer(new RenderLayer<BasicDemonEntity, Modelweakdemonfirst<BasicDemonEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("craftnoyaiba:textures/entities/demon3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BasicDemonEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BasicDemonDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldemonthird(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldemonthird.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BasicDemonEntity, Modelweakdemonfirst<BasicDemonEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("craftnoyaiba:textures/entities/demon2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BasicDemonEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BasicDemonDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldemonsecond(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldemonsecond.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BasicDemonEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/firstdemon.png");
	}

}
