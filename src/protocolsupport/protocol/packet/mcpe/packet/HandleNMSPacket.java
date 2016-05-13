package protocolsupport.protocol.packet.mcpe.packet;

import java.io.IOException;

import net.minecraft.server.v1_9_R2.ChatComponentText;
import net.minecraft.server.v1_9_R2.MinecraftServer;
import net.minecraft.server.v1_9_R2.Packet;
import net.minecraft.server.v1_9_R2.PacketDataSerializer;
import net.minecraft.server.v1_9_R2.PacketListener;

public abstract class HandleNMSPacket<T extends PacketListener> implements Packet<T> {

	@Override
	public void a(PacketDataSerializer arg0) throws IOException {
	}

	@Override
	public void b(PacketDataSerializer arg0) throws IOException {
	}

	@Override
	public void a(T listener) {
		handle(listener);
	}

	@SuppressWarnings("deprecation")
	protected void handle(T listener) {
		try {
			handle0(listener);
		} catch (Throwable t) {
			listener.a(new ChatComponentText("Failed to handle packet: "+this.getClass()));
			if (MinecraftServer.getServer().isDebugging()) {
				t.printStackTrace();
			}
		}
	}

	public abstract void handle0(T listener) throws Throwable;

}