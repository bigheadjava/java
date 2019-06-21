package ch051.input.piped;

import java.io.IOException;

/**
 * 演示管道流的用法
 * 
 * @author 程序猿大头
 *
 *         测试类
 */
public class Demo {

	public static void main(String[] args) throws IOException {
		Sender sender = new Sender();
		Receiver receiver = new Receiver(sender);
		sender.start();
		receiver.start();
	}

}
