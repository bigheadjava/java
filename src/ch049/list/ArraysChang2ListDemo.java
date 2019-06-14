package ch049.list;

import java.util.Arrays;
import java.util.List;

/**
 * 演示数组转换List对象
 * 
 * @author 程序猿大头
 *
 */
public class ArraysChang2ListDemo {

	public static void main(String[] args) {
		String[] ss = new String[] { "Thinking", "In", "Java" };
		List<String> list = Arrays.asList(ss);
		System.out.println(Arrays.toString(ss));
		list.set(0, list.get(0).concat(" "));
		list.remove(1); // 运行时会抛出异常
		list.add(2, "Cheer"); // 运行时会抛出异常

	}

}
