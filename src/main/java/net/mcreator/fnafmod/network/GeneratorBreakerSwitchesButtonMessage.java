
package net.mcreator.fnafmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.world.inventory.GeneratorBreakerSwitchesMenu;
import net.mcreator.fnafmod.procedures.BreakerChange9Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange8Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange7Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange6Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange5Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange4Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange3Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange2Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange1Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange16Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange15Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange14Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange13Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange12Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange11Procedure;
import net.mcreator.fnafmod.procedures.BreakerChange10Procedure;
import net.mcreator.fnafmod.FnafModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeneratorBreakerSwitchesButtonMessage {
	private final int buttonID, x, y, z;

	public GeneratorBreakerSwitchesButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public GeneratorBreakerSwitchesButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(GeneratorBreakerSwitchesButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(GeneratorBreakerSwitchesButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = GeneratorBreakerSwitchesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BreakerChange1Procedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			BreakerChange2Procedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			BreakerChange3Procedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			BreakerChange4Procedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			BreakerChange5Procedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			BreakerChange6Procedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			BreakerChange8Procedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			BreakerChange7Procedure.execute(world, x, y, z);
		}
		if (buttonID == 8) {

			BreakerChange9Procedure.execute(world, x, y, z);
		}
		if (buttonID == 9) {

			BreakerChange10Procedure.execute(world, x, y, z);
		}
		if (buttonID == 10) {

			BreakerChange11Procedure.execute(world, x, y, z);
		}
		if (buttonID == 11) {

			BreakerChange12Procedure.execute(world, x, y, z);
		}
		if (buttonID == 12) {

			BreakerChange13Procedure.execute(world, x, y, z);
		}
		if (buttonID == 13) {

			BreakerChange14Procedure.execute(world, x, y, z);
		}
		if (buttonID == 14) {

			BreakerChange15Procedure.execute(world, x, y, z);
		}
		if (buttonID == 15) {

			BreakerChange16Procedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FnafModMod.addNetworkMessage(GeneratorBreakerSwitchesButtonMessage.class, GeneratorBreakerSwitchesButtonMessage::buffer, GeneratorBreakerSwitchesButtonMessage::new, GeneratorBreakerSwitchesButtonMessage::handler);
	}
}
