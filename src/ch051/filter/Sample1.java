package ch051.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 演示DataInputStream和DataOutputStream的用法
 * 
 * @author 程序猿大头
 *
 */
public class Sample1 {

	public static void main(String[] args) throws IOException {
		//利用DataOutputStream写文件
		FileOutputStream fos = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/file3.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos); //装饰文件输出流
		DataOutputStream dos = new DataOutputStream(bos); //装饰带缓冲输出流
		dos.writeByte(-1);
		dos.writeInt(999);
		dos.writeBoolean(true);
		dos.writeLong(1234567899999999l);
		dos.writeChar('a');
		dos.writeFloat(0.89f);
		dos.writeDouble(0.888d);
		dos.writeUTF("我");
		dos.close();
		
		//利用DataInputStream读上面写的文件
		FileInputStream fis = new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/file3.txt");
		BufferedInputStream bis = new BufferedInputStream(fis); //装饰文件输入流
		DataInputStream dis = new DataInputStream(bis); //装饰带缓冲输入流
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readLong());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		dis.close();
	}

}
