import java.util.*;

public class Settings {
    private Map<String, String> settings;

    public Settings() {
        settings = new HashMap<String, String>();
    }

    public void set_setting(String key, String value) {
        settings.put(key, value);
    }

    public String get_setting(String key) {
        String res =  settings.get(key);
        return res;
    }
}
