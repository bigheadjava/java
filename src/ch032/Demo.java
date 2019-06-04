package ch032;

/**
 * 演示多态
 * @author 程序猿大头
 * 测试类
 */
public class Demo {

	public static void main(String[] args) {
		Feeder feeder = new Feeder();
		
		Animal dog = new Dog();
		Food bone = new Bone();
		feeder.feed(dog, bone);
		
		Animal cat = new Cat();
		Food fish = new Fish();
		feeder.feed(cat, fish);
	}

}
