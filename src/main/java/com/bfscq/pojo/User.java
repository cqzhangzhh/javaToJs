package com.bfscq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

//@AllArgsConstructor
//@Data
public class User {
	private String userId; // 用户ID
	private String username; // 用户名
	@JsonProperty("password")
	private String passwordHash; // 用户密码的哈希值
	private String email; // 用户的电子邮件地址
	private String phoneNumber; // 用户的电话号码
	private String lastLogin;
	private String failedAttempts;
	private String isLocked;
	private String role;
	private String createdAt;
	private String updatedAt;

	public User() {
		super();
	}

	public User(String userId, String username, String passwordHash, String email, String phoneNumber, String lastLogin,
			String failedAttempts, String isLocked, String role, String createdAt, String updatedAt) {
		super();
		this.userId = userId;
		this.username = username;
		this.passwordHash = passwordHash;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.lastLogin = lastLogin;
		this.failedAttempts = failedAttempts;
		this.isLocked = isLocked;
		this.role = role;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getFailedAttempts() {
		return failedAttempts;
	}

	public void setFailedAttempts(String failedAttempts) {
		this.failedAttempts = failedAttempts;
	}

	public String getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}
