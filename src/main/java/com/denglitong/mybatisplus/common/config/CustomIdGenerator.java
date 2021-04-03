package com.denglitong.mybatisplus.common.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 邓礼桐（denglitong.dlt@alibaba-inc.com）
 * @date 2021/4/3
 */
@Component
@Slf4j
public class CustomIdGenerator implements IdentifierGenerator {

	private final AtomicLong atomicLong = new AtomicLong(1);

	@Override
	public Number nextId(Object entity) {
		// 可以将当前传入的class全类名来作为bizkey，进行分布式id调用生成
		String bizKey = entity.getClass().getName();
		log.info("bizKey:{}", bizKey);
		MetaObject metaObject = SystemMetaObject.forObject(entity);
		String name = (String) metaObject.getValue("name");
		final long id = atomicLong.getAndIncrement();
		log.info("为{}生成主键值->:{}", name, id);
		return id;
	}

}
