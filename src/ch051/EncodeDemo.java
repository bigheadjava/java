package ch051;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 演示字符"爱"的各种字符编码
 * 
 * @author 程序猿大头
 *
 */
public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("在内存中采用Unicode字符编码: ");
		char c = '爱';
		int lowBit = c & 0xFF; // 获取二进制的低8位, 0x就是代表十六进制，A B C D E F 分别代表10 11 12 13 14 15
		int highBit = (c & 0xFF00) >> 8; // 获取二进制的高8位
		System.out.println(highBit + "\t" + lowBit);
		
		String s = "爱";
		System.out.println("采用本地操作系统的默认字符编码: ");
		read(s.getBytes());
		
		System.out.println("采用GBK字符编码: ");
		read(s.getBytes("GBK"));
		
		System.out.println("采用标准的UTF-8字符编码: ");
		read(s.getBytes("UTF-8"));
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
