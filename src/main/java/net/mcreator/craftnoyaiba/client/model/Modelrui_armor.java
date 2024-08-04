package net.mcreator.craftnoyaiba.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelrui_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftnoyaiba", "modelrui_armor"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelrui_armor(ModelPart root) {
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
				CubeListBuilder.create().texOffs(40, 15).addBox(3.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)).texOffs(28, 43).addBox(-4.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.01F)).texOffs(32, 6)
						.addBox(-4.0F, 0.0F, 1.25F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.01F)).texOffs(34, 43).addBox(-4.0F, 10.5531F, 1.3825F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(10, 27)
						.addBox(-2.025F, 10.5531F, -1.3825F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-4.025F, 10.5531F, -1.3825F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 48)
						.addBox(2.025F, 10.5531F, -1.3825F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 0).addBox(-4.0F, 10.5531F, -2.3825F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(36, 15)
						.addBox(2.0F, 0.0F, -2.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 31).addBox(1.0F, 3.0F, -2.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 52)
						.addBox(-4.0F, 0.0F, -2.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 31).addBox(-4.0F, 3.0F, -2.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 27)
						.addBox(-4.0F, 5.0F, -2.25F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 11).addBox(-2.0F, 8.5F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 50)
						.addBox(-2.0F, 8.5F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-4.0F, 8.5F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.09F)).texOffs(0, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.9633F, 2.3942F, -1.5067F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 4).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-1.4633F, 1.5282F, -1.5256F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 17).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(1.6935F, 2.5309F, -1.7969F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 51).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(-1.6935F, 2.5309F, -1.7969F, 0.0F, 0.0F, -0.5236F));
		PartDefinition torso_r1 = Body.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(46, 15).addBox(-4.0F, -0.856F, -0.7989F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 7.7559F, -1.6992F, -0.48F, 0.0F, 0.0F));
		PartDefinition torso_r2 = Body.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(44, 31).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 10.5521F, -1.6749F, -0.7854F, 0.0F, 0.0F));
		PartDefinition torso_r3 = Body.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(44, 0).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 10.5521F, 1.6749F, 0.7854F, 0.0F, 0.0F));
		PartDefinition torso_r4 = Body.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(0, 46).addBox(-4.0F, -0.5461F, -0.6005F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 7.7559F, -1.6992F, 0.4363F, 0.0F, 0.0F));
		PartDefinition torso_r5 = Body.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(44, 33).addBox(-4.0F, -0.5461F, -0.3995F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 7.7559F, 1.6992F, -0.4363F, 0.0F, 0.0F));
		PartDefinition torso_r6 = Body.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(34, 45).addBox(-4.0F, -0.856F, -0.2011F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 7.7559F, 1.6992F, 0.48F, 0.0F, 0.0F));
		PartDefinition torso_r7 = Body.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(51, 46).addBox(-4.0F, -0.2961F, -0.3995F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-3.9F, 7.5294F, 2.0049F, 0.0F, -1.5708F, -0.4363F));
		PartDefinition torso_r8 = Body.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(51, 48).addBox(-4.0F, -0.7039F, -0.3995F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-3.9F, 7.5294F, 2.0049F, 0.0F, -1.5708F, 0.48F));
		PartDefinition torso_r9 = Body.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(50, 24).addBox(0.0F, -0.2961F, -0.3995F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(3.9F, 7.5294F, 2.0049F, 0.0F, 1.5708F, 0.4363F));
		PartDefinition torso_r10 = Body.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(51, 44).addBox(0.0F, -0.7039F, -0.3995F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.9F, 7.5294F, 2.0049F, 0.0F, 1.5708F, -0.48F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(16, 31).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(14, 45).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(-0.5076F, -1.6368F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, 3.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.925F, 2.975F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(38, 47).addBox(-3.0F, 1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.09F)),
				PartPose.offsetAndRotation(0.3884F, 4.1506F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(14, 45).mirror().addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(0.5076F, -1.6368F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(2.0F, 3.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(2.925F, 2.975F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(2.0F, 1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.09F)).mirror(false),
				PartPose.offsetAndRotation(-0.3884F, 4.1506F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(32, 31).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition part_r1 = RightLeg.addOrReplaceChild("part_r1", CubeListBuilder.create().texOffs(0, 53).addBox(-2.0F, 0.4378F, 0.7533F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.5855F, 5.9598F, -0.0176F, 0.0F, -1.5708F, -0.7025F));
		PartDefinition part_r2 = RightLeg.addOrReplaceChild("part_r2", CubeListBuilder.create().texOffs(48, 35).addBox(-2.0F, -2.3843F, -0.2042F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.5855F, 5.9598F, -0.0176F, 0.0F, -1.5708F, 0.1702F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 31).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition part_r3 = LeftLeg.addOrReplaceChild("part_r3", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-2.0F, 0.4378F, 0.7533F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(1.5855F, 5.9598F, -0.0176F, 0.0F, 1.5708F, 0.7025F));
		PartDefinition part_r4 = LeftLeg.addOrReplaceChild("part_r4", CubeListBuilder.create().texOffs(48, 35).mirror().addBox(-2.0F, -2.3843F, -0.2042F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(1.5855F, 5.9598F, -0.0176F, 0.0F, 1.5708F, -0.1702F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
