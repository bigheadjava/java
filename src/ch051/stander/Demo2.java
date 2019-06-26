package ch051.stander;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 演示标准IO重定向
 * 
 * @author 程序猿大头
 *
 */
public class Demo2 {

	/**
	 * 为标准IO重定向
	 * 
	 * @param in
	 * @param out
	 * @param err
	 */
	public static void redirect(InputStream in, PrintStream out, PrintStream err) {
		System.setIn(in);
		System.setOut(out);
		System.setErr(err);
	}

	/**
	 * 把来自标准输入流的数据写到标准输出流和标准错误输出流
	 * 
	 * @throws IOException
	 */
	public static void copy() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String data;
		while ((data = br.readLine()) != null && data.length() != 0) {
			System.out.println(data); // 向标准输出流写数据
			System.err.println(data); // 向标准错误输出流写数据
		}
	}

	public static void main(String[] args) throws IOException {
		InputStream standardIn = System.in;
		PrintStream standardOut = System.out;
		PrintStream standardErr = System.err;

		InputStream in = new BufferedInputStream(
				new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/file5.txt"));
		PrintStream out = new PrintStream(new BufferedOutputStream(
				new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/out.txt")));
		PrintStream err = new PrintStream(new BufferedOutputStream(
				new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/err.txt")));

		redirect(in, out, err); // 把标准IO重定向到文件
		copy(); // 把file5.txt中内容copy到out.txt和err.txt中

		in.close();
		out.close();
		err.close();

		redirect(standardIn, standardOut, standardErr); // 让标准IO采用默认的流
		copy(); // 把从键盘输入的数据输出到控制台
	}

}
