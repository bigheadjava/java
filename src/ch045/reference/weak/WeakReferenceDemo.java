package ch045.reference.weak;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * 演示弱引用
 * 
 * @author 程序猿大头
 *
 */
public class WeakReferenceDemo {

	public static void main(String[] args) {
		ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
		String str = new String("Java");
		WeakReference<String> weakReference = new WeakReference<>(str, referenceQueue);
		str = null; //
		System.gc(); // 通知JVM来进行垃圾回收，回收刚刚的new ReferenceQueue<>()，此时弱引用weakReference被加入队列referenceQueue
		
		System.out.println(weakReference.get()); // new ReferenceQueue<>()被回收，weakReference.get()返回null

		Reference<? extends String> reference = referenceQueue.poll();
		System.out.println(reference); // 返回队列中的WeakReference对象
	}

}
