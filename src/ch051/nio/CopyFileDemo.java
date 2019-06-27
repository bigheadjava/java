package ch051.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * 演示新IO复制文件
 * 
 * @author 程序猿大头
 *
 */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		final int SIZE = 1024;

		FileOutputStream fos = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/nio_3.txt");
		FileInputStream fis = new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/nio_1.txt");
		FileChannel in = fis.getChannel();
		FileChannel out = fos.getChannel();
		
		//下面2中方法都可以做到复制
		in.transferTo(0, in.size(), out);
		//out.transferFrom(in, 0, in.size());

		in.close();
		out.close();
	}

}
