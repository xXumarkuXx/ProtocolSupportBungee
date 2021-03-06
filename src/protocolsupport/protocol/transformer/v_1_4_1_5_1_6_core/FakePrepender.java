package protocolsupport.protocol.transformer.v_1_4_1_5_1_6_core;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class FakePrepender extends MessageToByteEncoder<ByteBuf> {

	@Override
	protected void encode(ChannelHandlerContext ctx, ByteBuf buf, ByteBuf out) throws Exception {
		out.writeBytes(buf);
	}

}
