package ch012;

/**
 * 演示对ch012.Computer类中的方法的调用
 * 
 * @author 程序猿大头
 *
 */
public class ComputerDemo {

	public static void main(String[] args) {
		/**
		 * 对于类里面的静态方法我们可以直接利用类名.方法名的形式来调用
		 */
		Computer.compute();

		/**
		 * 创建一个Computer对象 调用的是有参数的构造方法 创建完成后，该对象属性值就是我们传进去的值，此时的参数是实参
		 */
		Computer c = new Computer("Apple", "Mac Pro 2018", true);

		/**
		 * 通过对象.方法名的形式调用普通方法来改变电脑c的型号，普通方法只能通过这种形式调用，此时的参数是实参
		 */
		c.setModel("Mac Pro 2019");

		/**
		 * 通过对象.方法名的形式调用Computer类的静态方法
		 */
		c.compute();
	}

}
