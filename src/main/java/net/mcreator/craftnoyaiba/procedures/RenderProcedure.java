package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;
import net.mcreator.craftnoyaiba.init.CraftnoyaibaModItems;
import net.mcreator.craftnoyaiba.client.model.Modeluzuisheathe;
import net.mcreator.craftnoyaiba.client.model.Modelsheathe;
import net.mcreator.craftnoyaiba.client.model.Modelemptysheathe;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class RenderProcedure {
	@SubscribeEvent
	public static void KleidersRenderEvent(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Rank).equals("Upper Moon 6")) {
			if (_evt.getRenderer() instanceof PlayerRenderer) {
				if (_evt instanceof RenderLivingEvent.Pre) {
					// _evt.setCanceled(true);
				}
				new com.kleiders.kleidersplayerrenderer.ClassicPlayerRenderer(new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font),
						new ResourceLocation("craftnoyaiba:textures/entities/uppermoon_eyes_daki.png"))
						.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem()) {
			if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem() == CraftnoyaibaModItems.SPECIAL_THUNDER_NICHIRIN.get()
					|| ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem() == CraftnoyaibaModItems.SPECIAL_THUNDER_NICHIRIN.get()) {
				if (_evt.getRenderer() instanceof PlayerRenderer) {
					if (_evt instanceof RenderLivingEvent.Pre) {
						// _evt.setCanceled(true);
					}
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context, new ResourceLocation("craftnoyaiba:textures/entities/sheathethunder.png"), new Modelemptysheathe(context.bakeLayer(Modelemptysheathe.LAYER_LOCATION)))
							.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
				}
			}
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword))
				: false)
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem())) {
			if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem() == CraftnoyaibaModItems.SPECIAL_THUNDER_NICHIRIN.get()
					|| ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem() == CraftnoyaibaModItems.SPECIAL_THUNDER_NICHIRIN.get()) {
				if (_evt.getRenderer() instanceof PlayerRenderer) {
					if (_evt instanceof RenderLivingEvent.Pre) {
						// _evt.setCanceled(true);
					}
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context, new ResourceLocation("craftnoyaiba:textures/entities/sheathethunder.png"), new Modelsheathe(context.bakeLayer(Modelsheathe.LAYER_LOCATION)))
							.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
				}
			}
			if (((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem() == CraftnoyaibaModItems.SOUND_NICHIRIN_SWORD.get()) {
				if (_evt.getRenderer() instanceof PlayerRenderer) {
					if (_evt instanceof RenderLivingEvent.Pre) {
						// _evt.setCanceled(true);
					}
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context, new ResourceLocation("craftnoyaiba:textures/entities/uzui_sheathe.png"), new Modeluzuisheathe(context.bakeLayer(Modeluzuisheathe.LAYER_LOCATION)))
							.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
				}
			}
		}
	}
}
