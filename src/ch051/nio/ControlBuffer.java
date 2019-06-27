package ch051.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 演示控制缓冲区
 * 
 * @author 程序猿大头
 *
 */
public class ControlBuffer {

	public static void main(String[] args) throws IOException {
		final int SIZE = 8;

		FileOutputStream fos = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/nio_2.txt");
		FileInputStream fis = new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/nio_1.txt");
		FileChannel in = fis.getChannel();
		FileChannel out = fos.getChannel();

		ByteBuffer buff = ByteBuffer.allocate(SIZE); // 创建缓冲区
		while (in.read(buff) != -1) {
			System.out.println("缓冲区limit: " + buff.limit());
			System.out.println("缓冲区当前位置: " + buff.position());
			buff.flip(); // 把极限设为位置值，再把位置设定为0
			System.out.println("缓冲区limit: " + buff.limit());
			System.out.println("缓冲区当前位置: " + buff.position());
			System.out.println("------------------------");
			out.write(buff);
			buff.clear(); //把极限设为容量值，再把位置设定为0
		}

		in.close();
		out.close();
	}

}
