package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Return;
import cn.itsource.crm.mapper.ReturnMapper;
import cn.itsource.crm.service.IReturnService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: hoony96
 * @Description: TODO
 * @Date: Create in 21:20 2019/12/5
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class ReturnServiceImpl extends BaseServiceImpl<Return> implements IReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    protected BaseMapper<Return> getMapper() {
        return this.returnMapper;
    }
}
