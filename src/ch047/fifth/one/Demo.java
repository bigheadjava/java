package ch047.fifth.one;

/**
 * 演示静态内部类的实例不会自动持有外部类的实例的引用
 * @author 程序猿大头
 *
 */
public class Demo {

	public static void main(String[] args) {
		ClassA.ClassB b = new ClassA.ClassB(); //无需先创建外部类的实例再创建内部类的实例
		b.a = 1;
	}

}
