package ch051.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * 缓冲区视图演示
 * 
 * @author 程序猿大头
 *
 */
public class BufferViewDemo1 {

	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(1024); // 分配一个容量为1024个字节的字节缓冲区
		bb.asCharBuffer().put(new char[] { '我', '是', '中', '国', '人' });
		System.out.println(bb.getChar()); //获取第1个字符
		System.out.println(bb.getChar(2)); //获取第2个字符
		
		bb.rewind();
		CharBuffer cb = bb.asCharBuffer();
		while(cb.hasRemaining()) {
			char c = cb.get();
			if(c == '\0')
				break;
			System.out.println(c);
		}

	}

}
