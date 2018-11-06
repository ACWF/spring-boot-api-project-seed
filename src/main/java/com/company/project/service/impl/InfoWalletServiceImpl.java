package com.company.project.service.impl;

import com.company.project.dao.InfoWalletMapper;
import com.company.project.model.InfoWallet;
import com.company.project.service.InfoWalletService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoWalletServiceImpl extends AbstractService<InfoWallet> implements InfoWalletService {
    @Resource
    private InfoWalletMapper infoWalletMapper;

}
