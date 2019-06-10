package ch042;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 演示反射
 * @author 程序猿大头
 *
 */
public class ReflexDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// 测试三种获得class对象的方式以及获得类的完整名字
		System.out.println("第一种方式获得Person类的类名：" + getClassObject1().getSimpleName());
		System.out.println("第二种方式获得Person类的类名：" + getClassObject2().getName());
		System.out.println("第三种方式获得Person类的类名：" + getClassObject3().getName());

		// 获得class对象
		Class c = getClassObject2();
		// 获得类的属性
		Field[] fields = c.getDeclaredFields();
		System.out.println("Person类的属性有：");
		for (Field f : fields) {
			System.out.println(f.getModifiers() + f.getName());
		}

		// 获得类的方法
		Method[] methods = c.getDeclaredMethods();
		System.out.println("Person类的方法有：");
		for (Method m : methods) {
			System.out.println(m.getModifiers() + m.getName());
		}
	}

	/**
	 * 有三种方式获得Class对象 1. 通过对象调用 getClass() 方法来获取,通常应用在：比如你传过来一个
	 * Object类型的对象，而我不知道你具体是什么类，用这种方法
	 * 
	 * @return
	 */
	public static Class getClassObject1() {
		Person p = new Person();
		Class c = p.getClass();
		return c;
	}

	/**
	 * 有三种方式获得Class对象 2. 直接通过类名.class
	 * 的方式得到,该方法最为安全可靠，程序性能更高，这说明任何一个类都有一个隐含的静态成员变量class
	 * 
	 * 
	 * @return
	 */
	public static Class getClassObject2() {
		return Person.class;
	}

	/**
	 * 有三种方式获得Class对象 3. 通过 Class 类的 forName() 静态方法来获取，用的最多，但可能抛出
	 * ClassNotFoundException 异常
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static Class getClassObject3() throws ClassNotFoundException {
		return Class.forName("core_java.reflex.Person");
	}
	
}
