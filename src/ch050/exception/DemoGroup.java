package ch050.exception;

/**
 * 演示处理线程未捕获的异常
 * 
 * @author 程序猿大头
 *
 */
public class DemoGroup extends ThreadGroup {

	public DemoGroup(String name) {
		super(name);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(getName() + ": 从" + t.getName() + "中捕获了一个异常...");
		super.uncaughtException(t, e);
	}

}
