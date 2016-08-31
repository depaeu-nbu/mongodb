package com.junglone.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具
 */
public class DateTimeUtil {
    private static final String TIME_FORMAT_DAY = "yyyy-MM-dd";
    private static final String TIME_FORMAT_NORMAL = "yyyy-MM-dd HH:mm:ss";

    /**
     * Description: 取得yyyy-MM-dd HH:mm:ss格式的时间字符串
     *
     * @param date 指定的时间
     *
     * @return yyyy-MM-dd HH:mm:ss格式的时间字符串
     *
     * @author JungLone
     * @create Date: 2016/07/21 09:58
     */
    public static String getTimeNormalString(Date date) {
        return new SimpleDateFormat(TIME_FORMAT_NORMAL).format(date);
    }

    /**
     * Description: 取得yyyy-MM-dd HH:mm:ss格式的当前时间字符串
     *
     * @return yyyy-MM-dd HH:mm:ss格式的当前时间字符串
     *
     * @author JungLone
     * @create Date: 2016/07/21 09:58
     */
    public static String getNowTimeNormalString() {
        return getTimeNormalString(new Date());
    }

    /**
     * Description: 取得yyyy-MM-dd格式的日期字符串
     *
     * @param date 指定的时间
     *
     * @return yyyy-MM-dd格式的日期字符串
     *
     * @author JungLone
     * @create Date: 2016/07/21 09:58
     */
    public static String getTimeEndWithDay(Date date) {
        return new SimpleDateFormat(TIME_FORMAT_DAY).format(date);
    }


    /**
     * Description: 取得yyyy-MM-dd格式的日期字符串
     *
     * @return yyyy-MM-dd格式的当前日期字符串
     *
     * @author JungLone
     * @create Date: 2016/07/21 09:58
     */
    public static String getNowTimeEndWithDay() {
        return getTimeEndWithDay(new Date());
    }



    public static void main(String[] args) throws ParseException {
        System.out.println(getNowTimeNormalString());
    }

}
