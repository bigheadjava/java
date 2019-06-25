package ch051.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 演示BufferedOutputStream的用法
 * 
 * @author 程序猿大头
 *
 */
public class Sample2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/file4.txt");
		BufferedOutputStream out = new BufferedOutputStream(fos, 2); //装饰一个文件输出流
		DataOutputStream out1 = new DataOutputStream(out); //装饰一个带缓冲的输出流
		out1.writeUTF("大家好才是真的好...");
		out1.close();
		
		InputStream in = new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/file4.txt");
		BufferedInputStream in1 = new BufferedInputStream(in); //装饰一个文件输入流
		DataInputStream in2 = new DataInputStream(in1);//装饰一个带缓冲的输入流
		System.out.println(in2.readUTF());
		in2.close();
	}

}
