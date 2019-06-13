package ch048.generic_interface;

/**
 * 演示自定义泛型接口
 * 
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中 例如：class ClassA<T>
 * implements MyGeneratorInterface<T>
 * 如果不声明泛型，例如：class ClassA implements MyGeneratorInterface<T>
 * 编译器会报错："Unknown class"
 */
public class ClassA<T> implements MyGeneratorInterface<T> {

	@Override
	public T add(int a, int b) {
		return null;
	}

}
