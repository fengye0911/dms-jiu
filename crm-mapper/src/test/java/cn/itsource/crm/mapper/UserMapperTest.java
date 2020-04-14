package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-mapper.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testselectAll ()throws Exception{
        /*错误：UserMapper.xml没有放在文件夹下，导致方法找不到*/
        userMapper.selectAll().forEach(u ->{System.out.println(u);} );
    }
    @Test
    public void testinsert ()throws Exception{
        User user = new User();
        user.setUsername("haha");
        user.setPassword("123");
        userMapper.insert(user);
    }

    @Test
    public void testdeleteById ()throws Exception{
        userMapper.deleteById(1L);
    }

}