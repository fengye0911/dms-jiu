package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.mapper.EmployeeMapper;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.crm.service.IEmployeeService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description desc
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements IEmployeeService {


    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    protected BaseMapper<Employee> getMapper() {
        return employeeMapper;
    }

    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }

    @Override
    public PageList<Employee> page(EmployeeQuery employeeQuery) {
        long total = employeeMapper.count(employeeQuery);
        List<Employee> rows = employeeMapper.selectByQuery(employeeQuery);
        return new PageList<>(total,rows);
    }

    @Override
    public void removeById(Long id) {
        employeeMapper.removeById(id);
    }

    @Override
    public void updateById(Employee employee) {
        employeeMapper.updateById(employee);
    }

    @Override
    public void insert(Employee employee) {
        employeeMapper.insert(employee);
    }


}
