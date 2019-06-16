package ch049.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * 演示List排序: 学生分数降序，利用Comparator接口实现
 * 
 * @author 程序猿大头
 *
 */
public class StudentSortDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("lirunze", 99);
		Student s2 = new Student("abc", 19);
		Student s3 = new Student("def", 89);
		Student s4 = new Student("ggg", 91);
		Student s5 = new Student("sss", 95);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return -(o1.getScore() - o2.getScore());
			}
		});
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}
