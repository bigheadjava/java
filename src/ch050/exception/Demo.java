package ch050.exception;

/**
 * 演示处理线程未捕获的异常
 * 
 * @author 程序猿大头
 *
 */
public class Demo extends Thread {

	public Demo(ThreadGroup group, String name) {
		super(group, name);
	}
	
	public void run() {
		int a = 2/ 0;
	}

	public static void main(String[] args) {
		ThreadGroup  group = new DemoGroup("demoGroup");
		//设置Demo类的默认异常处理器
		UncaughtExceptionHandler defaultHandler = new DemoHandler("defaultHandler");
		Demo.setDefaultUncaughtExceptionHandler(defaultHandler);
		
		Demo d1 = new Demo(group, "demo1");
		Demo d2 = new Demo(group, "demo2");
		//设置d2的当前异常处理器
		UncaughtExceptionHandler currentHandler = new DemoHandler("Demo2's Handler");
		d2.setUncaughtExceptionHandler(currentHandler);
		
		d1.start();
		d2.start();
	}

}
