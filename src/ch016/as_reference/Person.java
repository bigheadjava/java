package ch016.as_reference;

/**
 * 演示this作为对象的默认引用
 * 该类描述人
 * @author 程序猿大头
 *
 */
public class Person {
	/**
	 * 人的名字
	 */
	private String name;
	/**
	 * 人的年龄
	 */
	private int age;
	/**
	 * 人的性别
	 */
	private String sex;

	/**
	 * 人的身份证
	 */
	private IdCard idCard;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

}
