package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Doc_Borrow_Return;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface Doc_Borrow_ReturnMapper extends BaseMapper<Doc_Borrow_Return> {

    void updateMid(List<Doc_Borrow_Return> list);

    Long selectDBRId(Long docId);

    List<Long> selectDocId(Long borrowId);
}
