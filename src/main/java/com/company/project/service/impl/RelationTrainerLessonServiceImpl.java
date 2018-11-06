package com.company.project.service.impl;

import com.company.project.dao.RelationTrainerLessonMapper;
import com.company.project.model.RelationTrainerLesson;
import com.company.project.service.RelationTrainerLessonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class RelationTrainerLessonServiceImpl extends AbstractService<RelationTrainerLesson> implements RelationTrainerLessonService {
    @Resource
    private RelationTrainerLessonMapper relationTrainerLessonMapper;

}
