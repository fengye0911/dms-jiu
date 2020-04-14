package cn.itsource.crm.web.controller;

import cn.itsource.crm.domain.Docinfo;
import cn.itsource.crm.query.DocinfoQuery;
import cn.itsource.crm.service.IDocinfoService;
import cn.itsource.util.AjaxResult;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: hoony96
 * @Description: TODO
 * @Date: Create in 21:21 2019/12/14
 * @Version : v1.0
 */
@RestController
@RequestMapping("/lucene")
public class LuceneController {

    @Autowired
    private IDocinfoService docinfoService;


    @GetMapping("/update")
    public AjaxResult update(){
        try {
            docinfoService.updateIndex();
            return AjaxResult.me().setMsg("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMsg("抱歉，更新失败，请重试");
        }
    }

    @PostMapping("/searchIndex")
    public PageList<Docinfo> search(@RequestBody DocinfoQuery docinfoQuery){
          return  docinfoService.searchIndex(docinfoQuery);

    }



}
