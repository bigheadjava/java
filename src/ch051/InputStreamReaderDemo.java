package ch051;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 演示InputStreamReader用法
 * 
 * @author 程序猿大头
 *
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/file2.txt");
		InputStreamReader reader = new InputStreamReader(is);
		int data;
		while((data = reader.read())!= -1) {
			System.out.print((char)data);
		}
		reader.close();
	}

}
