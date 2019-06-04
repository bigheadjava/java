package ch030.pkg1;

/**
 * 演示子类隐藏父类的静态方法
 * @author 程序猿大头
 *
 */
public class Sub extends Base{
	void method() {
		System.out.println("子类的实例方法...");
	}
	
	static void staticMethod() {
		System.out.println("子类的静态方法...");
	}
	
	public static void main(String[] args) {
		Base sub1 = new Sub(); //父类类型的引用指向子类的对象
		sub1.method();
		sub1.staticMethod();
		
		Sub sub2 = new Sub(); //子类类型的引用指向子类的对象
		sub2.method();
		sub2.staticMethod();
	}
}
