package ch041;

import java.util.HashMap;
import java.util.Map;

/**
 * 演示finalized方法特性
 * 
 * @author 程序猿大头
 *
 */
public class FinalizedMethodDemo {
	private static final Map<String, FinalizedMethodDemo> sMap = new HashMap<String, FinalizedMethodDemo>();
	private final String key;

	public String getKey() {
		return this.key;
	}

	public FinalizedMethodDemo(String key) {
		super();
		this.key = key;
	}

	public static FinalizedMethodDemo getInstance(String key) {
		FinalizedMethodDemo s = sMap.get(key);
		if (s == null) {
			s = new FinalizedMethodDemo(key);
			sMap.put(key, s);
		}
		return s;
	}

	public static void removeInstance(String key) {
		sMap.remove(key);
	}

	@Override
	protected void finalize() throws Throwable {
		sMap.put(key, this);
		System.out.println("执行finalized()方法...");
		throw new Exception("在finalized()方法中抛出异常...");
	}

	public static void main(String[] args) throws InterruptedException {
		FinalizedMethodDemo s = FinalizedMethodDemo.getInstance("java"); // 创建Sample对象
		System.out.println(s); // 输出变量s引用的对象的地址
		String key = s.getKey(); // 获得s引用的对象的属性key的值
		s = null; // 变量s被赋值null
		FinalizedMethodDemo.removeInstance(key); // 刚刚创建的对象被从HashMap对象中删除
		System.gc(); // 提高垃圾回收器尽快执行垃圾回收的可能性
		Thread.sleep(5000); // 让程序等待5秒
		s = FinalizedMethodDemo.getInstance("java"); // 变量s又引用Sample对象
		System.out.println(s); // 输出变量s引用的对象的地址
	}
}
