package ch050.sync.product.v2;

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
		Producer p = new Producer(stack, "Producer01");
		Consumer c = new Consumer(stack, "Consumer01");
	}

}