package ch048.generic_class;

/**
 * 演示自定义泛型类
 * 
 * @author 程序猿大头
 *
 */
public class Demo {

	public static void main(String[] args) {
		MyGenericClass<String> gClass1 = new MyGenericClass<String>("Hello");
		MyGenericClass<Integer> gClass2 = new MyGenericClass<Integer>(123);
		System.out.println("gClass1 => T: " + gClass1.getKey());
		System.out.println("gClass2 => T: " + gClass1.getKey());
	}

}
