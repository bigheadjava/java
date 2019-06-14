package ch049.set.sort;

/**
 * 演示定制化排序
 * 
 * @author 程序猿大头
 * 
 *         员工类
 *
 */
public class Staff {
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
}
