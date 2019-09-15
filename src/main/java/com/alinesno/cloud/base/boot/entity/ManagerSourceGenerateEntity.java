package com.alinesno.cloud.base.boot.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.core.orm.entity.BaseEntity;


/**
 * <p>
 * 
 * </p>
 *
 * @author LuoAnDong
 * @since 2019-09-15 14:04:42
 */
@Entity
@Table(name="manager_source_generate")
public class ManagerSourceGenerateEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Column(name="author_name")
	private String authorName;
	@Column(name="db_driver")
	private String dbDriver;
	@Column(name="db_pwd")
	private String dbPwd;
	@Column(name="db_url")
	private String dbUrl;
	@Column(name="db_user")
	private String dbUser;
	@Column(name="boot_prefix")
	private String bootPrefix;
	@Column(name="feign_server_path")
	private String feignServerPath;
	@Column(name="package_name")
	private String packageName;
	@Column(name="application_name")
	private String applicationName;
	@Column(name="department_id")
	private String departmentId;
	@Column(name="field_id")
	private String fieldId;
	@Column(name="operator_id")
	private String operatorId;
	@Column(name="git_password")
	private String gitPassword;
	@Column(name="git_repository_url")
	private String gitRepositoryUrl;
	@Column(name="git_user_name")
	private String gitUserName;
	@Column(name="docker_project")
	private Boolean dockerProject;
	@Column(name="jenkins_password")
	private String jenkinsPassword;
	@Column(name="jenkins_url")
	private String jenkinsUrl;
	@Column(name="jenkins_user_name")
	private String jenkinsUserName;
	@Column(name="service_project")
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


	@Override
	public String toString() {
		return "ManagerSourceGenerateEntity{" +
			"authorName=" + authorName +
			", dbDriver=" + dbDriver +
			", dbPwd=" + dbPwd +
			", dbUrl=" + dbUrl +
			", dbUser=" + dbUser +
			", bootPrefix=" + bootPrefix +
			", feignServerPath=" + feignServerPath +
			", packageName=" + packageName +
			", applicationName=" + applicationName +
			", departmentId=" + departmentId +
			", fieldId=" + fieldId +
			", operatorId=" + operatorId +
			", gitPassword=" + gitPassword +
			", gitRepositoryUrl=" + gitRepositoryUrl +
			", gitUserName=" + gitUserName +
			", dockerProject=" + dockerProject +
			", jenkinsPassword=" + jenkinsPassword +
			", jenkinsUrl=" + jenkinsUrl +
			", jenkinsUserName=" + jenkinsUserName +
			", serviceProject=" + serviceProject +
			"}";
	}
}
