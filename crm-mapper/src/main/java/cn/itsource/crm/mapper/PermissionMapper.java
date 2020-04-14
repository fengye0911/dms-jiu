package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.query.PermissionQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission> {

     Long count(PermissionQuery query);

     List<Permission> selectByQuery(PermissionQuery query);
}
