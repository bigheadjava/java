package ch050.sync.product.well;

/**
 * 模拟10个人打水，演示并发和同步
 * 
 * @author 程序猿大头
 *
 */
public class Demo {
	public static void main(String[] args) {
		Well well = new Well();
		for (int i = 1; i <= 10; i++) {
			Person p = new Person("A" + i, well);
		}
	}
}
