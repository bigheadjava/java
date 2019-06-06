package ch038.sample;

/**
 * 演示克隆的实现
 * @author 程序猿大头
 * 
 * 班级类
 */
public class Classes {
	private String className;
	private int classNo;

	public Classes() {

	}

	public Classes(String className, int classNo) {
		this.className = className;
		this.classNo = classNo;
	}
	
	/**
	 * 覆盖父类toString方法，输出Class对象的详细信息
	 */
	@Override
	public String toString() {
		String s = "Class信息 => Class Name: " + className + "; Class No.: " + classNo;
		return s;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
}
