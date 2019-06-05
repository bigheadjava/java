package ch033;

/**
 * 演示组合
 * 
 * @author 程序猿大头 硬盘类
 */
public class HardDisk {

	private String brand;

	private String model;

	private int size;

	public HardDisk() {
	}

	public HardDisk(String brand, String model, int size) {
		super();
		this.brand = brand;
		this.model = model;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
