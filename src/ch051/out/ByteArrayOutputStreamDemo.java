package ch051.out;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 演示ByteArrayOutputStream的用法
 * 
 * @author 程序猿大头
 *
 */
public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write("大家好...".getBytes("UTF-8")); // 把字符串内容的UTF-8编码写到字节数组中
		byte[] buffer = baos.toByteArray(); // 获得字节数组
		baos.close();// 写了也白写，不做任何事

		ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
		int length = bais.available(); // 返回可从此输入流读取（或跳过）的剩余字节数。
		byte[] bufferIn = new byte[length];
		bais.read(bufferIn); // 把buffer字节数组中的数据读到bufferIn中
		bais.close(); // 写了也白写，不做任何事

		System.out.println(new String(bufferIn, "UTF-8"));
	}

}
