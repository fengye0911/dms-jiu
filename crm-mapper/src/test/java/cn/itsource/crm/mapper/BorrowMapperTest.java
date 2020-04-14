package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.domain.BorrowUser;
import cn.itsource.crm.query.BorrowQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:application-mapper.xml")
public class BorrowMapperTest {

    @Autowired
    private BorrowMapper borrowMapper;

    @Autowired
    private BorrowUserMapper borrowUserMapper;

    @Autowired
    private Doc_Borrow_ReturnMapper docBorrowReturnMapper;


    @Test
    public void testInsert() throws Exception{
        Borrow borrow = new Borrow();
        borrow.setUserName("AAAA");
        borrowMapper.insert(borrow);
    }

    @Test
    public void testUserInsert() throws Exception{
        borrowUserMapper.insert(new BorrowUser());
    }

    @Test
    public void testPage() throws Exception{
        BorrowQuery borrowQuery = new BorrowQuery();
        borrowQuery.setPageNum(1);
        borrowQuery.setPageSize(10);
        borrowMapper.selectPage(borrowQuery).forEach(bm-> System.out.println(bm));
    }

    @Test
    public void testSearch() throws Exception{
        borrowMapper.selectForSearch(new BorrowQuery()).forEach(e-> System.out.println(e));
    }


}