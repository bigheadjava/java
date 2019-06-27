package ch051.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * 缓冲区演示
 * 
 * @author 程序猿大头
 *
 */
public class BufferViewDemo1 {

	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(4); //分配一个容量为4个字节的字节缓冲区
		while(bb.hasRemaining()) { //判断当前位置和限制之间是否有数据
			System.out.println(bb.get()); //输出4个0
		}
		bb.rewind(); //把位置设为0
		
		CharBuffer cb = bb.asCharBuffer(); //获得ByteBuffer的CharBuffer视图
		cb.put("你好");
		while(bb.hasRemaining()) {
			System.out.println(bb.get()); //依次输出79,96,89,125
		}
	}

}
