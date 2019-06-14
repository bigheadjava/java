package ch049.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 演示Set的用法
 * 
 * @author 程序猿大头
 *
 */
public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		String s1 = "Hello, ";
		String s2 = "Java";
		String s3 = s2;
		String s4 = new String("Java");
		set.add(s1); // 往set中放入s1
		set.add(s2); // 往set中放入s2
		set.add(s3); // 往set中放入s3
		set.add(s4); // 往set中放入s4

		System.out.println(set.size());
	}

}
