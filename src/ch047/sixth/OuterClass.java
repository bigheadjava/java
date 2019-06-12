package ch047.sixth;

/**
 * 演示局部内部类可以访问外部类的所有成员
 * 
 * @author 程序猿大头
 *
 */
public class OuterClass {
	int oc;

	public void method(final int p1, int p2) {
		int local_var1 = 9;
		final int local_var2 = 12;
		class LocalInnerClass {
			int lc1 = oc;
			int lc2 = p1;
			int lc3 = p2;
			int lc4 = local_var1;
			int lc5 = local_var2;
		}
	}
}
