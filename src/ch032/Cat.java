package ch032;

/**
 * 演示多态
 * @author 程序猿大头
 * 猫类
 */
public class Cat extends Animal {
	@Override
	public void eat(Food food) {
		System.out.println("小猫吃鱼...");
	}
}
