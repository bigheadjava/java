package ch047.fifth.two;

/**
 * 演示静态内部类中可以定义静态成员和实例成员
 * @author 程序猿大头
 *
 */
public class OuterClass2 {
	
	public static class InnerClass{
		int i_1; // 实例变量
		static int i_2; //静态变量
		
		public static class ClassC{ //静态内部类
			static int c;
		}
	}
}
