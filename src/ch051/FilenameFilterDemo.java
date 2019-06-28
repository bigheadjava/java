package ch051;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 演示FilenameFilter用法
 * 
 * @author 程序猿大头
 *
 */
public class FilenameFilterDemo {

	public static void main(String[] args) {
		File dir = new File("/Users/resource/codes/java/src/ch051/files/out/");
		FilenameFilter filter = new FilenameFilter() { // 匿名内部类
			@Override
			public boolean accept(File dir, String name) {
				System.out.println("根路径: " + dir.getPath() + "; 子路径: " + name);
				File file = new File(dir, name);
				if (file.isFile() && name.indexOf(".txt") != -1) {
					return true;
				}
				return false;
			}
		};
		String[] list = dir.list(filter);
		for(String s : list) {
			System.out.println(s);
		}
	}

}
