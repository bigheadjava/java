package ch029;

/**
 * 演示封装
 * 
 * @author 程序猿大头 
 * 
 * 电视机类
 */
public class Tv {
	private int volume; // 电视机的音量属性

	public Tv() {

	}

	public Tv(int volume) {
		this.volume = volume;
	}
	
	/**
	 * 提供给外界获得音量大小
	 * @return
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * 提供给外界调整音量大小
	 * @param volume
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
