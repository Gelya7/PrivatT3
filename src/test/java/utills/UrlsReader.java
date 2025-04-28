package utills;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UrlsReader {
    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream("src/test/resources/urls.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Не вдалося завантажити urls.properties", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
