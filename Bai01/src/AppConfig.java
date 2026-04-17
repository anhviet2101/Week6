public class AppConfig {
    private static AppConfig instance;
    private String appName;
    private String version;
    private String logLevel;

    private AppConfig(){
        this.appName = "APP";
        this.version = "4.0";
        this.logLevel = "1.0";
        System.out.println("AppConfig is being constructed");
    }

    public static AppConfig getInstance(){
        if (instance == null){
            synchronized (AppConfig.class){
                if (instance == null){
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }
}
