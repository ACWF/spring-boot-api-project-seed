package com.company.project.service.impl;

import com.company.project.dao.InfoLessonMapper;
import com.company.project.model.InfoLesson;
import com.company.project.service.InfoLessonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class InfoLessonServiceImpl extends AbstractService<InfoLesson> implements InfoLessonService {
    @Resource
    private InfoLessonMapper infoLessonMapper;

}
