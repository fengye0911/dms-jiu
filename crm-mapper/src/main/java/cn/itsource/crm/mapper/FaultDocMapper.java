package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.FaultDoc;
import cn.itsource.crm.query.FaultDocQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface FaultDocMapper extends BaseMapper<FaultDoc> {
    long count(FaultDocQuery faultDocQuery);

    List<FaultDoc> selectByQuery(FaultDocQuery faultDocQuery);
}
