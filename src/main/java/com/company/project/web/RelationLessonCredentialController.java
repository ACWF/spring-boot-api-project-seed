package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RelationLessonCredential;
import com.company.project.service.RelationLessonCredentialService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/11/06.
*/
@RestController
@RequestMapping("/relation/lesson/credential")
public class RelationLessonCredentialController {
    @Resource
    private RelationLessonCredentialService relationLessonCredentialService;

    @PostMapping("/add")
    public Result add(RelationLessonCredential relationLessonCredential) {
        relationLessonCredentialService.save(relationLessonCredential);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        relationLessonCredentialService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RelationLessonCredential relationLessonCredential) {
        relationLessonCredentialService.update(relationLessonCredential);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RelationLessonCredential relationLessonCredential = relationLessonCredentialService.findById(id);
        return ResultGenerator.genSuccessResult(relationLessonCredential);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RelationLessonCredential> list = relationLessonCredentialService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
