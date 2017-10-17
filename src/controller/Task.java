package controller;

public class Task {

	private int pin;

	public Task(int pin) {
		this.pin = pin;
	}

	void on(){
		System.out.println("Task.on; pin:"+pin);
	}
	void off(){
		System.out.println("Task.off; pin:"+pin);
	}
}
