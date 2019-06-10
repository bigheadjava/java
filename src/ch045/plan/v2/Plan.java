package ch045.plan.v2;

import java.util.Date;

/**
 * 演示可变类弊端解决方法
 * @author 程序猿大头
 *
 */
public class Plan {
	private final Date startDate; // 计划开始时间
	private final Date endDate; // 计划结束时间

	public Plan(Date startDate, Date endDate) {
		if (startDate.compareTo(endDate) > 0) {
			throw new IllegalArgumentException("计划开始时间不能晚于结束计划结束时间...");
		}
		this.startDate = new Date(startDate.getTime());
		this.endDate = new Date(endDate.getTime());
	}

	public Date getStartDate() {
		return (Date) startDate.clone();
	}

	public Date getEndDate() {
		return (Date) endDate.clone();
	}

}
