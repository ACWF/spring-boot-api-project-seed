package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.InfoDetailBuyer;
import com.company.project.service.InfoDetailBuyerService;
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
@RequestMapping("/info/detail/buyer")
public class InfoDetailBuyerController {
    @Resource
    private InfoDetailBuyerService infoDetailBuyerService;

    @PostMapping("/add")
    public Result add(InfoDetailBuyer infoDetailBuyer) {
        infoDetailBuyerService.save(infoDetailBuyer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        infoDetailBuyerService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(InfoDetailBuyer infoDetailBuyer) {
        infoDetailBuyerService.update(infoDetailBuyer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        InfoDetailBuyer infoDetailBuyer = infoDetailBuyerService.findById(id);
        return ResultGenerator.genSuccessResult(infoDetailBuyer);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<InfoDetailBuyer> list = infoDetailBuyerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
