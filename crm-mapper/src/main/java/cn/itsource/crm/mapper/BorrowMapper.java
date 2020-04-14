package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.query.BorrowQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface BorrowMapper extends BaseMapper<Borrow> {

    /**
     *  借阅查询的  sql语句
     * @param borrowQuery
     * @return
     */
    List<Borrow> selectPage(BorrowQuery borrowQuery);
    Long selectCount(BorrowQuery borrowQuery);

    /**
     * 借阅归还查询 的 sql语句
     * @param borrowQuery
     * @return
     */
    List<Borrow> selectForSearch(BorrowQuery borrowQuery);
    Long selectSearchCount(BorrowQuery borrowQuery);

    /**
     * 到期查询的  sql语句
     * @param borrowQuery
     * @return
     */
    List<Borrow> selectForExpired(BorrowQuery borrowQuery);
    Long selectForExpiredCount(BorrowQuery borrowQuery);

    /**
     * 根据sn查询 借阅id
     * @param sn
     * @return
     */
    Long selectBid(String sn);
}
