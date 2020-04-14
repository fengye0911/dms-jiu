package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.DestroyDoc;
import cn.itsource.crm.domain.FaultDoc;
import cn.itsource.crm.domain.RetrieveDoc;
import cn.itsource.crm.mapper.DestroyDocMapper;
import cn.itsource.crm.mapper.RetrieveDocMapper;
import cn.itsource.crm.query.RetrieveDocQuery;
import cn.itsource.crm.service.IRetrieveDocService;
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
public class RetrieveDocServiceImpl extends BaseServiceImpl<RetrieveDoc> implements IRetrieveDocService {
    @Autowired
    private RetrieveDocMapper retrieveDocMapper;
    @Override
    protected BaseMapper<RetrieveDoc> getMapper() {
        return retrieveDocMapper;
    }

    @Override
    public PageList<RetrieveDoc> page(RetrieveDocQuery retrieveDocQuery) {
        long total = retrieveDocMapper.count(retrieveDocQuery);
        List<RetrieveDoc> rows = retrieveDocMapper.selectByQuery(retrieveDocQuery);
        return new PageList<>(total,rows);
    }
}
