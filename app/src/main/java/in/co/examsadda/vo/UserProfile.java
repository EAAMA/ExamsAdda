package in.co.examsadda.vo;

import java.io.Serializable;
public class UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	private String emailId;
	private String firstName;
	private String gender;
	private boolean isUserProfileActive;
	private String lastName;
	private String mobile;
	private String secretQuestion1;
	private String secretQuestion2;
	private String secretQuestionAnswer1;
	private String secretQuestionAnswer2;
	private boolean isNew = false;

	public UserProfile() {
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isUserProfileActive() {
		return isUserProfileActive;
	}

	public void setUserProfileActive(boolean userProfileActive) {
		isUserProfileActive = userProfileActive;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSecretQuestion1() {
		return secretQuestion1;
	}

	public void setSecretQuestion1(String secretQuestion1) {
		this.secretQuestion1 = secretQuestion1;
	}

	public String getSecretQuestion2() {
		return secretQuestion2;
	}

	public void setSecretQuestion2(String secretQuestion2) {
		this.secretQuestion2 = secretQuestion2;
	}

	public String getSecretQuestionAnswer1() {
		return secretQuestionAnswer1;
	}

	public void setSecretQuestionAnswer1(String secretQuestionAnswer1) {
		this.secretQuestionAnswer1 = secretQuestionAnswer1;
	}

	public String getSecretQuestionAnswer2() {
		return secretQuestionAnswer2;
	}

	public void setSecretQuestionAnswer2(String secretQuestionAnswer2) {
		this.secretQuestionAnswer2 = secretQuestionAnswer2;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

    @Override
    public String toString() {
        return "UserProfile{" +
                "emailId='" + emailId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", isUserProfileActive=" + isUserProfileActive +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", secretQuestion1='" + secretQuestion1 + '\'' +
                ", secretQuestion2='" + secretQuestion2 + '\'' +
                ", secretQuestionAnswer1='" + secretQuestionAnswer1 + '\'' +
                ", secretQuestionAnswer2='" + secretQuestionAnswer2 + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}