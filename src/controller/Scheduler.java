package controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {

	List<ScheduledTask> scheduledTaskList = new ArrayList<>();

	public static void main(String[] args) {}

	Scheduler(){

		scheduleTask(5, 16, 1, 10, 1);

	}

	private void scheduleTask(int minute, int hour, int weekDay, int duration, int pin) {
		Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.HOUR, hour);         // podaj godzine
		startTime.set(Calendar.MINUTE, minute);        // podaj minute
		startTime.set(Calendar.DAY_OF_WEEK, weekDay);   // niedziela = 1, sobota = 7

		Task task = new Task(pin);

		boolean isActive = true;
		ScheduledTask scheduledTask = new ScheduledTask(startTime, duration, task, isActive);

		scheduledTaskList.add(scheduledTask);
	}
}
