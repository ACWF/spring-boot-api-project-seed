package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RelationTrainerCredential;
import com.company.project.service.RelationTrainerCredentialService;
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
@RequestMapping("/relation/trainer/credential")
public class RelationTrainerCredentialController {
    @Resource
    private RelationTrainerCredentialService relationTrainerCredentialService;

    @PostMapping("/add")
    public Result add(RelationTrainerCredential relationTrainerCredential) {
        relationTrainerCredentialService.save(relationTrainerCredential);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        relationTrainerCredentialService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RelationTrainerCredential relationTrainerCredential) {
        relationTrainerCredentialService.update(relationTrainerCredential);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RelationTrainerCredential relationTrainerCredential = relationTrainerCredentialService.findById(id);
        return ResultGenerator.genSuccessResult(relationTrainerCredential);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RelationTrainerCredential> list = relationTrainerCredentialService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
