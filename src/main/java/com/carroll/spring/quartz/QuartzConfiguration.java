package com.carroll.spring.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Properties;

/**
 * @author: carroll.he
 * @date 2020/5/19
 * Copyright @2020 Tima Networks Inc. All Rights Reserved. 
 */
@Configuration
public class QuartzConfiguration {
    @Autowired
    private QuartzConfig quartzConfig;

    @Bean
    public Scheduler scheduler() throws IOException, SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory(quartzProperties());
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();
        return scheduler;
    }

    @Bean
    public Properties quartzProperties() throws IOException {
        Properties prop = new Properties();
        prop.put("quartz.scheduler.instanceName", quartzConfig.getSchedulerInstanceName());
        prop.put("org.quartz.scheduler.instanceId", quartzConfig.getSchedulerInstanceId());
        prop.put("org.quartz.scheduler.skipUpdateCheck", quartzConfig.getSchedulerSkipUpdateCheck());
        prop.put("org.quartz.scheduler.jobFactory.class", quartzConfig.getSchedulerJobFactoryClass());
        prop.put("org.quartz.jobStore.class", quartzConfig.getJobStoreClass());
        prop.put("org.quartz.jobStore.driverDelegateClass", quartzConfig.getJobStoreDriverDelegateClass());
        prop.put("org.quartz.jobStore.dataSource", quartzConfig.getJobStoreDatasource());
        prop.put("org.quartz.jobStore.tablePrefix", quartzConfig.getJobStoreTablePrefix());
        prop.put("org.quartz.jobStore.isClustered", quartzConfig.getJobStoreIsClustered());
        prop.put("org.quartz.threadPool.class", quartzConfig.getThreadPoolClass());
        prop.put("org.quartz.threadPool.threadCount", quartzConfig.getThreadPoolThreadCount());
        if(quartzConfig.getDataSourceConnectionProviderClass()!=null){
            prop.put("org.quartz.dataSource.quartzDataSource.connectionProvider.class", quartzConfig.getDataSourceConnectionProviderClass());
        }
        prop.put("org.quartz.dataSource.quartzDataSource.driver", quartzConfig.getDataSourceDriver());
        prop.put("org.quartz.dataSource.quartzDataSource.URL", quartzConfig.getDataSourceUrl());
        prop.put("org.quartz.dataSource.quartzDataSource.user", quartzConfig.getDataSourceUser());
        prop.put("org.quartz.dataSource.quartzDataSource.password", quartzConfig.getDataSourcePassword());
        prop.put("org.quartz.dataSource.quartzDataSource.maxConnections", quartzConfig.getDataSourceMaxConnections());

        return prop;
    }
}
