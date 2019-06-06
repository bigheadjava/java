package ch038.shallow;

import ch038.sample.Classes;
import ch038.sample.Student;

/**
 * 演示浅克隆
 * 
 * @author 程序猿大头
 * 
 *         测试类
 */
public class ShallowCloneDemo {

	public static void main(String[] args) {
		Classes cls_1 = new Classes("爱因斯坦B班", 8);
		Student s_1 = new Student("Jim", 8, cls_1);

		try {
			Student s_2 = (Student) s_1.clone();
			s_2.setName("Lucy");
			s_2.setAge(12);
			s_2.getClasses().setClassName("爱迪生A班");
			s_2.getClasses().setClassNo(2);

			System.out.println("测试s_1和s_2对象是不是同一个对象：" + (s_1 == s_2));
			System.out.println("打印s_1对象属性：" + s_1.toString());
			System.out.println("打印s_2对象属性：" + s_2.toString());
			
			System.out.println("测试s_1和s_2属性name是不是同一个对象：" + (s_1.getName() == s_2.getName()));
			System.out.println("测试s_1和s_2属性classes是不是同一个对象：" + (s_1.getClasses() == s_2.getClasses()));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
