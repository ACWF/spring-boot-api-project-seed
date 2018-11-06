package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.InfoDetailTrainer;
import com.company.project.service.InfoDetailTrainerService;
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
@RequestMapping("/info/detail/trainer")
public class InfoDetailTrainerController {
    @Resource
    private InfoDetailTrainerService infoDetailTrainerService;

    @PostMapping("/add")
    public Result add(InfoDetailTrainer infoDetailTrainer) {
        infoDetailTrainerService.save(infoDetailTrainer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        infoDetailTrainerService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(InfoDetailTrainer infoDetailTrainer) {
        infoDetailTrainerService.update(infoDetailTrainer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        InfoDetailTrainer infoDetailTrainer = infoDetailTrainerService.findById(id);
        return ResultGenerator.genSuccessResult(infoDetailTrainer);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<InfoDetailTrainer> list = infoDetailTrainerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
