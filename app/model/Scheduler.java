package model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Scheduler {

	List<ScheduledTask> scheduledTaskList = new ArrayList<>();

	Scheduler(){

		scheduleTask(Calendar.FRIDAY, 21, 28, 5000, 1);
		String s = null;
		try {
			s = new ObjectMapper().writeValueAsString(scheduledTaskList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("s = " + s);
	}

	private void scheduleTask(int weekDay, int hour, int minute, int duration, int pin) {//podaje w parametrze date, czas i pin
		Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.HOUR_OF_DAY, hour);         // podaj godzine
		startTime.set(Calendar.MINUTE, minute);        // podaj minute
		startTime.set(Calendar.DAY_OF_WEEK, weekDay);   // niedziela = 1, sobota = 7

		Task task = new Task(pin, duration);		//pin

		boolean isActive = true;		// flaga aktywności
		ScheduledTask scheduledTask = new ScheduledTask(startTime, duration, task, isActive);

		scheduledTaskList.add(scheduledTask);
	}
}
