package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.DestroyDoc;
import cn.itsource.crm.domain.FaultDoc;
import cn.itsource.crm.mapper.DestroyDocMapper;
import cn.itsource.crm.mapper.FaultDocMapper;
import cn.itsource.crm.query.FaultDocQuery;
import cn.itsource.crm.service.IFaultDocService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.IBaseService;
import cn.itsource.service.impl.BaseServiceImpl;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class FaultDocServiceImpl extends BaseServiceImpl<FaultDoc> implements IFaultDocService {
    @Autowired
    private FaultDocMapper faultDocMapper;
    @Override
    protected BaseMapper<FaultDoc> getMapper() {
        return faultDocMapper;
    }

    @Override
    public PageList<FaultDoc> page(FaultDocQuery faultDocQuery) {
        long total = faultDocMapper.count(faultDocQuery);
        List<FaultDoc> rows = faultDocMapper.selectByQuery(faultDocQuery);
        return new PageList<>(total,rows);
    }
}
