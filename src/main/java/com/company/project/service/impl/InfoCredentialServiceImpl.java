package com.company.project.service.impl;

import com.company.project.dao.InfoCredentialMapper;
import com.company.project.model.InfoCredential;
import com.company.project.service.InfoCredentialService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoCredentialServiceImpl extends AbstractService<InfoCredential> implements InfoCredentialService {
    @Resource
    private InfoCredentialMapper infoCredentialMapper;

}
