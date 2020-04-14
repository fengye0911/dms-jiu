package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.Docinfo;
import cn.itsource.crm.lucene.IDocinfoIndexHelper;
import cn.itsource.crm.mapper.DocinfoMapper;
import cn.itsource.crm.query.DocinfoQuery;
import cn.itsource.crm.service.IDocinfoService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: liuqi
 * @Description: TODO
 * @Date: Create in 9:35 2019/12/4
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class DocinfoServiceImpl extends BaseServiceImpl<Docinfo> implements IDocinfoService {

    @Autowired
    private DocinfoMapper docinfoMapper;

    @Autowired
    private IDocinfoIndexHelper docinfoIndexHelper;

    @Override
    protected BaseMapper<Docinfo> getMapper() {
        return this.docinfoMapper;
    }

    /**
     * 查询要被销毁的档案
     * @param
     * @return
     */
    @Override
    public List<Docinfo> list() {
        return docinfoMapper.list();
    }

    @Override
    public List<Docinfo> docs() {
        return docinfoMapper.docs();
    }

    @Override
    public List<Docinfo> missed() {
        return docinfoMapper.missed();
    }

    @Override
    public PageList<Docinfo> page(DocinfoQuery docinfoQuery) {
        long total = docinfoMapper.count(docinfoQuery);
        List<Docinfo> rows = docinfoMapper.selectByQuery(docinfoQuery);
        return new PageList<>(total,rows);
    }

    @Override
    public List<Docinfo> selectAllByQuery(DocinfoQuery docinfoQuery) {
        return docinfoMapper.selectAllByQuery(docinfoQuery);
    }

    @Override
    public PageList<Docinfo> selectByDocsn(DocinfoQuery docinfoQuery) {
        long total = docinfoMapper.count(docinfoQuery);
        List<Docinfo> rows = docinfoMapper.selectByDocsn(docinfoQuery);
        return new PageList<>(total,rows);
    }
    //过期管理
    @Override
    public PageList<Docinfo> selectForExpired(DocinfoQuery docinfoQuery) {
        long total = docinfoMapper.count(docinfoQuery);
        List<Docinfo> rows = docinfoMapper.selectForExpired(docinfoQuery);
        return new PageList<>(total,rows);
    }

    /**
     * lucene更新索引
     */
    @Override
    public void updateIndex() {
        List<Docinfo> docinfos = docinfoMapper.selectForLucene();
        docinfoIndexHelper.updateIndex(docinfos);
    }

    @Override
    public PageList<Docinfo> searchIndex(DocinfoQuery docinfoQuery) {
        return docinfoIndexHelper.searchIndex(docinfoQuery);
    }


}
