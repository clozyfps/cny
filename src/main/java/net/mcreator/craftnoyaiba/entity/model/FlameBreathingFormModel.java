package net.mcreator.craftnoyaiba.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnoyaiba.entity.FlameBreathingFormEntity;

public class FlameBreathingFormModel extends GeoModel<FlameBreathingFormEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlameBreathingFormEntity entity) {
		return new ResourceLocation("craftnoyaiba", "animations/flamingslash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlameBreathingFormEntity entity) {
		return new ResourceLocation("craftnoyaiba", "geo/flamingslash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlameBreathingFormEntity entity) {
		return new ResourceLocation("craftnoyaiba", "textures/entities/" + entity.getTexture() + ".png");
	}

}
