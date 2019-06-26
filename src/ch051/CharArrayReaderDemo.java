package ch051;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * 演示CharArrayReader用法
 * 
 * @author 程序猿大头
 *
 */
public class CharArrayReaderDemo {

	public static void main(String[] args) throws IOException {
		char[] buff = new char[] { 'a', '中', '国', '9' };
		CharArrayReader reader = new CharArrayReader(buff);
		int data;
		while ((data = reader.read()) != -1) {
			System.out.print((char) data + " ");
		}
		reader.close();
	}

}
