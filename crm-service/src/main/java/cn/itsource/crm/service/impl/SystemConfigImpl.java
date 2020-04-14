package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Department;
import cn.itsource.crm.domain.SystemConfig;
import cn.itsource.crm.mapper.DepartmentMapper;
import cn.itsource.crm.mapper.SystemConfigMapper;
import cn.itsource.crm.service.IDepartmentService;
import cn.itsource.crm.service.ISystemConfigService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: hoony96
 * @Description: TODO
 * @Date: Create in 9:35 2019/12/4
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class SystemConfigImpl extends BaseServiceImpl<SystemConfig> implements ISystemConfigService {

    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    protected BaseMapper<SystemConfig> getMapper() {
        return this.systemConfigMapper;
    }
}
