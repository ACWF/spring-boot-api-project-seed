package com.company.project.service.impl;

import com.company.project.dao.InfoUserMapper;
import com.company.project.model.InfoUser;
import com.company.project.service.InfoUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoUserServiceImpl extends AbstractService<InfoUser> implements InfoUserService {
    @Resource
    private InfoUserMapper infoUserMapper;

}
