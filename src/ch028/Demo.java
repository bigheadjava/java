package ch028;

/**
 * 演示创建子类对象的时候会调用父类构造方法
 * @author 程序猿大头
 * 测试类
 */
public class Demo {

	public static void main(String[] args) {
		Child c = new Child();
		Child c1 = new Child(1);
	}

}
