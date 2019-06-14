package ch049.set.sort;

import java.util.Set;
import java.util.TreeSet;

/**
 * 演示定制化排序
 * 
 * @author 程序猿大头
 * 
 *
 */
public class Demo {

	public static void main(String[] args) {
		Set<Staff> ss = new TreeSet<Staff>(new StaffComparator());
		Staff s1 = new Staff("A", 7);
		Staff s2 = new Staff("B", 2);
		Staff s3 = new Staff("C", 8);
		Staff s4 = new Staff("D", 1);
		Staff s5 = new Staff("E", 2);
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		printStaffInfo(ss);
	}

	static void printStaffInfo(Set<Staff> ss) {
		for(Staff s : ss) {
			System.out.println(s.toString());
		}
	}
}
