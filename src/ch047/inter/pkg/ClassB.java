package ch047.inter.pkg;

/**
 * 演示接口中定义内部类
 * @author 程序猿大头
 *
 */
public class ClassB {
	MyInterface.InnerClass mi = new MyInterface.InnerClass();
	//InnerClass ic = new InnerClass(); 编译出错
}
