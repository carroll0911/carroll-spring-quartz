package com.carroll.spring.quartz;

/**
 * @author: carroll.he
 * @date 2020/5/19
 * Copyright @2020 Tima Networks Inc. All Rights Reserved. 
 */
public interface ITaskService {
    Boolean resumeTask(TaskEntity taskEntity) throws QuartzException;
    Boolean pauseTask(TaskEntity taskEntity) throws QuartzException;
}
