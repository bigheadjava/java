package ch048.generic_method;

/**
 * 演示泛型方法
 * 
 * @author 程序猿大头
 *
 */
public class GenericMethodSample {

	/**
	 * 泛型方法
	 * 
	 * @param e
	 */
	public <E> void method_1(E e) {
		System.out.println("method_1: " + e.getClass().getName());
	}

	public class GenericClass<T> { // 泛型内部类
		/**
		 * 在泛型类中声明了一个泛型方法，使用泛型T，T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
		 * 
		 * @param t
		 */
		public <T> void method_2(T t) {
			System.out.println("method_2: " + t.getClass().getName());
		}
		
		public void method_3(T t) {
			System.out.println("method_3: " + t.getClass().getName());
		}
	}
	
	public static void main(String[] args) {
		GenericMethodSample s1 = new GenericMethodSample();
		s1.method_1(new Integer(2));
		
		GenericMethodSample.GenericClass<String> ggc = new GenericMethodSample().new GenericClass<String>();
		ggc.method_2("Hello");
		ggc.method_2(99.9);
		ggc.method_2(true);
		ggc.method_3("Java");
		//ggc.method_3(12); 编译出错，因为因为泛型类型实参指定的是String，而传入的实参类是Integer
	}
}
