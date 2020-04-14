package cn.itsource.crm.web.controller;

import cn.itsource.crm.domain.Education;
import cn.itsource.crm.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Wcy
 */
@RestController
public class EducationController {

    @Autowired
    private IEducationService educationService;

    @PostMapping("/educations")
    public List<Education> list(){
       return educationService.selectAll();
    }

}
