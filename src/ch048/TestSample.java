package ch048;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示为什么要有泛型
 * @author 程序猿大头
 *
 */
public class TestSample {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("java");
		list.add(99);

		for (int i = 0; i < list.size(); i++) {
			String item = (String) list.get(i);
			System.out.println("泛型测试==> item = " + item);
		}
	}

}
