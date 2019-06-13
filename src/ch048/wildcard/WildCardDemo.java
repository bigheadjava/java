package ch048.wildcard;

/**
 * 演示泛型通配符
 * 
 * @author 程序猿大头
 *
 */
public class WildCardDemo {

	public static void main(String[] args) {
		MyGenericClass<Integer> gInteger = new MyGenericClass<Integer>(9);
		MyGenericClass<Number> gNumber = new MyGenericClass<Number>(88);
		
		//gInteger.method(gInteger);  编译报错，参数类型不匹配
		gInteger.method(gNumber);
	}

}
