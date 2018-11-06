package com.company.project.service.impl;

import com.company.project.dao.RelationBuyerTrainerLessonMapper;
import com.company.project.model.RelationBuyerTrainerLesson;
import com.company.project.service.RelationBuyerTrainerLessonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class RelationBuyerTrainerLessonServiceImpl extends AbstractService<RelationBuyerTrainerLesson> implements RelationBuyerTrainerLessonService {
    @Resource
    private RelationBuyerTrainerLessonMapper relationBuyerTrainerLessonMapper;

}
