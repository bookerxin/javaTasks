package vestudias;

import java.util.HashMap;
import java.util.Map;

public class DataCache {

    Map<String, Object> cache;

    public void updateCache(String key, Map<String, Integer> value) {
        cache.put(key, value);
    }

    public void clearCache() {
        cache.clear();
    }

    public void cacheInfo() {
        System.out.println(cache);
    }

}
