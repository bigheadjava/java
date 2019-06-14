package ch049.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 演示List排序
 * 
 * @author 程序猿大头
 *
 */
public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int temp = (int) (Math.random() * 100);
			listA.add(temp);
		}
		printList("排序之前: ", listA);
		Collections.sort(listA);
		printList("排序之后: ", listA);

		Collections.sort(listA, new Comparator<Integer>() {
			@Override
			public int compare(Integer s1, Integer s2) {
				if (s1 > s2) {
					return -1;
				} else if (s1 > s2) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		printList("逆序排序: ", listA);
	}

	public static void printList(String s, List list) {
		String str = "";
		for (Object obj : list) {
			str += obj.toString() + ",";
		}
		str = str.substring(0, str.length() - 1);
		System.out.println(s + str);
	}
}
