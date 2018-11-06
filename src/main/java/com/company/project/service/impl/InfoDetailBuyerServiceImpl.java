package com.company.project.service.impl;

import com.company.project.dao.InfoDetailBuyerMapper;
import com.company.project.model.InfoDetailBuyer;
import com.company.project.service.InfoDetailBuyerService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoDetailBuyerServiceImpl extends AbstractService<InfoDetailBuyer> implements InfoDetailBuyerService {
    @Resource
    private InfoDetailBuyerMapper infoDetailBuyerMapper;

}
