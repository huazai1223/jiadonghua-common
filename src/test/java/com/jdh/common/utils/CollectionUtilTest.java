package com.jdh.common.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
		//判断是否为空,为空染回true  有值返回false
		List<Object> list = new  ArrayList<Object>();
		list.add(555);
		boolean b = CollectionUtil.isEmpty(list);
		System.out.println(b);
	}

}
