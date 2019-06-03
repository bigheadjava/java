package ch008;

/**
 * 演示JavaDoc注释
 * 
 * @author 程序猿大头
 *
 */
public class Student {
	/**
	 * 该属性表示学生的名字
	 */
	private String name;
	/**
	 * 该属性表示学生的年龄
	 */
	private int age;
	/**
	 * 该属性表示学生的学号
	 */
	private String id;
	/**
	 * 该属性表示学生的性别
	 */
	private String sex;

	/**
	 * 该方法表示学生学习
	 */
	public void study() {
		System.out.println("Student learn...");
	}

	/**
	 * 该方法表示学生玩耍
	 */
	public void play() {

		if ("M".equals(this.sex)) {
			/**
			 * 如果是女生，一般喜欢逛街
			 */
			System.out.println("女生爱逛街...");
		} else {
			/**
			 * 如果是男生，一般喜欢打游戏
			 */
			System.out.println("男生爱打游戏...");
		}

	}
}
