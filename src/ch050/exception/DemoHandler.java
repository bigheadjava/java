package ch050.exception;

/**
 * 演示处理线程未捕获的异常
 * 
 * @author 程序猿大头
 *
 */
public class DemoHandler implements Thread.UncaughtExceptionHandler {
	private String name;

	public DemoHandler(String name) {
		super();
		this.name = name;
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(name + ": 从" + t.getName() + "中捕获了一个异常...");
	}

}
