package cn.itsource.crm.service;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

import java.util.List;

/**
 * @Description desc
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

public interface IEmployeeService extends IBaseService<Employee> {

    List<Employee> findAll();

    PageList<Employee> page(EmployeeQuery employeeQuery);

    void removeById(Long id);

    void updateById(Employee employee);

    void insert(Employee employee);
}
