package ch051;

import java.io.IOException;
import java.io.StringReader;

/**
 * 演示StringReader的用法
 * 
 * @author 程序猿大头
 *
 */
public class StringReaderDemo {

	public static void main(String[] args) throws IOException {
		StringReader reader = new StringReader("2019爱我中华!");
		int data;
		while ((data = reader.read()) != -1) {
			System.out.print((char)data);
		}
		reader.close();
	}

}
