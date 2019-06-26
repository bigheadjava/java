package ch051;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 演示OutputStreamWriter的用法
 * 
 * @author 程序猿大头
 *
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/file5.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		for(int i = 0; i < 100; i++) {
			osw.write('我');
			osw.write('爱');
			osw.write('你');
			osw.write('中');
			osw.write('国');
			osw.write('!');
			osw.write('\n');
		}
		osw.close();
	}

}
