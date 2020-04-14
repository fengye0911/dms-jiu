package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

/**
 * @Description desc
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> findAll();

    long count(EmployeeQuery employeeQuery);

    List<Employee> selectByQuery(EmployeeQuery employeeQuery);


    void removeById(Long id);

    void updateById(Employee employee);
    void insert(Employee employee);
}
