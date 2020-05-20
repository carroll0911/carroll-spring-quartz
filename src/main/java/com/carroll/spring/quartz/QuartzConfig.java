package com.carroll.spring.quartz;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: carroll.he
 * @date 2020/5/19
 * Copyright @2020 Tima Networks Inc. All Rights Reserved. 
 */
@Component
@ConfigurationProperties(prefix = "carroll.quartz")
public class QuartzConfig {
    private String schedulerInstanceName;
    private String schedulerInstanceId;
    private String schedulerSkipUpdateCheck;
    private String schedulerJobFactoryClass;
    private String jobStoreClass;
    private String jobStoreDriverDelegateClass;
    private String jobStoreDatasource;
    private String jobStoreTablePrefix;
    private String jobStoreIsClustered;
    private String threadPoolClass;
    private String threadPoolThreadCount;

    private String dataSourceDriver;
    private String dataSourceUrl;
    private String dataSourceUser;
    private String dataSourcePassword;
    private String dataSourceMaxConnections;
    private String dataSourceConnectionProviderClass;

    public String getSchedulerInstanceName() {
        return schedulerInstanceName;
    }

    public void setSchedulerInstanceName(String schedulerInstanceName) {
        this.schedulerInstanceName = schedulerInstanceName;
    }

    public String getSchedulerInstanceId() {
        return schedulerInstanceId;
    }

    public void setSchedulerInstanceId(String schedulerInstanceId) {
        this.schedulerInstanceId = schedulerInstanceId;
    }

    public String getSchedulerSkipUpdateCheck() {
        return schedulerSkipUpdateCheck;
    }

    public void setSchedulerSkipUpdateCheck(String schedulerSkipUpdateCheck) {
        this.schedulerSkipUpdateCheck = schedulerSkipUpdateCheck;
    }

    public String getSchedulerJobFactoryClass() {
        return schedulerJobFactoryClass;
    }

    public void setSchedulerJobFactoryClass(String schedulerJobFactoryClass) {
        this.schedulerJobFactoryClass = schedulerJobFactoryClass;
    }

    public String getJobStoreClass() {
        return jobStoreClass;
    }

    public void setJobStoreClass(String jobStoreClass) {
        this.jobStoreClass = jobStoreClass;
    }

    public String getJobStoreDriverDelegateClass() {
        return jobStoreDriverDelegateClass;
    }

    public void setJobStoreDriverDelegateClass(String jobStoreDriverDelegateClass) {
        this.jobStoreDriverDelegateClass = jobStoreDriverDelegateClass;
    }

    public String getJobStoreDatasource() {
        return jobStoreDatasource;
    }

    public void setJobStoreDatasource(String jobStoreDatasource) {
        this.jobStoreDatasource = jobStoreDatasource;
    }

    public String getJobStoreTablePrefix() {
        return jobStoreTablePrefix;
    }

    public void setJobStoreTablePrefix(String jobStoreTablePrefix) {
        this.jobStoreTablePrefix = jobStoreTablePrefix;
    }

    public String getJobStoreIsClustered() {
        return jobStoreIsClustered;
    }

    public void setJobStoreIsClustered(String jobStoreIsClustered) {
        this.jobStoreIsClustered = jobStoreIsClustered;
    }

    public String getThreadPoolClass() {
        return threadPoolClass;
    }

    public void setThreadPoolClass(String threadPoolClass) {
        this.threadPoolClass = threadPoolClass;
    }

    public String getThreadPoolThreadCount() {
        return threadPoolThreadCount;
    }

    public void setThreadPoolThreadCount(String threadPoolThreadCount) {
        this.threadPoolThreadCount = threadPoolThreadCount;
    }

    public String getDataSourceDriver() {
        return dataSourceDriver;
    }

    public void setDataSourceDriver(String dataSourceDriver) {
        this.dataSourceDriver = dataSourceDriver;
    }

    public String getDataSourceUrl() {
        return dataSourceUrl;
    }

    public void setDataSourceUrl(String dataSourceUrl) {
        this.dataSourceUrl = dataSourceUrl;
    }

    public String getDataSourceUser() {
        return dataSourceUser;
    }

    public void setDataSourceUser(String dataSourceUser) {
        this.dataSourceUser = dataSourceUser;
    }

    public String getDataSourcePassword() {
        return dataSourcePassword;
    }

    public void setDataSourcePassword(String dataSourcePassword) {
        this.dataSourcePassword = dataSourcePassword;
    }

    public String getDataSourceMaxConnections() {
        return dataSourceMaxConnections;
    }

    public void setDataSourceMaxConnections(String dataSourceMaxConnections) {
        this.dataSourceMaxConnections = dataSourceMaxConnections;
    }

    public String getDataSourceConnectionProviderClass() {
        return dataSourceConnectionProviderClass;
    }

    public void setDataSourceConnectionProviderClass(String dataSourceConnectionProviderClass) {
        this.dataSourceConnectionProviderClass = dataSourceConnectionProviderClass;
    }
}
