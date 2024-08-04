package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class ThirdFormSlashModel extends GeoModel<ThirdFormSlashEntity> {
	@Override
	public ResourceLocation getAnimationResource(ThirdFormSlashEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/thirdform.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ThirdFormSlashEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/thirdform.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ThirdFormSlashEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}