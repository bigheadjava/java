package ch051.input.piped;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * 演示管道流的用法
 * 
 * @author 程序猿大头
 *
 *         从管道输入流中读取数据的线程
 */
public class Receiver extends Thread {
	private PipedInputStream in;

	public Receiver(Sender sender) throws IOException {
		in = new PipedInputStream(sender.getOut());
	}

	@Override
	public void run() {
		try {
			int data = in.read();
			while (data != -1) {
				System.out.println(data);
				data = in.read();
			}
		} catch (IOException e) {
			new RuntimeException(e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
