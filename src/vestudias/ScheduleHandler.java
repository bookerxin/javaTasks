
package vestudias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleHandler {

    private final ScheduledExecutorService scheduler;

    List<Runnable> tasksList = new ArrayList<>();
    private final Tasks.TimerTask timerTask;
    private final Tasks.UpdateCacheTask updateCacheTask;
    private final Tasks.DisplayCacheTask displayCacheTask;
    private final Tasks.ClearCacheTask clearCacheTask;

    public ScheduleHandler() {
        this.scheduler = Executors.newScheduledThreadPool(4);
        timerTask = new Tasks.TimerTask();
        updateCacheTask = new Tasks.UpdateCacheTask();
        displayCacheTask = new Tasks.DisplayCacheTask();
        clearCacheTask = new Tasks.ClearCacheTask();
        tasksList.addAll(Arrays.asList(timerTask, updateCacheTask, displayCacheTask, clearCacheTask));
    }

    public void startTasks() {
        tasksList.forEach(Runnable::run);
    }

    public void startTimerTask() {
        scheduler.scheduleAtFixedRate(new Tasks.TimerTask(), 1, 3, TimeUnit.SECONDS);
    }

    public void startTestTask() {
        scheduler.scheduleAtFixedRate(new Tasks.TestClass(), 1, 1, TimeUnit.SECONDS);
    }

    public void startCacheUpdateTask() {
        scheduler.scheduleAtFixedRate(new Tasks.UpdateCacheTask(), 1, 5, TimeUnit.SECONDS);
    }

    public void startClearCacheTask() {
        scheduler.scheduleAtFixedRate(new Tasks.ClearCacheTask(), 1, 20, TimeUnit.SECONDS);
    }

    public void startDisplayCacheTask() {
        scheduler.scheduleAtFixedRate(new Tasks.DisplayCacheTask(), 0, 5, TimeUnit.SECONDS);
    }
}
