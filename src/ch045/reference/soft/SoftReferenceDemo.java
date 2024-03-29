package ch045.reference.soft;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * 演示软引用
 * 
 * @author 程序猿大头
 *
 */
public class SoftReferenceDemo {

	public static void main(String[] args) {
		ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
		String str = new String("Java");
		SoftReference<String> softReference = new SoftReference<>(str, referenceQueue);
		str = null; //
		System.gc(); // 通知JVM来进行垃圾回收，回收刚刚的String对象
		
		System.out.println(softReference.get()); // Java，假如String对象被回收，softReference.get()返回null

		Reference<? extends String> reference = referenceQueue.poll();
		System.out.println(reference); // null，String对象没有被回收
	}

}
