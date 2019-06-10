package ch042;

/**
 * 演示反射
 * @author 程序猿大头
 *
 */
public class ReflexCreateObject {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class c = Person.class;
		Person p = (Person) c.newInstance();
		System.out.println(p.age);

	}

}
