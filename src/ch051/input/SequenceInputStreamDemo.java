package ch051.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/**
 * 演示SequenceInputStream的用法
 * 
 * @author 程序猿大头
 *
 */
public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		InputStream s1 = new ByteArrayInputStream("abcde".getBytes());
		InputStream s2 = new ByteArrayInputStream("12345".getBytes());
		InputStream in = new SequenceInputStream(s1, s2);
		int data = in.read();
		while (data != -1) {
			System.out.print(data + " ");
			data = in.read();
		}
		s1.close();
		s2.close();
		in.close();
	}

}
