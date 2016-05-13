package protocolsupport.protocol.packet.mcpe.middlepacketimpl.clientbound;

import java.io.IOException;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.packet.mcpe.packet.mcpe.ClientboundPEPacket;
import protocolsupport.protocol.packet.mcpe.packet.mcpe.clientbound.AddEntityPacket;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleSpawnLiving;
import protocolsupport.protocol.typeremapper.id.IdRemapper;
import protocolsupport.protocol.typeremapper.watchedentity.WatchedDataRemapper;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableEmptyList;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public class SpawnLiving extends MiddleSpawnLiving<RecyclableCollection<? extends ClientboundPEPacket>> {

	@Override
	public RecyclableCollection<? extends ClientboundPEPacket> toData(ProtocolVersion version) throws IOException {
		int remappedId = IdRemapper.ENTITY_LIVING.getTable(version).getRemap(type);
		if (remappedId == -1) {
			return RecyclableEmptyList.get();
		} else {
			return RecyclableSingletonList.create(new AddEntityPacket(
				entityId, remappedId,
				(float) x, (float) y, (float) z,
				yaw / 256.0F * 360.0F, pitch / 256.0F * 360.0F,
				motX / 8000.0F, motY / 8000.0F, motZ / 8000.F,
				WatchedDataRemapper.transform(wentity, metadata, version)
			));
		}
	}

}