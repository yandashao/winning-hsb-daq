package cn.com.winning.hsb.mapper;

import cn.com.winning.hsb.WinningHsbDaqApplication;
import cn.com.winning.hsb.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 39627 on 2019/5/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WinningHsbDaqApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void queryUserList() throws Exception {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);

    }

}