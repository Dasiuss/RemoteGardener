package model;

import java.util.Calendar;

public class ScheduledTask {

	public Calendar startTime;
	public int duration;
	public boolean isActive = false;
	public boolean isRunning = false;
	public Task task;

	public ScheduledTask(Calendar startTime, int duration, Task task, boolean isActive) {

		this.startTime = startTime;
		this.duration = duration;
		this.task = task;
		this.isActive = isActive;
	}

	public void start() {
		isRunning = true;
		task.on();
		try {
			Thread.sleep(task.duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		task.off();
		isRunning = false;
	}

}

