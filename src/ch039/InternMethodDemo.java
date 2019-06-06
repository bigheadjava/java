package ch039;

/**
 * 演示String的intern()方法用法
 * 
 * @author 程序猿大头
 * 
 *         测试类
 */
public class InternMethodDemo {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		String s3 = new String("java");
		System.out.println(s1 == s2); // false
		System.out.println("-------------------Split Line-------------------");
		s2.intern(); // 执行了s1.intern(),但它的返回值没有赋给s2
		s3 = s3.intern(); // 把常量池中"java"的引用赋给s3
		System.out.println(s1 == s2); // flase
		System.out.println(s1 == s2.intern()); // true，说明s2.intern()返回的是常量池中"java"的引用
		System.out.println(s1 == s3); // true
	}

}
