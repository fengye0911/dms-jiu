package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.DicDetail;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface DicDetailMapper extends BaseMapper<DicDetail>{
    List<DicDetail> selectDeptById();

    List<DicDetail> selectUnitById();

    List<DicDetail> getFaults();
}
