package ch033;

/**
 * 演示组合
 * 
 * @author 程序猿大头 Cpu类
 */
public class Cpu {

	private String brand; // 品牌

	private String model; // 型号

	public Cpu() {
		// TODO Auto-generated constructor stub
	}

	public Cpu(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
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

}
