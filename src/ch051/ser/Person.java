package ch051.ser;

import java.io.Serializable;

/**
 * 实现序列化接口
 * 
 * @author 程序猿大头
 *
 */
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4469275948565510167L;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
