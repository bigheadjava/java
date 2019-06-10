package ch046;

/**
 * 演示枚举，自定义WeekDayV2属性和方法
 * 
 * @author 程序猿大头 
 * 定义星期一到星期日的枚举
 */
public enum WeekDayV2 {
	MON("星期一"), TUE("星期二"), WED("星期三"), THU("星期四"), FRI("星期五"), SAT("星期六"), SUN("星期天");
	
	private String value;
	
	private WeekDayV2(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
