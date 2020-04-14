package cn.itsource.crm.service;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.User;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.crm.query.UserQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

public interface IUserService extends IBaseService<User> {

    User getByUsername(String username);

    PageList<User> page(UserQuery query);
}
