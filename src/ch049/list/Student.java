package ch049.list;

/**
 * 演示List排序: 学生分数降序，利用Comparator接口实现
 * 
 * @author 程序猿大头
 *
 */
public class Student {
	private String name;

	private int score;

	public Student() {
		super();
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Name: " + name + "; Score: " + score;
	}
}
