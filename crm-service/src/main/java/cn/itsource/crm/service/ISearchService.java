package cn.itsource.crm.service;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.query.BorrowQuery;
import cn.itsource.util.PageList;

public interface ISearchService {
    PageList<Borrow> searchAll(BorrowQuery borrowQuery);

    PageList<Borrow> searchForTime(BorrowQuery borrowQuery);

    PageList<Borrow> selectForExpired(BorrowQuery borrowQuery);
}
