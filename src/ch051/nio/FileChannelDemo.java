package ch051.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * 演示FileChannel读写文件
 * 
 * @author 程序猿大头
 *
 */
public class FileChannelDemo {

	public static void main(String[] args) throws IOException {
		final int SIZE = 1024;

		// 向文件中写数据
		FileOutputStream fos = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/nio_1.txt");
		FileChannel fc = fos.getChannel();
		fc.write(ByteBuffer.wrap("爱我中华".getBytes())); // warp: 将 byte 数组包装到缓冲区中。
		fc.close();

		// 向文件末尾添加数据
		RandomAccessFile raf = new RandomAccessFile("/Users/resource/codes/java/src/ch051/files/out/nio_1.txt", "rw");
		fc = raf.getChannel();
		fc.position(fc.size()); // 定位到文件末尾
		fc.write(ByteBuffer.wrap("我是中国人".getBytes()));
		fc.close();

		// 读文件
		FileInputStream in = new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/nio_1.txt");
		fc = in.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(SIZE);
		fc.read(buffer); // 把文件中的数据读入buffer
		buffer.flip(); // 把极限设为位置值，再把位置设定为0
		Charset cs = Charset.defaultCharset();
		System.out.println("本地平台字符编码: " + cs.name()); // 获得本地平台字符编码
		System.out.println(cs.decode(buffer)); // 转换为Unicode编码
		fc.close();

	}

}
