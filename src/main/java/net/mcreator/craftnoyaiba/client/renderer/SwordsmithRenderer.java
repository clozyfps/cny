
package net.mcreator.craftnoyaiba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnoyaiba.entity.SwordsmithEntity;
import net.mcreator.craftnoyaiba.client.model.Modelswordsmith;

public class SwordsmithRenderer extends MobRenderer<SwordsmithEntity, Modelswordsmith<SwordsmithEntity>> {
	public SwordsmithRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswordsmith(context.bakeLayer(Modelswordsmith.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SwordsmithEntity entity) {
		return new ResourceLocation("craftnoyaiba:textures/entities/swordsmithtexture.png");
	}
}
