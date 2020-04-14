package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.DestroyDoc;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.mapper.DestroyDocMapper;
import cn.itsource.crm.query.DestroyDocQuery;
import cn.itsource.crm.service.IDestroyDocService;
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
public class DestroyDocServiceImpl extends BaseServiceImpl<DestroyDoc> implements IDestroyDocService {
    @Autowired
    private DestroyDocMapper destroyDocMapper;
    @Override
    protected BaseMapper<DestroyDoc> getMapper() {
        return destroyDocMapper;
    }

    @Override
    public void updateById(DestroyDoc destroyDoc) {
        destroyDocMapper.update(destroyDoc);
    }

    @Override
    public void removeById(Long id) {
        destroyDocMapper.deleteById(id);
    }

    @Override
    public PageList<DestroyDoc> page(DestroyDocQuery destroyDocQuery) {
        long total = destroyDocMapper.count(destroyDocQuery);
        List<DestroyDoc> rows = destroyDocMapper.selectByQuery(destroyDocQuery);
        return new PageList<>(total,rows);
    }
}
