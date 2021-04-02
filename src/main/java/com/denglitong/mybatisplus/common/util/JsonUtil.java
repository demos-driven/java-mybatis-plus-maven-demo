package com.denglitong.mybatisplus.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * @author 邓礼桐（denglitong.dlt@alibaba-inc.com）
 * @date 2021/4/2
 */
public class JsonUtil {

	private static final ObjectMapper MAPPER = new ObjectMapper();

	private JsonUtil() {
	}

	public static String generate(Object object) throws JsonProcessingException {
		return MAPPER.writeValueAsString(object);
	}

	public static <T> T parse(String content, Class<T> valueType) throws JsonProcessingException {
		return MAPPER.readValue(content, valueType);
	}
}
