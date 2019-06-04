package ch032;

/**
 * 演示多态
 * @author 程序猿大头
 * 饲养员类
 */
public class Feeder {
	public void feed(Animal animal, Food food) {
		animal.eat(food);
	}
}
