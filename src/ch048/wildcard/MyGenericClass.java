package ch048.wildcard;

/**
 * 演示泛型通配符
 * 
 * @author 程序猿大头
 *
 */
public class MyGenericClass<T> { // T可以随意写，比如K，M等；一般推荐T

	private T key;

	/**
	 * 泛型构造方法形参key的类型也为T，T的类型由外部指定
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
	
	/**
	 * 普通方法，只不过使用了泛型通配符?，不是泛型方法
     * ?是一种类型实参，可以看做为Number等所有类的父类
     * 
	 * @param mgc
	 */
	public void method(MyGenericClass<Number> mgc) {
		System.out.println("key is " + mgc.getKey());
	}
}
