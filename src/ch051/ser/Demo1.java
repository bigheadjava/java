package ch051.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

/**
 * 演示对象的序列化和反序列化
 * 
 * @author 程序猿大头
 *
 */
public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		OutputStream os = new FileOutputStream("/Users/resource/codes/java/src/ch051/files/out/person.obj");
		ObjectOutputStream out = new ObjectOutputStream(os);

		String obj1 = "Hello, Java...";
		Calendar c = Calendar.getInstance();
		Date obj2 = c.getTime();
		Person obj3 = new Person("张三", 28);

		// 序列化对象
		out.writeObject(obj1);
		out.writeObject(obj2);
		out.writeObject(obj3);
		out.close();

		// 反序列化对象
		InputStream is = new FileInputStream("/Users/resource/codes/java/src/ch051/files/out/person.obj");
		ObjectInputStream in = new ObjectInputStream(is);
		System.out.println("---------------------------");
		String obj11 = (String) in.readObject();
		System.out.println("obj11 : " + obj11);
		System.out.println("obj11 == obj1 : " + (obj11 == obj1));
		System.out.println("obj11.equals(obj1) : " + obj11.equals(obj1));
		System.out.println("---------------------------");
		Date obj22 = (Date) in.readObject();
		System.out.println("obj22 : " + obj22);
		System.out.println("obj22 == obj2 : " + (obj22 == obj2));
		System.out.println("obj22.equals(obj2) : " + obj22.equals(obj2));
		System.out.println("---------------------------");
		Person obj33 = (Person) in.readObject();
		System.out.println("obj33 : " + obj33);
		System.out.println("obj33 == obj3 : " + (obj33 == obj3));
		System.out.println("obj33.equals(obj3) : " + obj33.equals(obj3));
	}

}
