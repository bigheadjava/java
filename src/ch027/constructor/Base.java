package ch027.constructor;

/**
 * 演示创建子类对象的时候会调用父类构造方法
 * @author 程序猿大头
 * 父类
 */
public class Base {
	int var;

	public Base() {
		System.out.println("调用父类无参数构造方法...");
	}

	public Base(int var) {
		this.var = var;
		System.out.println("调用父类有参数构造方法...");
	}
}
