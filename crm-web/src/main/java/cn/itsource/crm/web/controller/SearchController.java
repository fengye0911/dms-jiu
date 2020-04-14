package cn.itsource.crm.web.controller;

import cn.itsource.crm.domain.Borrow;
import cn.itsource.crm.query.BorrowQuery;
import cn.itsource.crm.service.ISearchService;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: hoony96
 * @Description: TODO
 * @Date: Create in 19:51 2019/12/8
 * @Version : v1.0
 */
@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private ISearchService searchService;

    /**
     * 前端分页  查询所有 借阅归还信息
     * @return
     */
    @PostMapping("/searchAll")
    public PageList<Borrow> searchAll(@RequestBody BorrowQuery borrowQuery){
        System.out.println(borrowQuery);
        return searchService.searchAll(borrowQuery);
    }

    /**
     * 借阅归还查询
     * @param borrowQuery
     * @return
     */
    @PostMapping("/searchForTime")
    public PageList<Borrow> searchForTime(@RequestBody BorrowQuery borrowQuery){
        return searchService.searchForTime(borrowQuery);

    }


    @PostMapping("/selectForExpired")
    public PageList<Borrow> selectForExpired(@RequestBody BorrowQuery borrowQuery){
        System.out.println(borrowQuery);
        return searchService.selectForExpired(borrowQuery);
    }
}