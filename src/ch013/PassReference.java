package ch013;

import ch012.Computer;

/**
 * 演示“引用传递”
 * 
 * @author 程序猿大头
 *
 */
public class PassReference {

	public static void main(String[] args) {
		Computer c = new Computer("Apple", "Mac Pro 2018", true);
		System.out.println("调用changeObject方法前, c引用的对象的地址是: " + c);
		System.out.println("调用changeObject方法前, c引用的对象的型号是: " + c.getModel());
		changeObject(c);
		System.out.println("调用changeObject方法后, c引用的对象的地址是: " + c);
		System.out.println("调用changeObject方法前, c引用的对象的型号是: " + c.getModel());
	}

	/**
	 * 该方法用于改变传进去的Computer对象的地址和传进去的Computer对象的型号
	 * 
	 * @param pc
	 */
	public static void changeObject(Computer pc) {
		pc.setModel("Dell X 2019"); // 改变传进来的的Computer对象的型号
		pc = new Computer("Apple", "Mac Pro 2018", true); // 让引用pc指向一个新的Computer对象
	}

}
