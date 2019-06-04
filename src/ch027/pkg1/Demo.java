package ch027.pkg1;

import ch027.pkg2.ClassB;

/**
 * 演示继承
 * @author 程序猿大头
 *
 */
public class Demo {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();

		a.default_var = 'B';
		a.protected_var = 100;
		a.public_var = "Hello";

		a.default_method();
		a.public_method();
		a.protected_method();

		// b.default_var = 'B'; default_var是默认访问级别，不同包中不能被继承
		b.protected_var = 100;
		b.public_var = "Hello";

		// b.default_method(); default_method是默认访问级别，不同包中不能被继承
		b.public_method();
		b.protected_method();
	}

}
