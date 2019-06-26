package ch051;

import java.io.CharArrayWriter;

/**
 * 演示CharArrayWriter的用法
 * 
 * @author 程序猿大头
 *
 */
public class CharArrayWriterDemo {

	public static void main(String[] args) {
		CharArrayWriter w = new CharArrayWriter();
		w.write('我');
		w.write('爱');
		w.write('你');
		w.write('中');
		w.write('国');
		
		char[] buff = w.toCharArray();
		System.out.println(new String(buff));
		w.close();
	}

}
