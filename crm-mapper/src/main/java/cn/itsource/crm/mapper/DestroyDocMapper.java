package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.DestroyDoc;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.query.DestroyDocQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface DestroyDocMapper extends BaseMapper<DestroyDoc> {
    List<DestroyDoc> selectByQuery(DestroyDocQuery destroyDocQuery);

    long count(DestroyDocQuery destroyDocQuery);
}
