package ch048.generic_interface;

/**
 * 演示自定义泛型接口
 * 
 * 传入泛型实参时：
 * 定义一个类实现这个接口,虽然我们只创建了一个泛型接口MyGeneratorInterface<T>
 * 但是我们可以为T传入无数个实参，形成无数种类型的MyGeneratorInterface接口。
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * 即：MyGeneratorInterface<T>，public T add();中的的T都要替换成传入的Integer类型。
 */
public class ClassB implements MyGeneratorInterface<Integer> {

	@Override
	public Integer add(int a, int b) {
		return a + b;
	}

}
