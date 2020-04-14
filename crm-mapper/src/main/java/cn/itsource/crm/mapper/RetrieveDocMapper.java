package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.RetrieveDoc;
import cn.itsource.crm.query.RetrieveDocQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface RetrieveDocMapper extends BaseMapper<RetrieveDoc> {
    long count(RetrieveDocQuery retrieveDocQuery);

    List<RetrieveDoc> selectByQuery(RetrieveDocQuery retrieveDocQuery);
}
