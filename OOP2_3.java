// OOP2_3. Build a Singleton class called AppConfig with a private constructor, a static instance, and getInstance(). Give it one field, appName, settable only once via a method setAppName(). Create two references via getInstance(), set the name through one, and print it through the other — to prove they're the same object.
class AppConfig {

    private static AppConfig instance;

    String appName;

    private AppConfig() {
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public void setAppName(String name) {
        if (appName == null) {
            appName = name;
        }
    }
}

public class OOP2_3 {
    public static void main(String[] args) {

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setAppName("My Java App");

        System.out.println(config2.appName);

        System.out.println(config1 == config2);
    }
}