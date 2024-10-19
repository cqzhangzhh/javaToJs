package com.bfscq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

//@AllArgsConstructor
//@Data
public class Employee {
	private int employeeId; // 员工编号
	private String name; // 员工的姓名
	private String gender; // 员工的性别
	private Date birthDate; // 员工的出生日期
	private Date hireDate; // 员工的入职日期
	private String position; // 员工的职位
	private String department; // 员工所属的部门
	private String phone; // 员工的联系电话
	private String email; // 员工的电子邮箱
	private String address; // 员工的家庭地址
	private String emergencyContactName; // 紧急联系人的姓名
	private String emergencyContactPhone; // 紧急联系人的电话
	private String education; // 员工的学历
	private String notes; // 其他补充信息

	// 构造函数
	public Employee() {}

	// Getter 和 Setter 方法
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}