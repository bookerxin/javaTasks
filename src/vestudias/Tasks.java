
package vestudias;
import java.time.LocalTime;

public class Tasks implements Runnable {

    @Override
    public void run() {
        LocalTime currentTime = LocalTime.now();
        System.out.printf("This is running at: %s\n", currentTime);
    }
}
