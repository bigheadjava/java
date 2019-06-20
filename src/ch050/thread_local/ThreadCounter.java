package ch050.thread_local;

/**
 * 演示ThreadLocal用法
 * 
 * @author 程序猿大头
 *
 */
public class ThreadCounter {
	private static int count;

	private static ThreadLocal<Integer> id = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return count++;
		}
	};
	
	public static int get() {
		return id.get();
	}
	
	public static void set(int i) {
		id.set(i);
	}
}
