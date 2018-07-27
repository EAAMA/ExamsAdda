package in.co.examsadda.vo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailId;
	private boolean isUserActive;
	private Date lastLogin;
	private String password;
	private Date datOfRegistration;
	private boolean isNew = true;

	public User() {
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public boolean isUserActive() {
		return isUserActive;
	}

	public void setUserActive(boolean userActive) {
		isUserActive = userActive;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDatOfRegistration() {
		return datOfRegistration;
	}

	public void setDatOfRegistration(Date datOfRegistration) {
		this.datOfRegistration = datOfRegistration;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "User{" +
				"emailId='" + emailId + '\'' +
				", isUserActive=" + isUserActive +
				", lastLogin=" + lastLogin +
				", password='" + password + '\'' +
				", datOfRegistration=" + datOfRegistration +
				", isNew=" + isNew +
				'}';
	}
}