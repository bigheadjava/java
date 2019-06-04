package ch018;

/**
 * 演示重写equals方法，两辆车是不是相同取决于发动机号和车架号是否相同
 * 
 * @author 程序猿大头
 *
 */
public class Vehicle {

	private String engineNo; // 发动机号
	private String vin; // 车架号

	/**
	 * 无参数构造方法
	 */
	public Vehicle() {

	}

	/**
	 * 有参数构造方法，可以给新创建的对象初始化发动机号和车架号
	 * 
	 * @param engineNo
	 * @param vin
	 */
	public Vehicle(String engineNo, String vin) {
		this.engineNo = engineNo;
		this.vin = vin;
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("E001", "V001");
		Vehicle v2 = new Vehicle("E001", "V001");
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
	}

	/**
	 * 重写hashCode()方法
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engineNo == null) ? 0 : engineNo.hashCode());
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
		return result;
	}

	/**
	 * 重写equals()方法
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 判断当前对象和obj是不是同一个对象
			return true;
		if (obj == null) // 判断obj是不是null
			return false;
		if (getClass() != obj.getClass()) // 判断当前对象和obj是不是同一个类的对象
			return false;
		Vehicle other = (Vehicle) obj; // 把obj强制转换成Vehicle对象
		if (engineNo == null) { // 判断属性engineNo是不是null
			if (other.engineNo != null) // 判断obj属性engineNo是不是null
				return false;
		} else if (!engineNo.equals(other.engineNo)) // 判断当前对象和obj的engineNo是不是相同
			return false;
		if (vin == null) { // 判断属性vin是不是null
			if (other.vin != null) // 判断obj的属性vin是不是null
				return false;
		} else if (!vin.equals(other.vin)) // 判断当前对象和obj的vin是不是相等
			return false;
		return true;
	}

}
