import common.jedis.JedisCache;
import common.slib_Logger;
import org.slf4j.Logger;

public class Xerver extends AbstractXerver{
    public static Logger getLogger() {
        return slib_Logger.root();
    }


    public static void main(String[] args) throws Exception {
        initConfig();


    }
    public static JedisCache jedis;
}
