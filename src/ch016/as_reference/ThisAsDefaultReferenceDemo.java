package ch016.as_reference;

/**
 * 演示this作为对象的默认引用 
 * 测试类
 * 
 * @author 程序猿大头
 * 
 */
public class ThisAsDefaultReferenceDemo {

	public static void main(String[] args) {
		Person p = new Person();

		IdCard c1 = new IdCard();
		IdCard c2 = new IdCard("张三", "苏州", p);

		c1.setPerson(p);
		c2.setPerson(p);
	}

}
