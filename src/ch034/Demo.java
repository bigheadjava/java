package ch034;

/**
 * 演示抽象类和抽象方法
 * 
 * @author 程序猿大头
 * 测试类
 */
public class Demo {

	public static void main(String[] args) {
		AbstractClass ac = new SubClass(); //父类AbstractClass的引用指向子类SubClass的对象
		ac.print("Hello");
		ac.acs_method();
	}

}
