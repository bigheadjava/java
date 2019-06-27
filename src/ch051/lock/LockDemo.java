package ch051.lock;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/**
 * 演示文件加锁过程
 * 
 * @author 程序猿大头
 *
 */
public class LockDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileOutputStream fos = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/file2.txt");
		FileLock fileLock = fos.getChannel().tryLock();
		if (fileLock != null) {
			System.out.println("锁住了文件...");
			System.out.println(fileLock.isShared()); // 判断锁是不是共享锁
			Thread.sleep(60000); // 锁定文件60秒
			fileLock.release(); // 释放锁
			System.out.println("锁已经被释放...");
		}
	}

}
