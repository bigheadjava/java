package ch005;

/**
 * 演示类的结构
 * 
 * @author 程序猿大头
 *
 */
public class Person { // 声明一个Person类
	private String name; // 人的名字属性
	private int age; // 人的年龄属性
	private double height; // 人的身高属性
	private double weight; // 人的体重属性

	/**
	 * 无参数的构造方法，可以用它来创建Person对象，但是对象的属性都没有赋值
	 */
	public Person() {

	}

	/**
	 * 有参数的构造方法，可以用它来创建Person对象，对象属性都被赋值(值是方法的参数)
	 */
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * 人的工作方法
	 */
	public void work() {
		System.out.println("人需要工作才能挣钱...");
	}
}
