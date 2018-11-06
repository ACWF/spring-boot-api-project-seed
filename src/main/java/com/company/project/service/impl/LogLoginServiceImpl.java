package com.company.project.service.impl;

import com.company.project.dao.LogLoginMapper;
import com.company.project.model.LogLogin;
import com.company.project.service.LogLoginService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class LogLoginServiceImpl extends AbstractService<LogLogin> implements LogLoginService {
    @Resource
    private LogLoginMapper logLoginMapper;

}
