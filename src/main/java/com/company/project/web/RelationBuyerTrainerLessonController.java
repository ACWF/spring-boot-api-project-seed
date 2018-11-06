package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RelationBuyerTrainerLesson;
import com.company.project.service.RelationBuyerTrainerLessonService;
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
@RequestMapping("/relation/buyer/trainer/lesson")
public class RelationBuyerTrainerLessonController {
    @Resource
    private RelationBuyerTrainerLessonService relationBuyerTrainerLessonService;

    @PostMapping("/add")
    public Result add(RelationBuyerTrainerLesson relationBuyerTrainerLesson) {
        relationBuyerTrainerLessonService.save(relationBuyerTrainerLesson);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        relationBuyerTrainerLessonService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RelationBuyerTrainerLesson relationBuyerTrainerLesson) {
        relationBuyerTrainerLessonService.update(relationBuyerTrainerLesson);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RelationBuyerTrainerLesson relationBuyerTrainerLesson = relationBuyerTrainerLessonService.findById(id);
        return ResultGenerator.genSuccessResult(relationBuyerTrainerLesson);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RelationBuyerTrainerLesson> list = relationBuyerTrainerLessonService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
