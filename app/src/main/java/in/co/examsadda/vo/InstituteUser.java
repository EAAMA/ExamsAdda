package in.co.examsadda.vo;

import java.io.Serializable;
import java.util.Date;
public class InstituteUser implements Serializable  {
	private static final long serialVersionUID = 1L;
	private InstituteUserPK pkId;
	private Date dateOfRegistration;
	private Date dateOnRegistrationEnding;
	private boolean isInstituteUserActive;
	private int registrationId;
	private boolean isNew = false;

	public InstituteUser() {
	}

	public InstituteUserPK getPkId() {
		return pkId;
	}

	public void setPkId(InstituteUserPK pkId) {
		this.pkId = pkId;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Date getDateOnRegistrationEnding() {
		return dateOnRegistrationEnding;
	}

	public void setDateOnRegistrationEnding(Date dateOnRegistrationEnding) {
		this.dateOnRegistrationEnding = dateOnRegistrationEnding;
	}

	public boolean isInstituteUserActive() {
		return isInstituteUserActive;
	}

	public void setInstituteUserActive(boolean instituteUserActive) {
		isInstituteUserActive = instituteUserActive;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "InstituteUser{" +
				"pkId=" + pkId +
				", dateOfRegistration=" + dateOfRegistration +
				", dateOnRegistrationEnding=" + dateOnRegistrationEnding +
				", isInstituteUserActive=" + isInstituteUserActive +
				", registrationId=" + registrationId +
				", isNew=" + isNew +
				'}';
	}
}