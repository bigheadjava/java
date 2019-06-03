package ch007;

/**
 * 演示Java的三种注释
 * 
 * @author 程序猿大头
 *
 */
public class Student {

	private String name; // 学生的名字
	private int age; // 学生的年龄
	private String id; // 学生的学号

	/*
	 * This is the method for student study
	 */
	public void study() {
		System.out.println("Student learn...");
	}

	/**
	 * This is the method for student play
	 */
	public void play() {
		System.out.println("Student play...");
	}
}
