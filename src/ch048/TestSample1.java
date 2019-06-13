package ch048;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试泛型是不是只在编译期间生效
 * @author 程序猿大头
 *
 */
public class TestSample1 {

	public static void main(String[] args) {
		List<String> list_1 = new ArrayList<String>();
		List<Integer> list_2 = new ArrayList<Integer>();
		
		Class c1 = list_1.getClass();
		Class c2 = list_2.getClass();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
	}

}
