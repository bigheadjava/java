package ch050.sync;

/**
 * 演示释放锁
 * 
 * @author 程序猿大头
 *
 */
public class Sample5 extends Thread {

	private int a = 1;

	public synchronized void print() {
		System.out.println(currentThread().getName() + "进入同步方法...");
		System.out.println("a = " + a);
	}

	@Override
	public void run() {
		String s = null;
		
		synchronized (this) {
			System.out.println(currentThread().getName() + "进入同步代码块...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(s.length());

			a++;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Sample5 s = new Sample5();
		s.start();
		sleep(1000);
		s.print(); //主线程
	}

}
