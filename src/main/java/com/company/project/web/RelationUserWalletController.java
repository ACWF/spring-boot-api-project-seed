package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RelationUserWallet;
import com.company.project.service.RelationUserWalletService;
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
@RequestMapping("/relation/user/wallet")
public class RelationUserWalletController {
    @Resource
    private RelationUserWalletService relationUserWalletService;

    @PostMapping("/add")
    public Result add(RelationUserWallet relationUserWallet) {
        relationUserWalletService.save(relationUserWallet);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        relationUserWalletService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RelationUserWallet relationUserWallet) {
        relationUserWalletService.update(relationUserWallet);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RelationUserWallet relationUserWallet = relationUserWalletService.findById(id);
        return ResultGenerator.genSuccessResult(relationUserWallet);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RelationUserWallet> list = relationUserWalletService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
