package ch028;

/**
 * 演示创建子类对象的时候会调用父类构造方法
 * @author 程序猿大头
 * 子类
 */
public class Child extends Base {
	public Child() {
		System.out.println("调用子类无参数构造方法...");
	}

	public Child(int var) {
		System.out.println("调用子类有参数构造方法...");
		this.var = var;
	}
}
