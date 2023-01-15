import org.apache.log4j.xml.DOMConfigurator;

public class AbstractXerver {
    private final static String DEFAULT_CONFIG_FILE = Config.getConfigPath() + "config.xml";
    public static int REMOTE_TIMEOUT;
    public static int REMOTE_TIMEOUT_SHORT;
    public static int REMOTE_CONNECT_TIMEOUT;
    protected static void initConfig() throws Exception {
        // Log4j
        DOMConfigurator.configure("log4j.xml");

        // Config file
        Config.load(DEFAULT_CONFIG_FILE);
        REMOTE_CONNECT_TIMEOUT = Config.getRemoteConnectTimeout();
        REMOTE_TIMEOUT = Config.getRemoteTimeout();
        REMOTE_TIMEOUT_SHORT = Config.getRemoteTimeoutShort();



    }
}
