package cn.itsource.crm.service;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.query.BorrowQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

/**
 * @Description desc
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

public interface IBorrowService extends IBaseService<Borrow> {

    PageList<Borrow> page(BorrowQuery borrowQuery);

    void deleteByIds(String ids);

}
