// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelzohakuten_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "zohakuten_armor"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelzohakuten_armor(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(39, 22)
						.addBox(-0.5F, 1.0F, 1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.5F, -0.25F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 39)
						.addBox(2.5F, -0.25F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(1.5F, 0.25F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 40)
						.addBox(0.5F, 1.0F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 40)
						.addBox(-1.5F, 1.0F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 49)
						.addBox(-2.5F, 0.25F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 49)
						.addBox(-3.5F, -0.25F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-4.5F, -0.25F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 30)
						.addBox(-5.5F, -0.25F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-1.5F, 1.0F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 50)
						.addBox(-2.5F, 0.25F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 14)
						.addBox(-3.5F, -0.25F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.5F, -0.25F, -2.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 41)
						.addBox(-5.5F, -0.25F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 18)
						.addBox(2.5F, -0.25F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 41)
						.addBox(4.5F, -0.25F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 28)
						.addBox(4.5F, -0.25F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 16)
						.addBox(3.5F, -0.25F, -2.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 64)
						.addBox(1.5F, 0.25F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 64)
						.addBox(0.5F, 1.0F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 63)
						.addBox(-0.5F, 1.0F, -2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
						.addBox(-5.1F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 2)
						.addBox(2.1F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
						.addBox(-2.5F, 7.51F, 1.49F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 23)
						.addBox(2.5F, 7.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 14)
						.addBox(-4.5F, 7.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 2)
						.addBox(2.5F, 10.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(-3.5F, 10.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 26)
						.addBox(-2.0F, 9.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 10)
						.addBox(-4.0F, 8.0F, 1.25F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 7)
						.addBox(-2.0F, 10.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-3.0F, 8.5F, -2.249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 39)
						.addBox(2.0F, 8.5F, -2.249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 29)
						.addBox(2.0F, 9.0F, -2.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 7)
						.addBox(-3.0F, 9.0F, -2.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 64)
						.addBox(-4.0F, 8.0F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 64)
						.addBox(3.0F, 8.0F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 56)
						.addBox(3.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 55)
						.addBox(7.9F, -13.0F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-4.5F, -17.2279F, 3.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 0)
						.addBox(-2.0F, -18.25F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 60)
						.addBox(-11.9F, -13.0F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 50)
						.addBox(-11.9F, -4.0F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 13)
						.addBox(7.9F, -4.0F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(-4.5F, 2.5F, 3.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso_r1 = Body.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(28, 15).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9749F, 0.6109F, 3.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition torso_r2 = Body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(36, 33).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9749F, 0.6109F, 3.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition torso_r3 = Body.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(34, 6).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.864F, -6.364F, 3.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition torso_r4 = Body.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(28, 18).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.864F, -6.364F, 3.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition torso_r5 = Body.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(32, 30).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9749F, -13.3388F, 3.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition torso_r6 = Body.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(34, 3).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9749F, -13.3388F, 3.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition torso_r7 = Body.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(26, 30).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2847F, 12.5613F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition torso_r8 = Body.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(16, 28).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2847F, 12.5613F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition torso_r9 = Body.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(58, 29).addBox(-1.5F, -0.0171F, -0.1078F, 3.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 10.5265F, -2.1441F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition torso_r10 = Body.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(12, 57).addBox(-1.5F, -0.0171F, -0.1078F, 3.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 10.5265F, -2.1441F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition torso_r11 = Body.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(16, 0).addBox(-4.0F, -5.0F, -0.5F, 8.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.5246F, 2.1877F, 0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r12 = Body.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(52, 54).addBox(-2.0F, -4.5F, 0.0F, 3.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3488F, 14.9251F, 1.5552F, 0.0843F, 0.0226F, -0.2608F));

		PartDefinition torso_r13 = Body.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(44, 54).addBox(-1.0F, -4.5F, 0.0F, 3.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3488F, 14.9251F, 1.5552F, 0.0843F, -0.0226F, 0.2608F));

		PartDefinition torso_r14 = Body.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(18, 43).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.7598F, -2.0861F, -0.6545F, 0.0F, 0.0F));

		PartDefinition torso_r15 = Body.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(55, 43).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.8842F, -2.5505F, -0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r16 = Body.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(28, 56).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5347F, 13.1089F, -2.2733F, -0.1265F, -0.0338F, -0.2597F));

		PartDefinition torso_r17 = Body.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(43, 50).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3268F, 15.7239F, -4.9254F, -0.6235F, 0.6511F, 0.9313F));

		PartDefinition torso_r18 = Body.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(26, 30).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3268F, 15.7239F, -4.9254F, -0.6235F, -0.6511F, -0.9313F));

		PartDefinition torso_r19 = Body.addOrReplaceChild("torso_r19",
				CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0877F, 14.996F, -3.7521F, -0.8683F, -0.0338F, -0.2597F));

		PartDefinition torso_r20 = Body.addOrReplaceChild("torso_r20",
				CubeListBuilder.create().texOffs(16, 28).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4828F, 16.8205F, -5.4593F, 0.0747F, -0.6511F, -0.9313F));

		PartDefinition torso_r21 = Body.addOrReplaceChild("torso_r21",
				CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7442F, 18.5903F, -4.5834F, 0.9037F, -0.6511F, -0.9313F));

		PartDefinition torso_r22 = Body.addOrReplaceChild("torso_r22",
				CubeListBuilder.create().texOffs(22, 45).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4828F, 16.8205F, -5.4593F, 0.0747F, 0.6511F, 0.9313F));

		PartDefinition torso_r23 = Body.addOrReplaceChild("torso_r23",
				CubeListBuilder.create().texOffs(42, 39).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.7442F, 18.5903F, -4.5834F, 0.9037F, 0.6511F, 0.9313F));

		PartDefinition torso_r24 = Body.addOrReplaceChild("torso_r24",
				CubeListBuilder.create().texOffs(12, 52).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0877F, 14.996F, -3.7521F, -0.8683F, 0.0338F, 0.2597F));

		PartDefinition torso_r25 = Body.addOrReplaceChild("torso_r25",
				CubeListBuilder.create().texOffs(58, 20).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5347F, 13.1089F, -2.2733F, -0.1265F, 0.0338F, 0.2597F));

		PartDefinition torso_r26 = Body.addOrReplaceChild("torso_r26",
				CubeListBuilder.create().texOffs(6, 59).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5436F, 11.6543F, -2.3722F, -0.3491F, 0.0F, -0.48F));

		PartDefinition torso_r27 = Body.addOrReplaceChild("torso_r27",
				CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4664F, 12.4782F, -2.8192F, -0.2411F, -0.2549F, -1.2779F));

		PartDefinition torso_r28 = Body.addOrReplaceChild("torso_r28",
				CubeListBuilder.create().texOffs(16, 10).addBox(-2.5F, -0.25F, -0.7F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4664F, 12.4782F, -2.8192F, -0.3054F, 0.0F, 0.0F));

		PartDefinition torso_r29 = Body.addOrReplaceChild("torso_r29",
				CubeListBuilder.create().texOffs(32, 58).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4664F, 12.4782F, -2.8192F, -0.2411F, 0.2549F, 1.2779F));

		PartDefinition torso_r30 = Body.addOrReplaceChild("torso_r30",
				CubeListBuilder.create().texOffs(38, 58).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5436F, 11.6543F, -2.3722F, -0.3491F, 0.0F, 0.48F));

		PartDefinition torso_r31 = Body.addOrReplaceChild("torso_r31",
				CubeListBuilder.create().texOffs(20, 57).addBox(-0.5F, -1.0F, -0.49F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3F, 8.75F, -2.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition torso_r32 = Body.addOrReplaceChild("torso_r32",
				CubeListBuilder.create().texOffs(54, 20).addBox(-0.5F, -1.0F, -0.49F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3F, 8.75F, -2.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition torso_r33 = Body.addOrReplaceChild("torso_r33",
				CubeListBuilder.create().texOffs(51, 34).addBox(-0.5F, -2.0F, -2.499F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7222F, 1.3421F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r34 = Body.addOrReplaceChild("torso_r34",
				CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -2.5F, -0.499F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.049F, 0.683F, -2.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition torso_r35 = Body.addOrReplaceChild("torso_r35",
				CubeListBuilder.create().texOffs(32, 49).addBox(-0.5F, -2.5F, -0.499F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.049F, 0.683F, -2.0F, 0.0F, 0.0F, -1.0472F));

		PartDefinition torso_r36 = Body.addOrReplaceChild("torso_r36",
				CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -3.5F, -0.499F, 1.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.049F, 4.683F, -2.0F, 0.0F, 0.0F, -1.0472F));

		PartDefinition torso_r37 = Body.addOrReplaceChild("torso_r37",
				CubeListBuilder.create().texOffs(31, 39).addBox(-0.5F, -3.5F, -0.499F, 1.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.049F, 4.683F, -2.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition torso_r38 = Body.addOrReplaceChild("torso_r38",
				CubeListBuilder.create().texOffs(48, 45).addBox(-0.5F, -2.0F, -2.499F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7222F, 1.3421F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(23, 23)
						.addBox(-3.5F, 6.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(0, 24)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(23, 23).mirror()
						.addBox(-1.5F, 6.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
						.texOffs(0, 24).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(42, 9)
						.addBox(-2.1F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg_r1 = RightLeg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.909F, 7.703F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition left_leg_r2 = RightLeg.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(22, 45).addBox(0.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4483F, -0.0228F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition left_leg_r3 = RightLeg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(44, 17).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2483F, -0.0228F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition left_leg_r4 = RightLeg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(32, 58).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.709F, 7.703F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition left_leg_r5 = RightLeg.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(58, 20).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 7.703F, 1.809F, -1.5708F, 1.1781F, -1.5708F));

		PartDefinition left_leg_r6 = RightLeg.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(43, 39).addBox(0.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -0.0228F, 2.3483F, 1.5708F, 1.5272F, 1.5708F));

		PartDefinition left_leg_r7 = RightLeg.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(12, 41).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -0.0228F, -2.3483F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition left_leg_r8 = RightLeg.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(54, 7).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 7.703F, -1.809F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(42, 9).mirror()
						.addBox(-1.9F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition right_leg_r1 = LeftLeg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(0, 59).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.909F, 7.703F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition right_leg_r2 = LeftLeg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(22, 45).mirror()
						.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.4483F, -0.0228F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition right_leg_r3 = LeftLeg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(44, 17).mirror()
						.addBox(0.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2483F, -0.0228F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right_leg_r4 = LeftLeg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(32, 58).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.709F, 7.703F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_leg_r5 = LeftLeg.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(58, 20).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 7.703F, 1.809F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition right_leg_r6 = LeftLeg.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(43, 39).mirror()
						.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, -0.0228F, 2.3483F, 1.5708F, -1.5272F, -1.5708F));

		PartDefinition right_leg_r7 = LeftLeg.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(12, 41).mirror()
						.addBox(0.0F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, -0.0228F, -2.3483F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition right_leg_r8 = LeftLeg.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(54, 7).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 7.703F, -1.809F, 1.5708F, -1.1781F, -1.5708F));

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