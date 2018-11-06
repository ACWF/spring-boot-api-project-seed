package com.company.project.service.impl;

import com.company.project.dao.LogEntryMapper;
import com.company.project.model.LogEntry;
import com.company.project.service.LogEntryService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/06.
 */
@Service
@Transactional
public class LogEntryServiceImpl extends AbstractService<LogEntry> implements LogEntryService {
    @Resource
    private LogEntryMapper logEntryMapper;

}
