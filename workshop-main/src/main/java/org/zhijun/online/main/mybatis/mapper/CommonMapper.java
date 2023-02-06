package org.zhijun.online.main.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author ZhiJun
 * @Date 2023/2/5 21:13
 * @Version 1.0
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
