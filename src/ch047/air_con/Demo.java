package ch047.air_con;

/**
 * 演示回调
 * 
 * @author 程序猿大头
 *
 *         客户类
 */
public class Demo {

	public static void main(String[] args) {
		NewAirCon ac = new NewAirCon();
		ac.adjust(); // 调节温度

		Humidifier h = ac.getCallBack();
		h.adjust(); // 调节湿度
	}

}
