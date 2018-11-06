package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.InfoDetailSeller;
import com.company.project.service.InfoDetailSellerService;
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
@RequestMapping("/info/detail/seller")
public class InfoDetailSellerController {
    @Resource
    private InfoDetailSellerService infoDetailSellerService;

    @PostMapping("/add")
    public Result add(InfoDetailSeller infoDetailSeller) {
        infoDetailSellerService.save(infoDetailSeller);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        infoDetailSellerService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(InfoDetailSeller infoDetailSeller) {
        infoDetailSellerService.update(infoDetailSeller);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        InfoDetailSeller infoDetailSeller = infoDetailSellerService.findById(id);
        return ResultGenerator.genSuccessResult(infoDetailSeller);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<InfoDetailSeller> list = infoDetailSellerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
