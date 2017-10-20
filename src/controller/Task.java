package controller;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Task {

	public int pin;
	public long duration;

	public Task(int pin, long duration) {
		this.pin = pin;
		this.duration = duration;
	}

	void on() {
		System.out.println("Task.on; pin:" + pin);
	}

	void off() { System.out.println("Task.off; pin:" + pin); }


}
