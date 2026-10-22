//OOP2_9. Make a Singleton Settings with a private constructor, getInstance(), and a field theme with setTheme and getTheme. In main, get s1 and s2 with getInstance(), call s1.setTheme("dark"), print s2.getTheme(), then print s1 == s2. As a comment, try new Settings() in main and write down the error.
class Settings{
    private Settings() {
    }
        private static Settings instance = new Settings();
        public static Settings getInstance(){
            return instance;
        }
        String theme;
        public void setTheme(String theme){
            this.theme = theme;
        }
        public String getTheme(){
            return theme;
        }
    }

public class OOP2_9 {
    public static void main(String[] args) {
        Settings s1 = Settings.getInstance();
        Settings s2 = Settings.getInstance();
s1.setTheme("dark");
        System.out.println(s2.getTheme());
        System.out.println(s1==s2);
        // Settings s3 = new Settings();
// Error: Settings() has private access in Settings
    }
}
