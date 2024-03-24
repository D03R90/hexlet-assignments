package exercise;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage{

    private Map<String, String> data = new HashMap<>();
    InMemoryKV(Map<String, String> initial) {
        data.putAll(initial);
    }
    @Override
    public void set(String key, String value) {
        data.put(key,value);
    }

    @Override
    public void unset(String key) {
        data.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
