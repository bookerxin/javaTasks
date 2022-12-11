
package vestudias;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleHandler {

    Tasks taskOne;
    ScheduledExecutorService scheduler;

    public ScheduleHandler() {
        taskOne = new Tasks();
        scheduler = Executors.newScheduledThreadPool(1);
    }

    public void startTaskOne() {
        scheduler.scheduleAtFixedRate(taskOne, 0, 3, TimeUnit.SECONDS);
    }

}
