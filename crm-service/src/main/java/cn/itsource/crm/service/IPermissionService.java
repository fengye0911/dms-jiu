package cn.itsource.crm.service;

import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.query.PermissionQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

public interface IPermissionService extends IBaseService<Permission> {
    PageList<Permission> page(PermissionQuery query);
}
