package ch049.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 演示TreeSet
 * 
 * @author 程序猿大头
 *
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(2);
		set.add(8);
		set.add(7);
		set.add(1);

		for (Integer i : set) {
			System.out.print(i + "\t");
		}
	}

}
