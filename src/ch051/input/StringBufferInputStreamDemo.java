package ch051.input;

import java.io.IOException;
import java.io.StringBufferInputStream;

/**
 * 演示StringBufferInputStream的用法
 * 
 * @author 程序猿大头
 *
 */
public class StringBufferInputStreamDemo {

	public static void main(String[] args) throws IOException {
		StringBufferInputStream sbi = new StringBufferInputStream("My name is Jimmy"); // 该类已经过时
		int data = sbi.read();
		while (data != -1) {
			System.out.println(data);
			data = sbi.read();
		}
		sbi.close();
	}

}
