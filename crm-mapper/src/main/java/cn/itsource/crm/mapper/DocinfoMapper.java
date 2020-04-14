package cn.itsource.crm.mapper;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.domain.Docinfo;
import cn.itsource.crm.query.BorrowQuery;
import cn.itsource.crm.query.DocinfoQuery;
import cn.itsource.mapper.BaseMapper;

import java.util.List;

public interface DocinfoMapper extends BaseMapper<Docinfo> {
    /**
     * 查询事故档案
     * @return
     */
    List<Docinfo> list();

    /**
     * 查询丢失的档案
     * @return
     */
    List<Docinfo> missed();

    /**
     * 查询正常档案
     * @return
     */
    List<Docinfo> docs();

    long count(DocinfoQuery docinfoQuery);

    List<Docinfo> selectByQuery(DocinfoQuery docinfoQuery);

    List<Docinfo> selectAllByQuery(DocinfoQuery docinfoQuery);

    List<Docinfo> selectByDocsn(DocinfoQuery docinfoQuery);

    List<Docinfo> selectForExpired(DocinfoQuery docinfoQuery);

    List<Docinfo> selectForLucene();
}
