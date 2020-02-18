package com.airport.mgmt.form;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="User",schema="AirportMgmtSystem")
public class User {

	@Id
	@Column(name="ID")
	private Integer id;
	
	@NotNull
	@Column(name="ROLE")
	private String userType;
	
	@NotNull
	@Column(name="USER_NAME")
	private String userName;
	
	@NotNull
	@Column(name="PASSWORD")
	private String password;
	
	@NotNull
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@NotNull
	@Column(name="LASTTNAME")
	private String lastName;
	
	@NotNull
	@Column(name="AGE")
	private Integer age;
	
	@NotNull
	@Column(name="GENDER")
	private String gender;
	
	
	@NotNull
	@Column(name="CONTACT_NO")
	private Integer contactNumber;

	
	@NotNull
	@Column(name="EMAIL")
	private String email;
	
	@NotNull
	@Column(name="APPROVAL")
	private String approval;

	
	

	public User(Integer id, String userType, String userName, String password, String firstName, String lastName,
			Integer age, String gender, Integer contactNumber, String email, String approval) {
		super();
		this.id = id;
		this.userType = userType;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.email = email;
		this.approval = approval;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}


	public Integer getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getApproval() {
		return approval;
	}


	public void setApproval(String approval) {
		this.approval = approval;
	}


	public User() {
		super();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
