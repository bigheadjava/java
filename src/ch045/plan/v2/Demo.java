package ch045.plan.v2;

import java.util.Calendar;
import java.util.Date;

import core_java.util.DateUtil;

/**
 * 演示可变类弊端解决方法
 * @author 程序猿大头
 *
 */
public class Demo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2019, 6,1);
		Date startDate = c.getTime();
		
		c.set(2019, 11,31);
		Date endDate = c.getTime();
		
		Plan p = new Plan(startDate, endDate); //Plan对象的两个属性都有值了，它们是不能修改的
		System.out.println("Start Date: " + p.getStartDate());
		System.out.println("End Date: " + p.getEndDate());
		
		//我们来修改Plan对象的开始时间和结束时间
		System.out.println("--------------修改Plan对象的开始时间和结束时间------------------");
		endDate.setTime(DateUtil.getCurrrentDate().getTime());
		startDate = p.getStartDate();
		startDate.setTime(DateUtil.getCurrrentDate().getTime());
		System.out.println("Start Date: " + p.getStartDate());
		System.out.println("End Date: " + p.getEndDate());
	}

}
