package cn.itsource.crm.service;

import cn.itsource.crm.domain.RetrieveDoc;
import cn.itsource.crm.query.RetrieveDocQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

public interface IRetrieveDocService extends IBaseService<RetrieveDoc> {
    PageList<RetrieveDoc> page(RetrieveDocQuery retrieveDocQuery);
}
