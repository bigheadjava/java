package ch051.input.piped;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * 演示管道流的用法
 * 
 * @author 程序猿大头
 *
 *         向管道输出流写数据的线程
 */
public class Sender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getOut() {
		return out;
	}

	public void setOut(PipedOutputStream out) {
		this.out = out;
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 100; i++) {
				out.write(i);
				sleep(1000);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
