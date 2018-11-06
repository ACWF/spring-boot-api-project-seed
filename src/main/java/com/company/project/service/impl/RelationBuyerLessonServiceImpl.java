package com.company.project.service.impl;

import com.company.project.dao.RelationBuyerLessonMapper;
import com.company.project.model.RelationBuyerLesson;
import com.company.project.service.RelationBuyerLessonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class RelationBuyerLessonServiceImpl extends AbstractService<RelationBuyerLesson> implements RelationBuyerLessonService {
    @Resource
    private RelationBuyerLessonMapper relationBuyerLessonMapper;

}
