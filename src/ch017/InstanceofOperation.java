package ch017;

import ch012.Computer;

/**
 * 演示instanceof操作符的使用
 * 
 * @author 程序猿大头
 *
 */
public class InstanceofOperation {

	public static void main(String[] args) {
		Computer pc = new Computer();
		Object obj = new Object();
		System.out.println(pc instanceof Computer); // true
		System.out.println(pc instanceof Object); // true
		System.out.println(obj instanceof Computer); // false
	}

}
