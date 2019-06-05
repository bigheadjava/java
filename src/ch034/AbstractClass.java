package ch034;

/**
 * 演示抽象类和抽象方法
 * 
 * @author 程序猿大头
 * 父类
 */
public abstract class AbstractClass {
	public void print(String name) {
		System.out.println(name + "，这是抽象类中的具体方法print()...");
	}

	public abstract void acs_method();
}
