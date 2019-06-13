package ch048.generic_class;

/**
 * 演示自定义泛型类
 * 
 * @author 程序猿大头
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		MyGenericClass gClass1 = new MyGenericClass("Hello");
		MyGenericClass gClass2 = new MyGenericClass(123);
		System.out.println("gClass1 => T: " + gClass1.getKey());
		System.out.println("gClass2 => T: " + gClass2.getKey());
	}

}
