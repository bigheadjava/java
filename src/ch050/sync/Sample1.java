package ch050.sync;

/**
 * 演示多个线程破坏原子操作
 * 
 * @author 程序猿大头
 *
 */
public class Sample1 extends Thread {

	private int a = 1;

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			a += i;
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a -= i;
			System.out.println(currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1();
		s1.setName("线程1");
		s2.setName("线程2");
		s1.start();
		s2.start();
	}

}
