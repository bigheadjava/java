package ch050;

/**
 * 演示实现Runnable接口
 * 
 * @author 程序猿大头
 *
 */
public class Sample4 implements Runnable {
	private int a = 1;

	@Override
	public void run() {
		while (a <= 50) {
			System.out.println(Thread.currentThread().getName() + " : a = " + a);
			a++;
		}
	}
	
	public static void main(String[] args) {
		Sample4 s = new Sample4();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		t1.start();
		t2.start();
	}

}
