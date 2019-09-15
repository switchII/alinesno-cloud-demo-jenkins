package com.alinesno.cloud.base.boot.feign.dto;

import com.alinesno.cloud.common.facade.feign.BaseDto;

/**
 * <p> 传输对象</p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@SuppressWarnings("serial")
public class ManagerSourceGenerateDto extends BaseDto {

	private String authorName;
	
	private String dbDriver;
	
	private String dbPwd;
	
	private String dbUrl;
	
	private String dbUser;
	
	private String bootPrefix;
	
	private String feignServerPath;
	
	private String packageName;
	
	private String applicationName;
	
	private String departmentId;
	
	private String fieldId;
	
	private String operatorId;
	
	private String gitPassword;
	
	private String gitRepositoryUrl;
	
	private String gitUserName;
	
	private Boolean dockerProject;
	
	private String jenkinsPassword;
	
	private String jenkinsUrl;
	
	private String jenkinsUserName;
	
	private Boolean serviceProject;
	


	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDbDriver() {
		return dbDriver;
	}

	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}

	public String getDbPwd() {
		return dbPwd;
	}

	public void setDbPwd(String dbPwd) {
		this.dbPwd = dbPwd;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getBootPrefix() {
		return bootPrefix;
	}

	public void setBootPrefix(String bootPrefix) {
		this.bootPrefix = bootPrefix;
	}

	public String getFeignServerPath() {
		return feignServerPath;
	}

	public void setFeignServerPath(String feignServerPath) {
		this.feignServerPath = feignServerPath;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getGitPassword() {
		return gitPassword;
	}

	public void setGitPassword(String gitPassword) {
		this.gitPassword = gitPassword;
	}

	public String getGitRepositoryUrl() {
		return gitRepositoryUrl;
	}

	public void setGitRepositoryUrl(String gitRepositoryUrl) {
		this.gitRepositoryUrl = gitRepositoryUrl;
	}

	public String getGitUserName() {
		return gitUserName;
	}

	public void setGitUserName(String gitUserName) {
		this.gitUserName = gitUserName;
	}

	public Boolean isDockerProject() {
		return dockerProject;
	}

	public void setDockerProject(Boolean dockerProject) {
		this.dockerProject = dockerProject;
	}

	public String getJenkinsPassword() {
		return jenkinsPassword;
	}

	public void setJenkinsPassword(String jenkinsPassword) {
		this.jenkinsPassword = jenkinsPassword;
	}

	public String getJenkinsUrl() {
		return jenkinsUrl;
	}

	public void setJenkinsUrl(String jenkinsUrl) {
		this.jenkinsUrl = jenkinsUrl;
	}

	public String getJenkinsUserName() {
		return jenkinsUserName;
	}

	public void setJenkinsUserName(String jenkinsUserName) {
		this.jenkinsUserName = jenkinsUserName;
	}

	public Boolean isServiceProject() {
		return serviceProject;
	}

	public void setServiceProject(Boolean serviceProject) {
		this.serviceProject = serviceProject;
	}

}
