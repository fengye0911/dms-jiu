package cn.itsource.crm.service;

import cn.itsource.crm.domain.Docinfo;
import cn.itsource.crm.query.DocinfoQuery;
import cn.itsource.service.IBaseService;
import cn.itsource.util.PageList;

import java.util.List;

/**
 * @Description 档案信息Service
 * @author 刘琪
 */
public interface IDocinfoService extends IBaseService<Docinfo> {
    List<Docinfo> list();
    List<Docinfo> docs();
    List<Docinfo> missed();
    PageList<Docinfo> page(DocinfoQuery docinfoQuery);
    List<Docinfo> selectAllByQuery(DocinfoQuery docinfoQuery);

    PageList<Docinfo> selectByDocsn(DocinfoQuery docinfoQuery);
    PageList<Docinfo> selectForExpired(DocinfoQuery docinfoQuery);

    void updateIndex();

    PageList<Docinfo> searchIndex(DocinfoQuery docinfoQuery);
}
