package model;

import java.util.Calendar;

public class TaskExec {

	public static void main(String[] args) {
		new TaskExec (new Scheduler());
	}

	public TaskExec(Scheduler scheduler) {
		while (true) {
			Calendar now = Calendar.getInstance();

			for (ScheduledTask scheduledTask : scheduler.scheduledTaskList) {
				if (isProperTime(now, scheduledTask)) {
					if (!scheduledTask.isRunning) {
						scheduledTask.start();

					}
				}

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private boolean isProperTime(Calendar now, ScheduledTask scheduledTask) {
		return calendarMatch(now, scheduledTask, Calendar.DAY_OF_WEEK)
				&& (calendarMatch(now, scheduledTask, Calendar.HOUR_OF_DAY))
				&& (calendarMatch(now, scheduledTask, Calendar.MINUTE))
;
	}

	private boolean calendarMatch(Calendar now, ScheduledTask scheduledTask, int calendarField) {
		return scheduledTask.startTime.get(calendarField) == now.get(calendarField);
	}
}
