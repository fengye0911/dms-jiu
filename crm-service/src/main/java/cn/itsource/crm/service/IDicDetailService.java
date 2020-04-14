package cn.itsource.crm.service;

import cn.itsource.crm.domain.DicDetail;
import cn.itsource.service.IBaseService;

import java.util.List;

public interface IDicDetailService extends IBaseService<DicDetail>{
    List<DicDetail> selectDeptById();

    List<DicDetail> selectUnitById();

    List<DicDetail> getFaults();
}
