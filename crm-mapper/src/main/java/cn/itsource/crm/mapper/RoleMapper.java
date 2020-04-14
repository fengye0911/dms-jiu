package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Role;
import cn.itsource.crm.query.RoleQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

    Long count1(RoleQuery roleQuery);

    List<Role> selectByQuery(RoleQuery roleQuery);
}
