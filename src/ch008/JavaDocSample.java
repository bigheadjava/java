/**
 * 演示JavaDoc标记的使用
 *
 */
package ch008;

/**
 * <p>
 * <strong>这是个班级类，用来标识一个学校的所有班级</strong>
 * </p>
 * 
 * @author 程序猿大头
 * @version 1.0
 * @since 1.0
 */
public class JavaDocSample {
	/**
	 * 代表班级的ID，唯一标识
	 */
	private int id;

	/**
	 * 代表班级名字
	 */
	private String name;

	/**
	 * 代表班级所在的年级
	 */
	private String grade;

	/**
	 * 构造方法，构造一个班级对象，该构造方法没有参数
	 */
	public JavaDocSample() {

	}

	/**
	 * 构造方法，构造一个班级对象，该构造方法有三个参数
	 * 
	 * @param id: 该参数代表班级的唯一ID
	 * @param name: 该参数代表班级的名字
	 * @param grade: 该参数代表班级所在的年级
	 */
	public JavaDocSample(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	/**
	 * 安排班级课程
	 * 
	 * @param courseName: 课程名字
	 * @deprecated 该方法已经被废弃
	 */
	public void arrangeCourse(String courseName) {
		System.out.println("安排" + id + "班级上" + courseName + "课");
	}

	/**
	 * 默认的班级建设活动
	 */
	public void classBuilding() {
		System.out.println("该班级建设活动是出去钓鱼...");
	}

	/**
	 * 给班级安排建设活动
	 * 
	 * @param activeName: 活动名字
	 *        <ul>
	 *        <li>如果{@link #id id成员变量}小于3，就调用{@link #classBuilding()
	 *        classBuilding()方法}</li>
	 *        <li>如果参数activeName为null或者空字符，就调用{@link #classBuilding()
	 *        classBuilding()方法}</li>
	 *        <li>如果{@link #id
	 *        id成员变量}大于或者等于3并且参数activeName不是null和空字符，安排班级活动为参数activeName值</li>
	 *        </ul>
	 */
	public void classBuilding(String activeName) {
		if (activeName == null || "".equals(activeName) || this.id < 3) {
			classBuilding();
		} else {
			System.out.println("该班级建设活动是" + activeName);
		}

	}

	/**
	 * 
	 * @throws Exception 如果班级id是0，则抛出异常
	 */
	public void pintClassInformation() throws Exception {
		if (id == 0) {
			throw new Exception("班级Id不能为0...");
		}
		System.out.println("班级Id: " + id);
		System.out.println("班级名字: " + name);
		System.out.println("班级所在的年级: " + grade);
	}

	/**
	 * 获得班级的唯一ID
	 * 
	 * @return 返回班级的唯一ID
	 * @see #setId
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置班级的唯一ID
	 * 
	 * @param id: 班级的唯一ID
	 * @see #getId
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 获得班级的名字
	 * 
	 * @return 返回班级的名字
	 * @see #setName
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置班级的名字
	 * 
	 * @param name: 班级的名字
	 * @see #getName
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获得班级所在的年级
	 * 
	 * @return 返回班级所在的年级
	 * @see #setGrade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * 设置班级所在的年级
	 * 
	 * @param grade: 班级所在的年级
	 * @see #getGrade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
