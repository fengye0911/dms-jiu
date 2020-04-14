package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Education;
import cn.itsource.crm.mapper.EducationMapper;
import cn.itsource.crm.service.IEducationService;
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
public class EducationServiceImpl extends BaseServiceImpl<Education> implements IEducationService {

    @Autowired
    private EducationMapper educationMapper;

    @Override
    protected BaseMapper<Education> getMapper() {
        return this.educationMapper;
    }
}
