package in.co.examsadda.vo;

import java.io.Serializable;
import java.util.Date;

public class InstituteCourse implements Serializable {
	private static final long serialVersionUID = 1L;
	private InstituteCoursePK pkId;
	private Date dateOfRegistration;
	private Date dateOnEnding;
	private boolean isInstituteCourseActive;
	private int registrationId;
	private boolean isNew = false;

	
	public InstituteCourse() {
	}

	public InstituteCoursePK getPkId() {
		return pkId;
	}

	public void setPkId(InstituteCoursePK pkId) {
		this.pkId = pkId;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Date getDateOnEnding() {
		return dateOnEnding;
	}

	public void setDateOnEnding(Date dateOnEnding) {
		this.dateOnEnding = dateOnEnding;
	}

	public boolean isInstituteCourseActive() {
		return isInstituteCourseActive;
	}

	public void setInstituteCourseActive(boolean instituteCourseActive) {
		isInstituteCourseActive = instituteCourseActive;
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
		return "InstituteCourse{" +
				"pkId=" + pkId +
				", dateOfRegistration=" + dateOfRegistration +
				", dateOnEnding=" + dateOnEnding +
				", isInstituteCourseActive=" + isInstituteCourseActive +
				", registrationId=" + registrationId +
				", isNew=" + isNew +
				'}';
	}
}