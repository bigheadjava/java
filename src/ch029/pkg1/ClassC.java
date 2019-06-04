package ch029.pkg1;

import ch029.pkg2.ClassA;

/**
 * 演示Java的控制访问级别
 * 
 * @author 程序猿大头
 *
 */
public class ClassC extends ClassA { // ClassC继承了ClassA的public_var和protected_var

	public void method() {
		public_var = 99;
		protected_var = 99;

		ClassA a = new ClassA();
		a.public_var = 88;
		// a.protected_var = 88; 编译出错
		// a.default_var = 88; 默认访问级别，不在同一个包中，不能访问
		// a.private_var = 88; 私有访问级别，不能被外部访问
	}
}