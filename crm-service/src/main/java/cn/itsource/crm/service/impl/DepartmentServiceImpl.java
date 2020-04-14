package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.domain.Department;
import cn.itsource.crm.mapper.BorrowMapper;
import cn.itsource.crm.mapper.DepartmentMapper;
import cn.itsource.crm.service.IBorrowService;
import cn.itsource.crm.service.IDepartmentService;
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
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    protected BaseMapper<Department> getMapper() {
        return this.departmentMapper;
    }
}
