package cn.itsource.crm.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:application-mapper.xml")
public class DicDetailMapperTest {

    @Autowired
    private DicDetailMapper dicDetailMapper;

    @Test
    public void test() throws Exception{
        dicDetailMapper.selectAll().forEach(dicDetail -> System.out.println(dicDetail));
    }


}