package com.company.project.service.impl;

import com.company.project.dao.RelationLessonCredentialMapper;
import com.company.project.model.RelationLessonCredential;
import com.company.project.service.RelationLessonCredentialService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class RelationLessonCredentialServiceImpl extends AbstractService<RelationLessonCredential> implements RelationLessonCredentialService {
    @Resource
    private RelationLessonCredentialMapper relationLessonCredentialMapper;

}
