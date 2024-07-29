package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnoyaiba.entity.PrimaryGaleSlashEntity;

public class PrimaryGaleSlashModel extends GeoModel<PrimaryGaleSlashEntity> {
	@Override
	public ResourceLocation getAnimationResource(PrimaryGaleSlashEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/primarygaleslash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrimaryGaleSlashEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/primarygaleslash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrimaryGaleSlashEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}
