package protocolsupport.protocol.pipeline.version.v_1_6;

import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import protocolsupport.api.Connection;
import protocolsupport.protocol.pipeline.ChannelHandlers;
import protocolsupport.protocol.pipeline.version.util.builder.AbstractNoopFramingPipeLineBuilder;
import protocolsupport.protocol.storage.netcache.NetworkDataCache;

public class PipeLineBuilder extends AbstractNoopFramingPipeLineBuilder {

	@Override
	public void buildCodec(Channel channel, Connection connection) {
		ChannelPipeline pipeline = channel.pipeline();
		NetworkDataCache sharedstorage = new NetworkDataCache();
		pipeline.addAfter(ChannelHandlers.RAW_CAPTURE_RECEIVE, ChannelHandlers.DECODER_TRANSFORMER, new PacketDecoder(connection, sharedstorage));
		pipeline.addAfter(ChannelHandlers.RAW_CAPTURE_SEND, ChannelHandlers.ENCODER_TRANSFORMER, new PacketEncoder(connection, sharedstorage));
	}

}
