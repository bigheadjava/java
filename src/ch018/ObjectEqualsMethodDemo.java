package ch018;

/**
 * 演示Object类中的equals()方法和==
 * @author 程序猿大头
 *
 */
public class ObjectEqualsMethodDemo {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		System.out.println("o1 == o2: " + (o1 == o2));
		System.out.println("o1.equlas(o2): " + o1.equals(o2));
		System.out.println("o1 == o3: " + (o1 == o3));
		System.out.println("o1.equlas(o3): " + o1.equals(o3));
	}

}
