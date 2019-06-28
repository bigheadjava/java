package ch051;

import java.io.File;
import java.io.IOException;

/**
 * 演示File类的用法
 * 
 * @author 程序猿大头
 *
 */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		File dir1 = new File("/Users/resource/codes/java/src/ch051/files/out/dir1");
		System.out.println("测试目录dir1是否存在: " + dir1.exists());

		// 目录不存在就新建目录
		if (!dir1.exists()) {
			dir1.mkdirs();
		}

		File dir2 = new File(dir1, "dir2");
		System.out.println("测试目录dir2是否存在: " + dir2.exists());
		// 目录不存在就新建目录
		if (!dir2.exists()) {
			dir2.mkdirs();
		}

		File dir3 = new File(dir1, "dir2/dir3");
		System.out.println("测试目录dir3是否存在: " + dir3.exists());
		// 目录不存在就新建目录
		if (!dir3.exists()) {
			dir3.mkdirs();
		}

		File file = new File(dir3, "fileDemo.txt");
		System.out.println("测试文件fileDemo.txt是否存在: " + file.exists());
		// 文件不存在就创建新文件
		if (!file.exists()) {
			file.createNewFile();
		}

		listDir(dir1, 0);
		deleteDir(dir1);
	}

	/**
	 * 递归打印文件目录结构
	 * 
	 * @param dir
	 * @param level
	 */
	private static void listDir(File dir, int level) {
		File[] list = dir.listFiles();
		for (File f : list) {
			int i = 0;
			while (i < level) {
				System.out.print("\t");
				i++;
			}
			System.out.println(f.getName());
			if (f.isDirectory()) {
				listDir(f, ++level);
				level--;
			}
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param dir
	 */
	private static void deleteDir(File dir) {
		if (dir.isFile()) {
			dir.delete();
		} else {
			File[] list = dir.listFiles();
			for (File f : list) {
				deleteDir(f); // 删除当前目录下所有子目录和文件
			}
			dir.delete(); // 删除当前目录
		}
	}

}
