package net.mcreator.craftnoyaiba.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHandDemon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "model_hand_demon"), "main");
	public final ModelPart head;
	public final ModelPart torso;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart FrontRightLeg;
	public final ModelPart FrontLeftLeg;
	public final ModelPart BackRightLeg;
	public final ModelPart BackLeftLeg;

	public ModelHandDemon(ModelPart root) {
		this.head = root.getChild("head");
		this.torso = root.getChild("torso");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.FrontRightLeg = root.getChild("FrontRightLeg");
		this.FrontLeftLeg = root.getChild("FrontLeftLeg");
		this.BackRightLeg = root.getChild("BackRightLeg");
		this.BackLeftLeg = root.getChild("BackLeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(56, 73).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -22.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -1.0F, -2.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.1173F, 0.9044F, 0.3054F, 0.0F, 0.0F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(48, 40).addBox(-3.0F, -1.0F, -2.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2043F, 4.3823F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone8 = head.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 45).addBox(-0.7547F, -1.0F, 1.3036F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7547F, -3.25F, 2.6964F, 0.2182F, 0.0F, 0.0F));
		PartDefinition head_r3 = bone8.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));
		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 40).addBox(-8.0F, 5.0F, -8.0F, 16.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-11.0F, 10.0F, -10.0F, 22.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -22.0F, 0.0F));
		PartDefinition bone7 = torso.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(30, 101).addBox(-1.991F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, 4.0F, -7.0F, -0.2944F, 0.1659F, -1.5114F));
		PartDefinition torso_r1 = bone7.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(106, 4).addBox(-2.0F, -2.0F, -5.5F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.6534F, 9.487F, 1.4835F, 0.0F, 0.0F));
		PartDefinition torso_r2 = bone7.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(99, 114).addBox(-1.991F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0264F, 1.7654F, -2.138F, 0.0F, 0.0F));
		PartDefinition torso_r3 = bone7.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(24, 116).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3813F, 0.8966F, -1.309F, 0.0F, 0.0F));
		PartDefinition bone5 = torso.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(115, 118).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.25F, 8.0F, -8.5F, 0.4225F, -0.2307F, 0.4059F));
		PartDefinition torso_r4 = bone5.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(40, 120).addBox(-2.01F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3813F, 0.8966F, -1.309F, 0.0F, 0.0F));
		PartDefinition bone4 = torso.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(112, 41).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.25F, 8.0F, -8.5F, 0.4225F, 0.2307F, -0.4059F));
		PartDefinition torso_r5 = bone4.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(114, 71).addBox(-1.99F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3813F, 0.8966F, -1.309F, 0.0F, 0.0F));
		PartDefinition bone9 = torso.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(95, 99).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.25F, 6.0F, 9.5F, 2.3462F, -0.9924F, -2.258F));
		PartDefinition torso_r6 = bone9.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(106, 85).addBox(-1.99F, -2.0F, -6.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3813F, 0.8966F, -1.309F, 0.0F, 0.0F));
		PartDefinition bone10 = torso.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(95, 99).mirror().addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-17.25F, 16.0F, 11.5F, 2.3462F, 0.9924F, 2.258F));
		PartDefinition torso_r7 = bone10.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(106, 85).mirror().addBox(-2.01F, -2.0F, -6.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.3813F, 0.8966F, -1.309F, 0.0F, 0.0F));
		PartDefinition bone12 = torso.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(57, 90).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.25F, 11.25F, 11.5F, 1.9422F, 0.3314F, -1.5777F));
		PartDefinition torso_r8 = bone12.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(106, 27).addBox(-1.981F, -1.9992F, -6.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, -2.3498F, -1.0391F, -0.8727F, 0.0F, 0.0F));
		PartDefinition bone16 = torso.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(57, 90).mirror().addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-15.25F, 4.25F, 9.5F, 1.9422F, -0.3314F, 1.5777F));
		PartDefinition torso_r9 = bone16.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(106, 27).mirror().addBox(-2.019F, -1.9992F, -6.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, -2.3498F, -1.0391F, -0.8727F, 0.0F, 0.0F));
		PartDefinition bone6 = torso.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(117, 106).addBox(-1.99F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -12.0F, -0.6905F, 0.008F, 0.0411F));
		PartDefinition torso_r10 = bone6.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(118, 15).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3813F, 0.8966F, -1.309F, 0.0F, 0.0F));
		PartDefinition bone = torso.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(34, 89).addBox(0.0F, -3.0F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 20.0F, -13.0F, 0.0717F, -0.5451F, 0.2014F));
		PartDefinition torso_r11 = bone.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(88, 67).addBox(-4.5F, -3.01F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7678F, 0.0F, 3.0104F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone13 = torso.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 20.0F, 13.0F, -0.0717F, 0.5451F, 0.2014F));
		PartDefinition torso_r12 = bone13.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(34, 89).addBox(-5.5F, -3.0F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition torso_r13 = bone13.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(88, 67).addBox(-4.5F, -3.01F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7678F, 0.0F, -3.0104F, 3.1416F, -0.7854F, 0.0F));
		PartDefinition bone3 = torso.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(82, 83).addBox(-11.0F, -3.0F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 16.0F, -13.0F, -0.175F, 0.543F, -0.5076F));
		PartDefinition torso_r14 = bone3.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(84, 15).addBox(-5.5F, -3.01F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7678F, 0.0F, 3.0104F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone14 = torso.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 16.0F, 13.0F, 0.175F, -0.543F, -0.5076F));
		PartDefinition torso_r15 = bone14.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(82, 83).addBox(-5.5F, -3.0F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition torso_r16 = bone14.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(84, 15).addBox(-5.5F, -3.01F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7678F, 0.0F, -3.0104F, 3.1416F, 0.7854F, 0.0F));
		PartDefinition bone2 = torso.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(84, 49).addBox(-10.8233F, -3.6071F, -2.5965F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 26.0F, -13.0F, 0.4108F, 0.625F, -0.2947F));
		PartDefinition torso_r17 = bone2.addOrReplaceChild("torso_r17", CubeListBuilder.create().texOffs(0, 87).addBox(-5.0898F, -3.6171F, -2.8396F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7678F, 0.0F, 3.0104F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone15 = torso.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 26.0F, 13.0F, -0.4108F, -0.625F, -0.2947F));
		PartDefinition torso_r18 = bone15.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(84, 49).addBox(-5.5F, -3.0F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3233F, -0.6071F, -0.4035F, -1.5708F, 0.0F, 0.0F));
		PartDefinition torso_r19 = bone15.addOrReplaceChild("torso_r19", CubeListBuilder.create().texOffs(0, 87).addBox(-5.0898F, -2.4029F, -2.8396F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7678F, 0.0F, -3.0104F, 3.1416F, 0.7854F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 61).addBox(-2.6526F, 1.9525F, -4.7838F, 8.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 114).addBox(0.3474F, 2.9525F, 0.2162F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.25F, -12.0F, 0.0F, -0.0436F, 0.0F, -0.1309F));
		PartDefinition torso_r20 = LeftArm.addOrReplaceChild("torso_r20",
				CubeListBuilder.create().texOffs(8, 43).addBox(10.9038F, 6.9408F, 2.6456F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 83).addBox(13.9038F, -1.0592F, -4.3544F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(76, 32)
						.addBox(10.9038F, -2.0592F, -3.3544F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(26, 61).addBox(10.9038F, 6.9408F, -2.3544F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 12.0F, 0.0F, -0.1289F, 0.0227F, 0.1731F));
		PartDefinition torso_r21 = LeftArm.addOrReplaceChild("torso_r21", CubeListBuilder.create().texOffs(48, 46).addBox(-3.3462F, 2.0191F, -2.2863F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1905F, 21.1552F, -2.6012F, 0.3947F, 0.0227F, 0.1731F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-5.3474F, 1.9525F, -4.7838F, 8.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 114).mirror()
				.addBox(-6.3474F, 2.9525F, 0.2162F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.25F, -12.0F, 0.0F, -0.0436F, 0.0F, 0.1309F));
		PartDefinition torso_r22 = RightArm.addOrReplaceChild("torso_r22",
				CubeListBuilder.create().texOffs(8, 43).mirror().addBox(-12.9038F, 6.9408F, 2.6456F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(124, 83).mirror()
						.addBox(-18.9038F, -1.0592F, -4.3544F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 32).mirror().addBox(-17.9038F, -2.0592F, -3.3544F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(26, 61).mirror().addBox(-17.9038F, 6.9408F, -2.3544F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.0F, 12.0F, 0.0F, -0.1289F, -0.0227F, -0.1731F));
		PartDefinition torso_r23 = RightArm.addOrReplaceChild("torso_r23", CubeListBuilder.create().texOffs(48, 46).mirror().addBox(-3.6538F, 2.0191F, -2.2863F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1905F, 21.1552F, -2.6012F, 0.3947F, -0.0227F, -0.1731F));
		PartDefinition FrontRightLeg = partdefinition
				.addOrReplaceChild(
						"FrontRightLeg", CubeListBuilder.create().texOffs(64, 0).addBox(-3.5F, 16.0F, -7.0F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(110, 53).addBox(-3.5F, 12.0F, -3.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(54, 51).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(71, 113).addBox(-6.0F, 3.0F, -5.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-8.0F, 5.0F, -9.0F));
		PartDefinition FrontLeftLeg = partdefinition.addOrReplaceChild("FrontLeftLeg",
				CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-3.5F, 16.0F, -7.0F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 53).mirror()
						.addBox(-3.5F, 12.0F, -3.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 51).mirror().addBox(-5.0F, 0.0F, -4.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 113)
						.mirror().addBox(-1.0F, 3.0F, -5.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(8.0F, 5.0F, -9.0F));
		PartDefinition BackRightLeg = partdefinition.addOrReplaceChild("BackRightLeg", CubeListBuilder.create(), PartPose.offset(-8.0F, 5.0F, 9.0F));
		PartDefinition torso_r24 = BackRightLeg.addOrReplaceChild("torso_r24", CubeListBuilder.create().texOffs(71, 113).addBox(-3.5F, -3.0F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 6.0F, 1.5F, 3.1416F, 0.0F, 0.0F));
		PartDefinition torso_r25 = BackRightLeg.addOrReplaceChild("torso_r25", CubeListBuilder.create().texOffs(54, 51).addBox(-5.0F, -6.0F, -5.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -1.0F, 3.1416F, 3.1416F, 0.0F));
		PartDefinition torso_r26 = BackRightLeg.addOrReplaceChild("torso_r26", CubeListBuilder.create().texOffs(110, 53).addBox(-3.5F, -2.0F, -4.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -1.0F, 3.1416F, 0.0F, -3.1416F));
		PartDefinition torso_r27 = BackRightLeg.addOrReplaceChild("torso_r27", CubeListBuilder.create().texOffs(64, 0).addBox(-3.5F, -1.5F, -6.0F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5F, 1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition BackLeftLeg = partdefinition.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create(), PartPose.offset(8.0F, 5.0F, 9.0F));
		PartDefinition torso_r28 = BackLeftLeg.addOrReplaceChild("torso_r28", CubeListBuilder.create().texOffs(71, 113).mirror().addBox(-3.5F, -3.0F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 6.0F, 1.5F, 3.1416F, 0.0F, 0.0F));
		PartDefinition torso_r29 = BackLeftLeg.addOrReplaceChild("torso_r29", CubeListBuilder.create().texOffs(54, 51).mirror().addBox(-5.0F, -6.0F, -5.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, -1.0F, 3.1416F, 3.1416F, 0.0F));
		PartDefinition torso_r30 = BackLeftLeg.addOrReplaceChild("torso_r30", CubeListBuilder.create().texOffs(110, 53).mirror().addBox(-3.5F, -2.0F, -4.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.0F, -1.0F, 3.1416F, 0.0F, -3.1416F));
		PartDefinition torso_r31 = BackLeftLeg.addOrReplaceChild("torso_r31", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-3.5F, -1.5F, -6.0F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 17.5F, 1.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
