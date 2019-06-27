package ch051.ser;

import java.io.Serializable;

/**
 * 实现序列化接口
 * 
 * @author 程序猿大头
 *
 */
public class Person implements Serializable {
	private String name;
	private int age;

	public Person() {
		super();
		System.out.println("调用无参数构造方法");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("调用2个参数的构造方法");
	}

	@Override
	public String toString() {
		return "name = " + name + "; age = " + age;
	}
}
