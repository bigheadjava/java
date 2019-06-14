package ch048.generic_class;

/**
 * 演示自定义泛型类
 * 
 * @author 程序猿大头
 *
 */
public class MyGenericClass<T> { // T可以随意写，比如K，M等；一般推荐T

	private T key;

	/**
	 * 泛型构造方法形参key的类型也为T，T的类型由外部指定
	 * 虽然方法中使用了泛型，但是这并不是一个泛型方法。
     * 这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
     * 所以在这个方法中才可以继续使用 T 这个泛型。
     * 
	 * @param key
	 */
	public MyGenericClass(T key) {
		this.key = key;
	}
	
	/**
	 * 不是泛型方法，只是成员方法
	 * getKey的返回值类型为T，T的类型由外部指定
	 * @return
	 */
	public T getKey() {
		return key;
	}
}
