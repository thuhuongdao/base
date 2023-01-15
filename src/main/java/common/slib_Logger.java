package common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class slib_Logger {
    public static Logger root(){
        Logger logger = LoggerFactory.getLogger("ZOMBIE");
        return logger;
    }
    public static Logger bem(){
        Logger logger = LoggerFactory.getLogger("BEM");
        return logger;
    }
}
