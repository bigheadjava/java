package ch038.deep;

/**
 * 演示深克隆的实现
 * @author 程序猿大头
 * 
 * 学生类
 */
public class Student implements Cloneable {

	private String name;
	private int age;
	private Classes classes;

	public Student() {

	}

	public Student(String name, int age, Classes classes) {
		this.name = name;
		this.age = age;
		this.classes = classes;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		Classes c = (Classes) classes.clone(); //克隆classes属性
		s.setClasses(c);
		return s;
	}

	@Override
	public String toString() {
		String s = "Student信息 => name: " + name + "; age = " + age + "; class = " + classes;
		return s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

}
