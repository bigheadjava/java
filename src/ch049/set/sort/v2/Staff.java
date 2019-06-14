package ch049.set.sort.v2;

/**
 * 演示定制化排序，实现Comparable接口
 * 
 * @author 程序猿大头
 * 
 *         员工类
 *
 */
public class Staff implements Comparable {
	private String name;
	private int workYear;

	public Staff() {

	}

	public Staff(String name, int workYear) {
		super();
		this.name = name;
		this.workYear = workYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkYear() {
		return workYear;
	}

	public void setWorkYear(int workYear) {
		this.workYear = workYear;
	};

	@Override
	public String toString() {
		return "员工: " + name + "; 工龄: " + workYear + "年。";
	}

	@Override
	public int compareTo(Object obj) {
		final Staff s = (Staff) obj;
		if (this.getWorkYear() > s.getWorkYear()) {
			return -1;
		} else if (this.getWorkYear() < s.getWorkYear()) {
			return 1;
		}
		return this.getName().compareTo(s.getName());
	}
}
