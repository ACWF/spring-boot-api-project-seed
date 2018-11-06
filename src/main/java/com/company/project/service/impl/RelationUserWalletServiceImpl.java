package com.company.project.service.impl;

import com.company.project.dao.RelationUserWalletMapper;
import com.company.project.model.RelationUserWallet;
import com.company.project.service.RelationUserWalletService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class RelationUserWalletServiceImpl extends AbstractService<RelationUserWallet> implements RelationUserWalletService {
    @Resource
    private RelationUserWalletMapper relationUserWalletMapper;

}
