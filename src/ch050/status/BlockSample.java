package ch050.status;

import java.io.IOException;

/**
 * 演示线程因为发出IO请求而进入阻塞状态
 * 
 * @author 程序猿大头
 *
 */
public class BlockSample extends Thread {
	private static StringBuffer sb = new StringBuffer();
	private static int count;

	@Override
	public void run() {
		int a = 1;
		while (a <= 50) {
			System.out.println(currentThread().getName() + " : a = " + a);
			a++;
		}
	}

	public static void main(String[] args) throws IOException {
		BlockSample bs = new BlockSample();
		bs.start();
		int inputNum = System.in.read();
		bs.run();
	}

}
