package ch047.fifth.two;

/**
 * 演示客户类可以通过完整的类名直接访问静态内部类的静态成员
 * @author 程序猿大头
 *
 */
public class OuterClass2Demo {
		
	public static void main(String[] args) {
		int c  = OuterClass2.InnerClass.ClassC.c;
		System.out.println(c);
	}
}
