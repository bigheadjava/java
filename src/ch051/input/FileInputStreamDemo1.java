package ch051.input;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 演示FileInputStream用法
 * 
 * @author 程序猿大头
 *
 */
public class FileInputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/Users/resource/codes/java/src/ch051/files/file1.txt");
		int data;
		while((data = fis.read()) != -1) {
			System.out.print(data + " ");
		}
		fis.close();
	}

}
