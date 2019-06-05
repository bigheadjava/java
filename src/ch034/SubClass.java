package ch034;

/**
 * 演示抽象类和抽象方法
 * 
 * @author 程序猿大头 
 * 子类
 */
public class SubClass extends AbstractClass {

	@Override
	public void acs_method() {
		System.out.println("子类实现了抽象类中的抽象方法。");
	}

}
