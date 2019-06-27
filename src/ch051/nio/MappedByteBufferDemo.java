package ch051.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * 演示MappedByteBuffer的用法
 * 
 * @author 程序猿大头
 *
 */
public class MappedByteBufferDemo {

	public static void main(String[] args) throws IOException{
		int capacity = 0x8000000; //128MB
		MappedByteBuffer mb = new RandomAccessFile("/Users/resource/codes/java/src/ch051/files/out/log.txt", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, capacity);
		mb.put("大家好才是真的好".getBytes("UTF-8"));
		mb.flip(); //把极限设为位置值，并把位置设置为0
		System.out.println(Charset.forName("UTF-8").decode(mb));
	}

}
