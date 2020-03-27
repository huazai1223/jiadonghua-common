package com.jdh.common.utils;

import java.util.Date;

import com.jdh.common.utils.RandomUtil;
import com.jdh.common.utils.StringUtil;

public class Person {
	
	private String name;
	private int age;
	private String about;
	private Date created;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Person(String name, int age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [姓名=" + name + ", 年龄=" + age + ", 介绍=" + about + ", 注册时间=" + created + "]";
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10001; i++) {
			Person s = new Person();
			s.setName(StringUtil.generateChineseName());
			s.setAge(RandomUtil.random(1, 120));
			s.setAbout(StringUtil.randomChineseString(140));
			s.setCreated(new Date());//
			System.out.println("第"+i+"位人的信息是:"+s);
		}
	}
	
	

}
