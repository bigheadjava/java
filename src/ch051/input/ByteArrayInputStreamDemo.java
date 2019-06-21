package ch051.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 演示 ByteArrayInputStream
 * 
 * @author 程序猿大头
 *
 */
public class ByteArrayInputStreamDemo {

	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[] { 1, 15, 67, -1, -9, 9 };
		ByteArrayInputStream bis = new ByteArrayInputStream(buffer, 1, 2);
		int data = bis.read();
		while (data != -1) {
			System.out.print(data + " ");
			data = bis.read();
		}
		bis.close();
	}

}
