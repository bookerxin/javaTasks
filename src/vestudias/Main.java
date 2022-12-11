
package vestudias;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

public class Main {

    ScheduleHandler scheduleHandler;

    public Main() {
        scheduleHandler = new ScheduleHandler();
    }

    public static void main(String[] args) {
        Main scheduler = new Main();
        scheduler.scheduleHandler.startTaskOne();
    }

}
