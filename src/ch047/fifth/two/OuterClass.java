package ch047.fifth.two;

/**
 * 演示静态内部类访问外部类的成员
 * @author 程序猿大头
 *
 */
public class OuterClass {
	
	private int out1;
	private static int out2;
	
	public static class InnerClass{
		//int in1 = out1; 编译出错，不能直接访问外部类OuterClass的实例变量out1
		int in2 = out2; //合法，可以直接访问外部类OuterClass的静态变量out2
		int in3 = new OuterClass().out1; //合法，可以通过外部类OuterClass的实例去访问外部类OuterClass的实例变量out1
	}
}
