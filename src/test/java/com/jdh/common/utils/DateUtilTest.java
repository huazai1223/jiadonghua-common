package com.jdh.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test//获取年龄
	public void testGetAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(1998, 11, 23);
		
		int ageByBirthday = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println("年龄是"+ageByBirthday);
	}

	@Test//获取月末
	public void testGetEndMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.set(1998, 8,1 );
		Date date = DateUtil.getEndMonth(c.getTime());
		System.out.println(sdf.format(date));
	}

	@Test//获取月初
	public void testGetInitMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.set(1998, 8,31);
		Date date = DateUtil.getInitMonth(c.getTime());
		System.out.println(sdf.format(date));
	}

	@Test//随机日期
	public void testRandomDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2000,9,1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		System.out.println(sdf.format(date));
	}

}
