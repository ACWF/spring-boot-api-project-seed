package com.company.project.service.impl;

import com.company.project.dao.InfoDetailTrainerMapper;
import com.company.project.model.InfoDetailTrainer;
import com.company.project.service.InfoDetailTrainerService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoDetailTrainerServiceImpl extends AbstractService<InfoDetailTrainer> implements InfoDetailTrainerService {
    @Resource
    private InfoDetailTrainerMapper infoDetailTrainerMapper;

}
