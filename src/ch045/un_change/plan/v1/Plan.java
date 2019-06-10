package ch045.un_change.plan.v1;

import java.util.Date;

/**
 * 演示可变类的弊端
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
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

}
