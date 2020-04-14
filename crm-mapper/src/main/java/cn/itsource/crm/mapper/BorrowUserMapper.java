package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.BorrowUser;
import cn.itsource.mapper.BaseMapper;

public interface BorrowUserMapper extends BaseMapper<BorrowUser> {

    BorrowUser selectByName(String userName);

}
