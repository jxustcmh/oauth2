package mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author jxlgcmh
 * @date 2019-08-02 14:22
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
