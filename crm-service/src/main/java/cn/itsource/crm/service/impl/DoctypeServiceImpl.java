package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Doctype;
import cn.itsource.crm.mapper.DoctypeMapper;
import cn.itsource.crm.service.IDoctypeService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Liuqi
 * @Description: TODO
 * @Date: Create in 19:52 2019/12/5
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class DoctypeServiceImpl extends BaseServiceImpl<Doctype> implements IDoctypeService {

    @Autowired
    private DoctypeMapper doctypeMapper;

    @Override
    protected BaseMapper<Doctype> getMapper() {
        return doctypeMapper;
    }
}
