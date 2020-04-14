package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.mapper.BorrowMapper;
import cn.itsource.crm.query.BorrowQuery;
import cn.itsource.crm.service.IBorrowService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: hoony96
 * @Description: TODO
 * @Date: Create in 9:35 2019/12/4
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class BorrowServiceImpl extends BaseServiceImpl<Borrow> implements IBorrowService {

    @Autowired
    private BorrowMapper borrowMapper;

    @Override
    protected BaseMapper<Borrow> getMapper() {
        return this.borrowMapper;
    }

    @Override
    public PageList<Borrow> page(BorrowQuery borrowQuery) {
        borrowQuery.setBid(borrowMapper.selectBid(borrowQuery.getSn()));
        List<Borrow> rows = borrowMapper.selectPage(borrowQuery);
        Long total = borrowMapper.selectCount(borrowQuery);
        return new PageList<>(total,rows);
    }

    @Override
    public void deleteByIds(String ids) {
        String[] strings = ids.split(",");
        for (String string : strings) {
            Long id = Long.valueOf(string);
            borrowMapper.deleteById(id);
        }
    }

}
