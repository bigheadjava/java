package ch033;

/**
 * 演示组合
 * 
 * @author 程序猿大头 电脑类
 */
public class Computer {

	private String brand; // 品牌

	private Displayer displayer; // 显示器

	private HostComputer hostComputer; // 主机

	private Keyboard keyboard; // 键盘

	private Mouse mouse; // 鼠标

	public Computer() {

	}

	public Computer(String brand, Displayer displayer, HostComputer hostComputer, Keyboard keyboard, Mouse mouse) {
		super();
		this.brand = brand;
		this.displayer = displayer;
		this.hostComputer = hostComputer;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Displayer getDisplayer() {
		return displayer;
	}

	public void setDisplayer(Displayer displayer) {
		this.displayer = displayer;
	}

	public HostComputer getHostComputer() {
		return hostComputer;
	}

	public void setHostComputer(HostComputer hostComputer) {
		this.hostComputer = hostComputer;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

}
