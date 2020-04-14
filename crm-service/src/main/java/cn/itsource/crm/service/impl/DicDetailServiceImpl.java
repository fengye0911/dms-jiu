package cn.itsource.crm.service.impl;

import cn.itsource.crm.domain.DicDetail;
import cn.itsource.crm.mapper.DicDetailMapper;
import cn.itsource.crm.service.IDicDetailService;
import cn.itsource.mapper.BaseMapper;
import cn.itsource.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: hoony96
 * @Description: TODO
 * @Date: Create in 15:09 2019/12/4
 * @Version : v1.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class DicDetailServiceImpl extends BaseServiceImpl<DicDetail> implements IDicDetailService {

    @Autowired
    private DicDetailMapper dicDetailMapper;

    @Override
    protected BaseMapper<DicDetail> getMapper() {
        return this.dicDetailMapper;
    }

    @Override
    public List<DicDetail> selectDeptById() {
        return dicDetailMapper.selectDeptById();
    }

    @Override
    public List<DicDetail> selectUnitById() {
        return dicDetailMapper.selectUnitById();
    }

    @Override
    public List<DicDetail> getFaults() {
        return dicDetailMapper.getFaults();
    }
}
