// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeluzui_sheathe<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "uzui_sheathe"), "main");
	private final ModelPart Body;

	public Modeluzui_sheathe(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(34, 38).addBox(
				-6.0F, -7.0F, -1.5F, 13.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(34, 43).mirror()
						.addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.3F, -5.0F, -2.35F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(34, 43).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3F, -5.0F, -2.35F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(14, 0).mirror()
						.addBox(0.0F, -6.5686F, -1.1327F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0747F, 8.4007F, -3.9087F, -0.2618F, -1.309F, 0.1309F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 12).mirror()
						.addBox(-1.7244F, -10.1941F, -0.5F, 2.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6203F, 10.6388F, -2.7931F, -0.0692F, 0.2527F, -0.1397F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(24, 25).mirror()
						.addBox(-0.5F, -1.0179F, -0.4255F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false),
				PartPose.offsetAndRotation(-1.3058F, 18.8657F, -3.6957F, 0.6981F, -1.309F, 0.1309F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, -2.1636F, -0.3299F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-0.0955F, 15.7683F, -4.4265F, 0.1309F, -1.309F, 0.1309F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(22, 8).mirror()
						.addBox(0.0F, -5.5686F, -1.1327F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.09F)).mirror(false),
				PartPose.offsetAndRotation(-0.1648F, 15.6018F, -4.4023F, -0.2618F, -1.309F, 0.1309F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(6, 12).mirror()
						.addBox(0.0F, -11.5686F, -1.1327F, 1.0F, 11.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(-1.0449F, 11.4188F, -4.0221F, -0.2618F, -1.309F, 0.1309F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(16, 12).mirror()
						.addBox(0.0F, -11.5686F, -1.1327F, 1.0F, 11.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(-1.4441F, 22.0528F, -4.288F, -0.2618F, -1.309F, 0.1309F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(12, 12).mirror()
						.addBox(-1.7244F, -1.0F, 3.8059F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-5.889F, -3.9063F, -1.546F, -1.64F, 0.2527F, -0.1397F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-1.7244F, -1.0F, -5.1941F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.16F)).mirror(false),
				PartPose.offsetAndRotation(-5.3921F, -4.228F, -1.6667F, -1.64F, 0.2527F, -0.1397F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 6).mirror()
				.addBox(-1.5F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(34, 6)
				.mirror().addBox(-2.5F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(-5.6261F, -0.2228F, -1.7861F, -1.8326F, -1.309F, 0.1309F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(36, 6).mirror()
						.addBox(-2.7244F, -2.0F, -0.6941F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(-5.3872F, -0.0608F, -1.8552F, -1.64F, 0.2527F, -0.1397F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(36, 6).mirror()
						.addBox(-2.7244F, -2.0F, -0.6941F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(-4.4284F, -0.1956F, -2.1052F, -1.64F, 0.2527F, -0.1397F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(24, 0).mirror()
						.addBox(-2.7244F, -2.0F, -0.6941F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(-4.9078F, -0.1282F, -1.9802F, -1.64F, 0.2527F, -0.1397F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, -6.5686F, -1.1327F, 1.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0747F, 8.4007F, -3.9087F, -0.2618F, 1.309F, -0.1309F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 12).addBox(-0.2756F, -10.1941F, -0.5F, 2.0F, 20.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6203F, 10.6388F, -2.7931F, -0.0692F, -0.2527F, 0.1397F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(24, 25).addBox(-0.5F, -1.0179F, -0.4255F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.11F)),
				PartPose.offsetAndRotation(1.3058F, 18.8657F, -3.6957F, 0.6981F, 1.309F, -0.1309F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.1636F, -0.3299F, 1.0F, 5.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0955F, 15.7683F, -4.4265F, 0.1309F, 1.309F, -0.1309F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(22, 8).addBox(-1.0F, -5.5686F, -1.1327F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(-0.09F)),
				PartPose.offsetAndRotation(0.1648F, 15.6018F, -4.4023F, -0.2618F, 1.309F, -0.1309F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(6, 12).addBox(-1.0F, -11.5686F, -1.1327F, 1.0F, 11.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(1.0449F, 11.4188F, -4.0221F, -0.2618F, 1.309F, -0.1309F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(16, 12).addBox(-1.0F, -11.5686F, -1.1327F, 1.0F, 11.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(1.4441F, 22.0528F, -4.288F, -0.2618F, 1.309F, -0.1309F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(12, 12).addBox(-1.2756F, -1.0F, 3.8059F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(5.889F, -3.9063F, -1.546F, -1.64F, -0.2527F, 0.1397F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.2756F, -1.0F, -5.1941F, 2.0F, 2.0F, 10.0F,
						new CubeDeformation(-0.16F)),
				PartPose.offsetAndRotation(5.3921F, -4.228F, -1.6667F, -1.64F, -0.2527F, 0.1397F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(36, 6)
						.addBox(-2.5F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(34, 6)
						.addBox(-1.5F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(5.6261F, -0.2228F, -1.7861F, -1.8326F, 1.309F, -0.1309F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(36, 6).addBox(-1.2756F, -2.0F, -0.6941F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(5.3872F, -0.0608F, -1.8552F, -1.64F, -0.2527F, 0.1397F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(36, 6).addBox(-1.2756F, -2.0F, -0.6941F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(4.4284F, -0.1956F, -2.1052F, -1.64F, -0.2527F, 0.1397F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(24, 0).addBox(-1.2756F, -2.0F, -0.6941F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(4.9078F, -0.1282F, -1.9802F, -1.64F, -0.2527F, 0.1397F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}