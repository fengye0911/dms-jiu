package cn.itsource.crm.service;

import cn.itsource.crm.domain.BorrowUser;
import cn.itsource.service.IBaseService;

/**
 * @Description desc
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

public interface IBorrowUserService extends IBaseService<BorrowUser> {

    BorrowUser selectByName(String userName);

}
