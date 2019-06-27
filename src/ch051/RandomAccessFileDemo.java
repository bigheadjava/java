package ch051;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 演示RandomAccessFile用法
 * 
 * @author 程序猿大头
 *
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("/Users/resource/codes/java/src/ch051/files/out/file8.txt", "rw");
		for (int i = 0; i < 20; i++) {
			rf.writeLong(i * 1024);
		}
		rf.seek(2 * 8); // 从文件头开始，跳过第2个long数据，接下来写第三个long数据
		rf.writeLong(998);

		rf.seek(0); // 把读写指针定位到文件开头
		for (int i = 0; i < 20; i++) {
			System.out.println("Data: " + i + " : " + rf.readLong());
		}
		rf.close();
	}

}
