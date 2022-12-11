
package vestudias;
import javax.xml.crypto.Data;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Tasks {

    static DataCache cache;

    public Tasks() {
        cache = new DataCache();
    }

    static final class TimerTask implements Runnable {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        @Override
        public void run() {
            String currentTime = LocalTime.now().format(dtf);
            System.out.printf("This is running at: %s\n", currentTime);
        }
    }

    static final class TestClass implements Runnable {
        @Override
        public void run() {
            System.out.println("Why won't you work!?");
            System.out.println(cache.cache);
        }
    }

    static final class UpdateCacheTask implements Runnable {
        int num = 0;
        Map<String, Integer> temp = new HashMap<>();
        @Override
        public void run() {
            cache.updateCache(String.format("%s", num), temp);
            System.out.println("Cache updated.");
            num++;
        }
    }

    static final class ClearCacheTask implements Runnable {
        @Override
        public void run() {
            cache.clearCache();
            System.out.println("Cache cleared.");
        }
    }

    static final class DisplayCacheTask implements Runnable {
        @Override
        public void run() {
            System.out.println(cache.cache);
        }
    }
}
