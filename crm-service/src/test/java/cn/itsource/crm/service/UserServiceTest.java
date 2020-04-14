package cn.itsource.crm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-service.xml")
public class UserServiceTest {

    @Autowired
    private IUserService userService;
    @Autowired
    private IDestroyDocService destroyDocService;
    @Test
    public void testselectAll ()throws Exception{
        userService.selectAll().forEach(sa->{
            System.out.println(sa);
        });
    }
    @Test
    public void test () throws Exception{
        destroyDocService.selectAll().forEach(destroyDoc -> System.out.println(destroyDoc));
    }

}