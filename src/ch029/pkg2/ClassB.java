package ch029.pkg2;

/**
 * 演示Java的控制访问级别
 * 
 * @author 程序猿大头 
 *
 */
public class ClassB {
	public void method() {
		ClassA a = new ClassA();
		a.protected_var = 100;
		a.default_var = 100; // 默认访问级别，在同一个包中可以访问
		a.public_var = 100;
		// a.private_var = 100; 编译出错，因为private_var是private类型，不能被外界访问
	}
}
