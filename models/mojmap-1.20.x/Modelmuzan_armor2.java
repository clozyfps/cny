// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmuzan_armor2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "muzan_armor2"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelmuzan_armor2(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(27, 59)
				.addBox(-0.9435F, 1.4309F, -2.2219F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 12)
				.addBox(-2.0F, 10.2317F, -2.1636F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.04F)).texOffs(50, 20)
				.addBox(-2.0F, 4.9817F, -2.3136F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)).texOffs(0, 16)
				.addBox(-4.0F, -0.0183F, -0.9636F, 8.0F, 12.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(15, 46)
				.addBox(2.0F, -0.0183F, -2.1136F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(21, 46)
				.addBox(-4.0F, -0.0183F, -2.1136F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(51, 55)
				.addBox(-1.5548F, 0.95F, -2.0726F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(17, 59).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F,
						new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-2.7935F, 2.6809F, -2.0969F, -0.0812F, -0.1546F, -0.0373F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(59, 38).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-1.8048F, 0.95F, -1.9226F, 0.2158F, -1.1165F, 0.1443F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(33, 59).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(1.8048F, 0.95F, -1.9226F, 0.2158F, 1.1165F, -0.1443F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(11, 59).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F,
						new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(2.7935F, 2.6809F, -2.0969F, -0.0812F, 0.1546F, 0.0373F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 33).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-3.0072F, 12.0444F, -1.6136F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(12, 33).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(3.0072F, 12.0444F, -1.6136F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(23, 59).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.217F, 8.4817F, -1.7349F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(47, 56).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.217F, 8.4817F, -1.7349F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(52, 40).addBox(-3.9738F, 0.0377F, -1.5F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.0125F, 12.013F, 0.5364F, 0.0511F, -0.0113F, 0.2179F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(38, 28).addBox(1.9684F, 0.0621F, -1.5F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.0125F, 12.013F, 0.5364F, 0.0511F, 0.0113F, -0.2179F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(46, 16).addBox(-1.9875F, -0.3813F, -1.5F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.0125F, 12.013F, 0.5364F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(12, 31).addBox(-1.9063F, -0.0774F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 11.0067F, -1.8136F, -0.3429F, 0.1555F, 0.4094F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(29, 0).addBox(-0.0937F, -0.0774F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 11.0067F, -1.8136F, -0.3429F, -0.1555F, -0.4094F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(56, 44).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.5178F, 4.3426F, -1.8136F, -0.0202F, 0.0387F, 1.0904F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(37, 56).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(1.5178F, 4.3426F, -1.8136F, -0.0202F, -0.0387F, -1.0904F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(19, 16).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0565F, 0.6809F, -2.0219F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 69).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0565F, 0.9309F, -1.7469F, -0.1745F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(16, 32)
						.addBox(-3.0F, -2.0183F, -2.0136F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(44, 28)
						.addBox(-3.0F, 7.7317F, -2.0136F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.09F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(16, 32).mirror()
						.addBox(-1.0F, -2.0183F, -2.0136F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false)
						.texOffs(44, 28).mirror()
						.addBox(-1.0F, 7.7317F, -2.0136F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(22, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(57, 15)
						.addBox(-2.0F, 10.0F, -2.7363F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-1.9763F, 0.0682F, -2.01F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.09F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition part_r1 = RightLeg.addOrReplaceChild("part_r1",
				CubeListBuilder.create().texOffs(56, 27).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.08F)),
				PartPose.offsetAndRotation(-1.224F, 5.1008F, -0.01F, 0.0F, -1.5708F, 0.2182F));

		PartDefinition part_r2 = RightLeg.addOrReplaceChild("part_r2",
				CubeListBuilder.create().texOffs(58, 33).addBox(-2.0F, 1.0F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.08F)),
				PartPose.offsetAndRotation(-1.7855F, 6.0181F, -0.01F, 0.0F, -1.5708F, -0.1309F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(22, 16)
				.mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 15).mirror().addBox(-2.0F, 10.0F, -2.7363F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(32, 32).mirror()
				.addBox(-2.0237F, 0.0682F, -2.01F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition part_r3 = LeftLeg.addOrReplaceChild("part_r3",
				CubeListBuilder.create().texOffs(56, 27).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.08F)).mirror(false),
				PartPose.offsetAndRotation(1.224F, 5.1008F, -0.01F, 0.0F, 1.5708F, -0.2182F));

		PartDefinition part_r4 = LeftLeg.addOrReplaceChild("part_r4",
				CubeListBuilder.create().texOffs(58, 33).mirror()
						.addBox(-2.0F, 1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.08F)).mirror(false),
				PartPose.offsetAndRotation(1.7855F, 6.0181F, -0.01F, 0.0F, 1.5708F, 0.1309F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}