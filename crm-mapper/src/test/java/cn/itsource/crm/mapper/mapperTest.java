package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.DestroyDoc;
import cn.itsource.crm.mapper.DestroyDocMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-mapper.xml")
public class mapperTest {
    @Autowired
    private DestroyDocMapper destroyDocMapper;
    @Test
    public void test () throws Exception{
        DestroyDoc doc = new DestroyDoc();
        doc.setDocInfo_id(1L);
        doc.setUser_id(2L);
        destroyDocMapper.insert(doc);
    }

}
