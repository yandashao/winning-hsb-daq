package cn.com.winning.hsb.mapper;

import cn.com.winning.hsb.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 39627 on 2019/5/13.
 */
@Mapper
public interface UserMapper {

    public List<User> queryUserList();
}
