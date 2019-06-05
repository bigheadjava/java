package ch033;

/**
 * 演示组合
 * 
 * @author 程序猿大头 测试类
 */
public class ComputerDemo {

	public static void main(String[] args) {
		Displayer displayer = new Displayer();
		Keyboard keyboard = new Keyboard();
		Mouse mouse = new Mouse();

		Cpu cpu = new Cpu("Intel", "86");
		GraphicsCard gc = new GraphicsCard("ASUS");
		HardDisk hardDisk = new HardDisk("ASUS", "A001", 1);
		Memory memory = new Memory();
		HostComputer hostComputer = new HostComputer(cpu, memory, gc, hardDisk);

		Computer pc = new Computer("Apple", displayer, hostComputer, keyboard, mouse);

		Displayer newDisplayer = new Displayer();

		pc.setDisplayer(newDisplayer); // 更换显示器

		HardDisk newHd = new HardDisk("ASUS", "A001", 2);
		pc.getHostComputer().setHardDisk(newHd); // 更换硬盘

	}

}
