package protocolsupport.protocol.transformer.mcpe.packet.mcpe.serverbound;

import io.netty.buffer.ByteBuf;

import java.util.Collections;
import java.util.List;

import net.minecraft.server.v1_9_R2.BlockPosition;
import net.minecraft.server.v1_9_R2.Packet;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.packet.ServerBoundPacket;
import protocolsupport.protocol.packet.middleimpl.PacketCreator;
import protocolsupport.protocol.serializer.PacketDataSerializer;
import protocolsupport.protocol.storage.SharedStorage;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.PEPacketIDs;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.ServerboundPEPacket;

public class DropItemPacket implements ServerboundPEPacket {

	@Override
	public int getId() {
		return PEPacketIDs.DROP_ITEM_PACKET;
	}

	@Override
	public ServerboundPEPacket decode(ByteBuf buf) throws Exception {
		PacketDataSerializer serializer = new PacketDataSerializer(buf, ProtocolVersion.MINECRAFT_PE);
		serializer.readByte();
		serializer.readItemStack();
		return this;
	}

	@Override
	public List<? extends Packet<?>> transfrom(SharedStorage storage) throws Exception {
		PacketCreator creator = PacketCreator.create(ServerBoundPacket.PLAY_BLOCK_DIG.get());
		creator.writeByte(3);
		creator.a(BlockPosition.ZERO);
		creator.writeByte(0);
		return Collections.singletonList(creator.create());
	}

}