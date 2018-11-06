package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RelationBuyerLesson;
import com.company.project.service.RelationBuyerLessonService;
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
@RequestMapping("/relation/buyer/lesson")
public class RelationBuyerLessonController {
    @Resource
    private RelationBuyerLessonService relationBuyerLessonService;

    @PostMapping("/add")
    public Result add(RelationBuyerLesson relationBuyerLesson) {
        relationBuyerLessonService.save(relationBuyerLesson);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        relationBuyerLessonService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RelationBuyerLesson relationBuyerLesson) {
        relationBuyerLessonService.update(relationBuyerLesson);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RelationBuyerLesson relationBuyerLesson = relationBuyerLessonService.findById(id);
        return ResultGenerator.genSuccessResult(relationBuyerLesson);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RelationBuyerLesson> list = relationBuyerLessonService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
