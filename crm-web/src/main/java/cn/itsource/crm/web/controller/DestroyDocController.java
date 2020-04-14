package cn.itsource.crm.web.controller;

import cn.itsource.crm.domain.DestroyDoc;
import cn.itsource.crm.domain.Docinfo;
import cn.itsource.crm.query.DestroyDocQuery;
import cn.itsource.crm.service.IDestroyDocService;
import cn.itsource.crm.service.IDocinfoService;
import cn.itsource.util.AjaxResult;
import cn.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class DestroyDocController {
    @Autowired
    private IDestroyDocService destroyDocService;
    @Autowired
    private IDocinfoService docinfoService;
    @PostMapping("/destroyDoc/page")
    private PageList<DestroyDoc> list(@RequestBody DestroyDocQuery destroyDocQuery){
        return destroyDocService.page(destroyDocQuery);
    }
    //    @DeleteMapping("/destroyDoc/{id}")
//    public AjaxResult delete(@PathVariable("id") Long id){
//        try {
//            destroyDocService.removeById(id);
//            return AjaxResult.me().setMsg("删除成功！");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return AjaxResult.me().setSuccess(false).setMsg("删除失败！");
//    }
    @PostMapping("/destroyDoc")
    @Transactional
    public AjaxResult save(@RequestBody DestroyDoc destroyDoc){
        try {
            if (destroyDoc.getId()!=null){
                destroyDocService.updateById(destroyDoc);
            }else {
                destroyDoc.setDestroyDate(new Date());
                destroyDocService.insert(destroyDoc);
                Docinfo docinfo = docinfoService.selectById(destroyDoc.getDocInfo_id());
                docinfo.setStatus(-2);
                docinfoService.update(docinfo);
            }
            return AjaxResult.me().setMsg("保存成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        return AjaxResult.me().setSuccess(false).setMsg("保存失败！");
    }
}
