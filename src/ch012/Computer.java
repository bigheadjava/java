package ch012;

/**
 * 演示Java中的方法，这是一个电脑类
 * 
 * @author 程序猿大头
 * 
 */
public class Computer {
	/**
	 * 电脑品牌
	 */
	private String brand;

	/**
	 * 电脑型号
	 */
	private String model;

	/**
	 * 是否是笔记本电脑
	 */
	private boolean isLaptop;

	/**
	 * 无参数的构造方法 通过它来创建的对象，属性值是属性对应的数据类型的默认值
	 */
	public Computer() {

	}

	/**
	 * 有参数的构造方法 通过它来创建的对象属性是创建对象时传入的属性值
	 * 
	 * @param brand
	 * @param model
	 * @param isLaptop
	 */
	public Computer(String brand, String model, boolean isLaptop) {
		this.brand = brand;
		this.model = model;
		this.isLaptop = isLaptop;
	}

	/**
	 * 该方法模拟电脑的计算能力 该方法是静态的，用static修饰了
	 */
	public static void compute() {
		System.out.println("电脑都是用来进行数据处理的...");
	}

	/**
	 * 普通方法，用来改变电脑的型号，新的型号是调用者传进来的
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * 普通方法，用来获取电脑型号
	 * 
	 * @return
	 */
	public String getModel() {
		return this.model;
	}
}
