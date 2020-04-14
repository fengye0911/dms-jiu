package cn.itsource.crm.service;

import cn.itsource.crm.domain.DestroyDoc;
import cn.itsource.crm.query.DestroyDocQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

public interface IDestroyDocService extends IBaseService<DestroyDoc> {
    void updateById(DestroyDoc destroyDoc);

    void removeById(Long id);

    PageList<DestroyDoc> page(DestroyDocQuery destroyDocQuery);
}
