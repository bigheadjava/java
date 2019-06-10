package ch045.reference.soft;

import java.lang.ref.SoftReference;

/**
 * 演示软引用
 * 
 * @author 程序猿大头
 *
 */
public class SoftReferenceDemo {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		SoftReference<Class1> sr = new SoftReference<Class1>(c1);
		c1 = null;
		if (sr != null) {
			c1 = sr.get();
		} else {
			c1 = new Class1();
			sr = new SoftReference<Class1>(c1);
		}
	}

}
