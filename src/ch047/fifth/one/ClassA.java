package ch047.fifth.one;

/**
 * 演示静态内部类的实例不会自动持有外部类的实例的引用
 * @author 程序猿大头
 *
 */
public class ClassA {
	public static class ClassB{
		int a;
	}
}
