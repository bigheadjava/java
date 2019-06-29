package ch051.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 演示带buffer的FileInputStream用法
 * 
 * @author 程序猿大头
 *
 */
public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		final int SIZE = 1024;
		FileInputStream fis = new FileInputStream("/Users/resource/codes/java/src/ch051/files/file2.txt");
		FileOutputStream out = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/file2.txt");
		byte[] buffer = new byte[SIZE]; //缓冲区
		int data = fis.read(buffer); //从文件中读数据进缓冲区
		while(data != -1) {
			out.write(buffer,0,data);
			data = fis.read(buffer);
		}
		fis.close();
		out.close();
	}

}
