package ch047.air_con;

/**
 * 演示回调
 * 
 * @author 程序猿大头
 *
 *         新一代空调类
 */
public class NewAirCon extends BaseAirCon {

	/**
	 * 调节湿度
	 */
	private void adjustHumidness() {
		System.out.println("调节湿度...");
	}

	/**
	 * 
	 * 成员内部类
	 *
	 */
	private class InnerHumidifier implements Humidifier {

		@Override
		public void adjust() {
			adjustHumidness();
		}

	}

	public InnerHumidifier getCallBack() {
		return new InnerHumidifier();
	}

}
