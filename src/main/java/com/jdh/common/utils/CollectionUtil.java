package com.jdh.common.utils;

import java.util.Collection;

public class CollectionUtil {

	/**
	 * 
	 * @Title: isEmpty
	 * @Description: TODO
	 * @param collection
	 * @return 贾董华
	 * @return: boolean
	 */
	// 判断集合是否有值
	public static boolean isEmpty(Collection<?> collection) {

		return collection == null || collection.isEmpty();

	}
}
