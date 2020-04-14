package cn.itsource.crm.service;

import cn.itsource.crm.domain.Role;
import cn.itsource.crm.query.RoleQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

public interface IRoleService extends IBaseService<Role> {
    PageList<Role> page(RoleQuery query);
}
