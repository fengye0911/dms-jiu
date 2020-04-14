package cn.itsource.crm.service;


import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.domain.BorrowUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:application-service.xml")
public class BorrowServiceTest {

    @Autowired
    private IBorrowService borrowService;
    @Autowired
    private IBorrowUserService borrowUserService;
    @Autowired
    private IDoc_Borrow_ReturnService dbrService;


    @Test
    public void testBorrow() throws Exception{

        Borrow borrow = new Borrow();
        borrow.setUserName("BBBB");
        borrowService.insert(borrow);
    }

    @Test
    public void testBorrowUser() throws Exception{
        borrowUserService.insert(new BorrowUser());

    }

    @Test
    public void testDocIds() throws Exception{
        dbrService.selectDocId(20L).forEach(id-> System.out.println(id));
    }


}