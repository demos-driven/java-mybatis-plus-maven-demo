package com.denglitong.mybatisplus.samples.quickstart.mapper;

import lombok.Data;

/**
 * @author 邓礼桐（denglitong.dlt@alibaba-inc.com）
 * @date 2021/4/1
 */
@Data
public class User {
	private Long id;
	private String name;
	private Integer age;
	private String email;
}
