package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.User;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.crm.query.UserQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    User getByUsername(String username);

    long count(UserQuery query);

    List<User> selectByQuery(UserQuery query);

    void updatePassword(User user);
}
