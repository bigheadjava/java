package ch051.filter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 演示PrintStream的print(String s)和DataOutputStream的writeUTF(String s)的区别
 * 
 * @author 程序猿大头
 *
 */
public class Sample3 {

	public static void main(String[] args) throws IOException {
		//通过PrintStream写字符串
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(out, true);
		ps.print("大家好");
		ps.close();
		byte[] buff = out.toByteArray(); //获取字节数组
		System.out.println("采用本地操作系统的默认编码: ");
		read(buff);
		
		//通过DataOutputStream写字符串
		out = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF("大家好");
		dos.close();
		buff = out.toByteArray(); //获取字节数组
		System.out.println("采用本适用于Java的UTF-8编码: ");
		read(buff);
		
	}

	private static void read(byte[] buff) throws IOException {
		ByteArrayInputStream bas = new ByteArrayInputStream(buff);
		int data;
		while ((data = bas.read()) != -1) {
			System.out.print(data + "\t");
		}
		System.out.println();
		bas.close();
	}

}
