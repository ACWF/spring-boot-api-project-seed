package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RelationTrainerLesson;
import com.company.project.service.RelationTrainerLessonService;
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
@RequestMapping("/relation/trainer/lesson")
public class RelationTrainerLessonController {
    @Resource
    private RelationTrainerLessonService relationTrainerLessonService;

    @PostMapping("/add")
    public Result add(RelationTrainerLesson relationTrainerLesson) {
        relationTrainerLessonService.save(relationTrainerLesson);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        relationTrainerLessonService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RelationTrainerLesson relationTrainerLesson) {
        relationTrainerLessonService.update(relationTrainerLesson);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RelationTrainerLesson relationTrainerLesson = relationTrainerLessonService.findById(id);
        return ResultGenerator.genSuccessResult(relationTrainerLesson);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RelationTrainerLesson> list = relationTrainerLessonService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
