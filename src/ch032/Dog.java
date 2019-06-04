package ch032;

/**
 * 演示多态
 * @author 程序猿大头
 * 狗类
 */
public class Dog extends Animal {
	@Override
	public void eat(Food food) {
		System.out.println("小狗吃骨头...");
	}
}
