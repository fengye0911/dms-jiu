package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.mapper.BorrowMapper;
import cn.itsource.crm.query.BorrowQuery;
import cn.itsource.crm.service.ISearchService;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: hoony96
 * @Description: TODO
 * @Date: Create in 20:58 2019/12/8
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class SearchServiceImpl implements ISearchService {

    @Autowired
    private BorrowMapper borrowMapper;


    @Override
    public PageList<Borrow> searchAll(BorrowQuery borrowQuery) {
        List<Borrow> rows = borrowMapper.selectForSearch(borrowQuery);
        Long total = borrowMapper.selectSearchCount(borrowQuery);
        return new PageList<>(total,rows);
    }

    @Override
    public PageList<Borrow> searchForTime(BorrowQuery borrowQuery) {
        List<Borrow> rows = borrowMapper.selectForSearch(borrowQuery);
        Long total = borrowMapper.selectCount(borrowQuery);
        return new PageList<>(total,rows);
    }

    @Override
    public PageList<Borrow> selectForExpired(BorrowQuery borrowQuery) {
        List<Borrow> rows = borrowMapper.selectForExpired(borrowQuery);
        Long total = borrowMapper.selectForExpiredCount(borrowQuery);
        return new PageList<>(total,rows);
    }
}
