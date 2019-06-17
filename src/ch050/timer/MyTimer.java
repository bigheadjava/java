package ch050.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 演示定时器Timer用法
 * 
 * @author 程序猿大头
 *
 */
public class MyTimer extends Thread {
	private int i = 10;

	@Override
	public void run() {
		Timer timer = new Timer("MyTimerTask");
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				if(i == 0) {
					timer.cancel(); //倒计时到0为止，任务结束
				}
				System.out.println(currentThread().getName() + "正在执行倒计时: " + i--);
			}

		};
		timer.schedule(task, 3000, 1000); //3000ms后开始执行任务，以后每间隔1000ms重复执行一次任务
	}
}
