
package net.mcreator.craftnoyaiba.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.world.inventory.UniformSelectorMenu;
import net.mcreator.craftnoyaiba.procedures.YellowUniformSelectProcedure;
import net.mcreator.craftnoyaiba.procedures.RedUniformSelectProcedure;
import net.mcreator.craftnoyaiba.procedures.PurpleUniformSelectProcedure;
import net.mcreator.craftnoyaiba.procedures.GreenUniformSelectProcedure;
import net.mcreator.craftnoyaiba.procedures.BrownUniformSelectProcedure;
import net.mcreator.craftnoyaiba.procedures.BlueUniformSelectProcedure;
import net.mcreator.craftnoyaiba.procedures.BlackUniformSelectProcedure;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UniformSelectorButtonMessage {
	private final int buttonID, x, y, z;

	public UniformSelectorButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public UniformSelectorButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(UniformSelectorButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(UniformSelectorButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = UniformSelectorMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BlackUniformSelectProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			RedUniformSelectProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			BlueUniformSelectProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			YellowUniformSelectProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			PurpleUniformSelectProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			GreenUniformSelectProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			BrownUniformSelectProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftnoyaibaMod.addNetworkMessage(UniformSelectorButtonMessage.class, UniformSelectorButtonMessage::buffer, UniformSelectorButtonMessage::new, UniformSelectorButtonMessage::handler);
	}
}
