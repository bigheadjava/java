package ch047.extend;

/**
 * 演示内部类的继承
 * 
 * @author 程序猿大头
 *
 */
public class Demo extends OuterClass.InnerClass {

	public Demo(OuterClass oc) { //因为InnerClass是OuterClass的内部类，所以Demo必须引用一个OuterClass实例
		oc.super();
	}

	public static void main(String[] args) {
		OuterClass o1 = new OuterClass(5);
		OuterClass o2 = new OuterClass(15);

		OuterClass.InnerClass in = o1.new InnerClass();
		in.method();

		Demo d1 = new Demo(o1);
		Demo d2 = new Demo(o2);
		d1.method();
		d2.method();
	}

}
