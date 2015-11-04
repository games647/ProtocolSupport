package protocolsupport.protocol.transformer.mcpe.utils;

import io.netty.buffer.ByteBuf;

import java.io.DataInput;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

import protocolsupport.utils.Utils;

public class PEDataInput implements DataInput {

	private ByteBuf buf;
	public PEDataInput(ByteBuf buf) {
		this.buf = buf.order(ByteOrder.LITTLE_ENDIAN);
	}

	@Override
	public void readFully(byte[] b) throws IOException {
		buf.readBytes(b);
	}

	@Override
	public void readFully(byte[] b, int off, int len) throws IOException {
		buf.readBytes(b, off, len);
	}

	@Override
	public int skipBytes(int n) throws IOException {
		int readable = buf.readableBytes();
		n = Math.min(n, readable);
		buf.skipBytes(readable);
		return readable;
	}

	@Override
	public boolean readBoolean() throws IOException {
		return buf.readBoolean();
	}

	@Override
	public byte readByte() throws IOException {
		 return buf.readByte();
	}

	@Override
	public int readUnsignedByte() throws IOException {
		return buf.readUnsignedByte();
	}

	@Override
	public short readShort() throws IOException {
		return buf.readShort();
	}

	@Override
	public int readUnsignedShort() throws IOException {
		return buf.readUnsignedShort();
	}

	@Override
	public char readChar() throws IOException {
		return buf.readChar();
	}

	@Override
	public int readInt() throws IOException {
		return buf.readInt();
	}

	@Override
	public long readLong() throws IOException {
		return buf.readLong();
	}

	@Override
	public float readFloat() throws IOException {
		return buf.readFloat();
	}

	@Override
	public double readDouble() throws IOException {
		return buf.readDouble();
	}

	@Override
	public String readLine() throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public String readUTF() throws IOException {
		return new String(Utils.toArray(buf.readBytes(buf.readShort())), StandardCharsets.UTF_8);
	}

}