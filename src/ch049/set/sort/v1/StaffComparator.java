package ch049.set.sort.v1;

import java.util.Comparator;

/**
 * 演示定制化排序，开发比较器Comparator
 * 
 * @author 程序猿大头
 *
 *         定制一个员工类的比较器，实现按工龄
 */
public class StaffComparator implements Comparator<Staff> {

	@Override
	public int compare(Staff s1, Staff s2) {
		if (s1.getWorkYear() > s2.getWorkYear()) {
			return -1;
		} else if (s1.getWorkYear() < s2.getWorkYear()) {
			return 1;
		} else {
			return s1.getName().compareTo(s2.getName());
		}
	}
}