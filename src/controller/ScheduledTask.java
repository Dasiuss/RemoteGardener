package controller;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduledTask {

    Calendar startTime;
    int minutRun;
    boolean isActive = true;
    Task task;

    public ScheduledTask(Calendar startTime, int duration, Task task, boolean isActive) {

        this.startTime = startTime;
        this.minutRun = duration;
        this.task = task;
        this.isActive = isActive;
    }
}
