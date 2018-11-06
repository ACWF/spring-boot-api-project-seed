package com.company.project.service.impl;

import com.company.project.dao.InfoShopMapper;
import com.company.project.model.InfoShop;
import com.company.project.service.InfoShopService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoShopServiceImpl extends AbstractService<InfoShop> implements InfoShopService {
    @Resource
    private InfoShopMapper infoShopMapper;

}
