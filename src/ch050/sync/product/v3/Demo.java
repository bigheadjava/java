package ch050.sync.product.v3;

/**
 * 演示同步锁
 * 
 * @author 程序猿大头
 * 
 *         测试类
 */
public class Demo {

	public static void main(String[] args) {
		Stack stack = new Stack("Stack01");
		Producer p1 = new Producer(stack, "Producer01");
		Producer p2 = new Producer(stack, "Producer02");
		Consumer c = new Consumer(stack, "Consumer01");
	}

}
