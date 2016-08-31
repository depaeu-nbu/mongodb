package com.junglone.common.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Description: 日志打印基类
 * Created by JungLone on 2016/07/28 13:36.
 */
@SuppressWarnings("rawtypes")
public class LogDefault extends Logger {

    static {
        InputStream inputStream = null;
        try {
            Properties properties = new Properties();
            inputStream = LogDefault.class.getResourceAsStream("/property/log4j.properties");
            properties.load(inputStream);
            PropertyConfigurator.configure(properties);
            properties.clear();
        }
        catch (Exception exception) {
            if (null != exception.getMessage()) {
                System.err.println(exception.getMessage());
            }
            else {
                exception.printStackTrace();
            }
        }
        finally {
            try {
                if (null != inputStream) {
                    inputStream.close();
                }
            }
            catch (IOException e) {
                if (null != e.getMessage()) {
                    System.err.println("==== Invoke " + LogDefault.class.getName() + ".static{} happened Exception ==== " + e.getMessage());
                }
                else {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Logger getLogger(String strLoggerName) {
        return new LogDefault(strLoggerName);
    }

	public static Logger getLogger(Class classLoggerName) {
        return getLogger(classLoggerName.getName());
    }


    public void debug(Object obj) {
        log.debug(obj);
        performException(obj);
    }

    public void info(Object obj) {
        log.info(obj);
        performException(obj);
    }

    public void warn(Object obj) {
        log.warn(obj);
        performException(obj);
    }

    public void error(Object obj) {
        log.error(obj);
        performException(obj);
    }

    public void fatal(Object obj) {
        log.fatal(obj);
        performException(obj);
    }


    private LogDefault(String s) {
        super(s);
        log = Logger.getLogger(s);
    }

    private Logger log = null;

    private void performException(Object obj) {
        if (!(obj instanceof Exception)) {
            return;
        }
        Exception exception = (Exception) obj;
        String strExceptionMsg = exception.getMessage();
        if (null != strExceptionMsg) {
            System.err.println("==== Invoke " + LogDefault.class.getName() + ".performException() happened Exception ==== " + strExceptionMsg);
        }
        else {
            exception.printStackTrace();
        }
    }

}