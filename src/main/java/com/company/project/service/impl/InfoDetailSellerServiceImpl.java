package com.company.project.service.impl;

import com.company.project.dao.InfoDetailSellerMapper;
import com.company.project.model.InfoDetailSeller;
import com.company.project.service.InfoDetailSellerService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoDetailSellerServiceImpl extends AbstractService<InfoDetailSeller> implements InfoDetailSellerService {
    @Resource
    private InfoDetailSellerMapper infoDetailSellerMapper;

}
