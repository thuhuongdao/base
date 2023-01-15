import common.slib_Properties;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Config {

    public final static String REMOTE_CONNECT_TIMEOUT = "config.server.remoteConnectTimeout";
    public final static String REMOTE_TIMEOUT = "config.server.remoteTimeout";
    public final static String REMOTE_TIMEOUT_SHORT = "config.server.remoteTimeoutShort";

    /**
     * Internal variable to hold the properties
     */
    private static slib_Properties mProps;
    public static String getConfigPath() {
        return ""; // it is the same folder of app
    }

    /**
     * This method loads properties from specify configuration file. It must be called before any getXXX() method is called.
     * @param aSource full path of configuration file
     * @throws Exception
     */
    public static void load(Object aSource) throws Exception {
        String filename = (String) aSource;
        mProps = new slib_Properties(filename);
    }

    public static int getInt(String aKey) {
        return mProps.getInt(aKey);
    }

    public static int getRemoteTimeout() {
        return getInt(REMOTE_TIMEOUT);
    }

    public static int getRemoteTimeoutShort() {
        return getInt(REMOTE_TIMEOUT_SHORT);
    }
    public static int getRemoteConnectTimeout() {
        return getInt(REMOTE_CONNECT_TIMEOUT);
    }
}
