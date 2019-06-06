package ch038.sample;

/**
 * 演示克隆的实现
 * 
 * @author 程序猿大头 
 * 
 * 测试类
 */
public class CloneDemo {

	public static void main(String[] args) {
		Classes cls_1 = new Classes("爱因斯坦B班", 8);
		Student s_1 = new Student("Jim", 8, cls_1);

		try {
			Student s_2 = (Student) s_1.clone();
			System.out.println("测试s_1和s_2对象是不是同一个对象：" + (s_1 == s_2));
			System.out.println("打印s_1对象信息：" + s_1.toString());
			System.out.println("打印s_2对象信息：" + s_2.toString());

			System.out.println("测试s_1和s_2属性name是不是同一个对象：" + (s_1.getName() == s_2.getName()));
			System.out.println("测试s_1和s_2属性classes是不是同一个对象：" + (s_1.getClass() == s_2.getClass()));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
