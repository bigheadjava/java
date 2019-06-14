package ch049.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 演示ListIterator用法
 * 
 * @author 程序猿大头
 *
 */
public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int temp = (int) (Math.random() * 100);
			listA.add(temp);
		}
		printList("初始的List: ", listA);

		ListIterator<Integer> li = listA.listIterator(); // 通过listIterator()方法获得ListIterator的实例
		li.add(new Integer(33)); // 往列表中插入一个元素
		String str = "";
		while (li.hasNext()) { // 判断列表中是否还有下一个元素
			str += li.next() + ","; // 获取列表中下一个元素
		}
		str = str.substring(0, str.length() - 1);
		System.out.println("转换ListIterator之后的列表: " + str);
		printList("初始的List: ", listA);

		String str1 = "";
		while (li.hasPrevious()) { // 判断列表中是否还有下一个元素
			str1 += li.previous() + ","; // 获取列表中下一个元素
		}
		str1 = str1.substring(0, str1.length() - 1);
		System.out.println("转换ListIterator之后的列表: " + str1);

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
