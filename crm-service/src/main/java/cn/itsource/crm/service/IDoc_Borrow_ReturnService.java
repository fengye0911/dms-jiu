package cn.itsource.crm.service;

import cn.itsource.crm.domain.Doc_Borrow_Return;
import cn.itsource.service.IBaseService;

import java.util.List;

public interface IDoc_Borrow_ReturnService extends IBaseService<Doc_Borrow_Return> {

    List<Long> selectIdByDocid(String ids);

    void updateMid(List<Doc_Borrow_Return> list);

    List<Long> selectDocId(Long borrowId);
}
