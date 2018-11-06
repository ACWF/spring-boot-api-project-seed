package com.company.project.service.impl;

import com.company.project.dao.RelationTrainerCredentialMapper;
import com.company.project.model.RelationTrainerCredential;
import com.company.project.service.RelationTrainerCredentialService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class RelationTrainerCredentialServiceImpl extends AbstractService<RelationTrainerCredential> implements RelationTrainerCredentialService {
    @Resource
    private RelationTrainerCredentialMapper relationTrainerCredentialMapper;

}
