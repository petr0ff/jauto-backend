package configuration;

/**
 * Created by German on 16.10.2016.
 */
public class Environment {
    static {
        setCurrentEnvironment();
        setEnvironment(getCurrentEnvironment());
    }

    private static void setCurrentEnvironment() {
        currentEnv = System.getProperty(Flags.ENVIRONMENT);
        if (currentEnv == null) {
            //Default Environment
            currentEnv = Environments.DEV;
        }
    }

    public static String getCurrentEnvironment() {
        return currentEnv;
    }

    public static void setEnvironment(String environment) {
        switch (environment) {
            case Environments.DEV:
                baseUrl = "http://jsonplaceholder.typicode.com";
                break;
            case Environments.QA:
                baseUrl = "http://jsonplaceholder.typicode.com";
                break;
            default:
                throw new Error("wrong environment " + environment);
        }
    }

    private static String currentEnv;
    public static String baseUrl;

    public class Flags {
        public static final String ENVIRONMENT = "env";
    }

    public class Environments {
        public static final String DEV = "dev";
        public static final String QA = "qa";
    }
}