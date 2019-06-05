package ch033;

/**
 * 演示组合
 * 
 * @author 程序猿大头 主机类
 */
public class HostComputer {
	private Cpu cpu;
	private Memory memory;
	private GraphicsCard graphicsCard;
	private HardDisk hardDisk;

	public HostComputer() {
	}

	public HostComputer(Cpu cpu, Memory memory, GraphicsCard graphicsCard, HardDisk hardDisk) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.graphicsCard = graphicsCard;
		this.hardDisk = hardDisk;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}

}
