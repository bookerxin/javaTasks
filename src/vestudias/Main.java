
package vestudias;

import java.util.HashMap;
import java.util.Map;

public class Main {

//    ScheduleHandler scheduleHandler;

    public Main() {
    }

    public static void main(String[] args) {
        ScheduleHandler scheduleHandler = new ScheduleHandler();
        System.out.println("Application Starting...");

        scheduleHandler.startTimerTask();

        scheduleHandler.startTestTask();

        scheduleHandler.startCacheUpdateTask();
        scheduleHandler.startDisplayCacheTask();
        scheduleHandler.startClearCacheTask();

    }

}
