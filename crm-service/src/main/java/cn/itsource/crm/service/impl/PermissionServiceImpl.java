package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.mapper.PermissionMapper;
import cn.itsource.crm.query.PermissionQuery;
import cn.itsource.crm.service.IPermissionService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: BeLost_
 * @Description: TODO
 * @Date: Create in 3:36 2019/12/6
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class PermissionServiceImpl extends BaseServiceImpl<Permission> implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    protected BaseMapper<Permission> getMapper() {
        return permissionMapper;
    }

    @Override
    public PageList<Permission> page(PermissionQuery query) {
        Long total = permissionMapper.count(query);
        List<Permission> rows = permissionMapper.selectByQuery(query);
        return new PageList<>(total,rows);
    }
}