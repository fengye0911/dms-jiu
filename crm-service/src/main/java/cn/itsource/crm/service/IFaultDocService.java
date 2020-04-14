package cn.itsource.crm.service;

import cn.itsource.crm.domain.FaultDoc;
import cn.itsource.crm.query.FaultDocQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

import java.util.List;

public interface IFaultDocService extends IBaseService<FaultDoc> {
    PageList<FaultDoc> page(FaultDocQuery faultDocQuery);

}
