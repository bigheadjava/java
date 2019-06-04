package ch030;

/**
 * 演示方法覆盖
 * @author 程序猿大头
 * 子类，柴油类型的车
 */
public class DieselVehicle extends Vehicle {
	
	@Override
	protected void powerForEngine() {
		System.out.println("...柴油...");
	}
}
