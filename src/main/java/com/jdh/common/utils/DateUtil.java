package com.jdh.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: 贾董华
 * @date: 2020年3月27日 下午6:28:20
 */
public class DateUtil {
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 根据出生日期算年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date birthday) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		//获取系统年
		int s_year  = c.get(Calendar.YEAR);
		//获取系统月
		int s_month = c.get(Calendar.MONTH);
		//获取系统日
		int s_date = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);//出生日期初始化日历类
		//获取出生年
		int b_year = c.get(Calendar.YEAR);
		//获取出生月
		int b_month = c.get(Calendar.MONTH);
		//获取出生日
		int b_date = c.get(Calendar.DAY_OF_MONTH);
		
		//计算年龄
		int age = s_year-b_year;
		//如果系统月份小于出生月份  
		if (s_month<b_month) {
			age--; //年龄减少一岁
		}
		//如果月份相等  系统日小于 出生的日 
		if (s_month==b_month && s_date< b_date) {
			age--;
		}
		return age;
		
	}
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description:返回一个月的月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//初始化日历类
		Calendar calendar = Calendar.getInstance();
		//传入参数 初始化日历类
		calendar.setTime(date);
		
		calendar.add(Calendar.MONTH, 1);//让当前日期的月份+1
		
		Date initMonth = getInitMonth(calendar.getTime());//变成月初
		
		calendar.setTime(initMonth);//用initMonth 再次初始化日历类
		
		calendar.add(Calendar.SECOND, -1);//再减去1秒
		
		return calendar.getTime();
	}
	
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回传入日期的月初 如传入2015/2/26  返回2015/2/01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		//初始化日历类
		Calendar calendar = Calendar.getInstance();
		//传入参数 初始化日历类
		calendar.setTime(date);
		
		calendar.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
		calendar.set(Calendar.HOUR_OF_DAY, 0);//设置天的0个小时
		calendar.set(Calendar.MINUTE, 0);//设置天的0分钟
		calendar.set(Calendar.SECOND, 0);//设置天的0秒
		return calendar.getTime();	
	}
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生
	 * @param startDart
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDart,Date endDate) {
		long t1 = startDart.getTime();//开始时间
		long t2 = endDate.getTime();//结束时间
		if (t2<t1) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		long t = (long) ((Math.random()*(t2-t1))+t1);
		return new Date(t);
		
	}

}
