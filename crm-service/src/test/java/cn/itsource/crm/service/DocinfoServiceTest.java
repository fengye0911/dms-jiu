package cn.itsource.crm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-service.xml")
public class DocinfoServiceTest {

    @Autowired
    private IDocinfoService docinfoService;

    @Test
    public void test ()throws Exception{
        docinfoService.selectAll().forEach(s ->{
            System.out.println(s);
        });
    }

}