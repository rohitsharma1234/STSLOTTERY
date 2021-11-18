package com.lottery.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LotteryUserTo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer userId;
	private Integer userVersion;

	@NotBlank(message = "FirstName is mandatory")
	@Size(min = 5, max = 18, message = "The FirstName '${validatedValue}' must be between {min} and {max} characters long")
	private String firstName;

	private String middleName;

	@NotBlank(message = "LastName is mandatory")
	@Size(min = 5, max = 18, message = "The LastName '${validatedValue}' must be between {min} and {max} characters long")
	private String lastName;

	@NotBlank(message = "Password is mandatory")
	@Size(min = 5, max = 18, message = "The password '${validatedValue}' must be between {min} and {max} characters long")
	private String userPassword;

	@NotBlank(message = "ConfirmPassword is mandatory")
	@Size(min = 5, max = 18, message = "The ConfirmPassword '${validatedValue}' must be between {min} and {max} characters long")
	private String confirmPassword;

	@NotBlank(message = "Email-Id is mandatory")
	@Size(min = 5, max = 18, message = "The Email-Id '${validatedValue}' must be between {min} and {max} characters long")
	private String emailId;

	@NotBlank(message = "Phone Number is mandatory")
	@Size(min = 5, max = 18, message = "The Phone Number '${validatedValue}' must be between {min} and {max} characters long")
	private String phoneNumber;

	

	@NotNull(message = "Date of Birth is mandatory")
	private Date dateOfBirth;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserVersion() {
		return userVersion;
	}

	public void setUserVersion(Integer userVersion) {
		this.userVersion = userVersion;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LotteryUserTo [userId=").append(userId).append(", userVersion=").append(userVersion)
				.append(", firstName=").append(firstName).append(", middleName=").append(middleName)
				.append(", lastName=").append(lastName).append(", userPassword=").append(userPassword)
				.append(", confirmPassword=").append(confirmPassword).append(", emailId=").append(emailId)
				.append(", phoneNumber=").append(phoneNumber).append(", dateOfBirth=").append(dateOfBirth).append("]");
		return builder.toString();
	}

}
