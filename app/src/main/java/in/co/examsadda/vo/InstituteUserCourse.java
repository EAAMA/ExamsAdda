package in.co.examsadda.vo;

import java.io.Serializable;

import java.util.Date;
public class InstituteUserCourse implements Serializable  {
	private static final long serialVersionUID = 1L;
	private InstituteUserCoursePK iucPkId;
	private Date dateOfRegistration;
	private Date dateOnRegistrationEnding;
	private boolean isCourseActive;
	private boolean isNew = false;

	public InstituteUserCourse() {
	}

	public InstituteUserCoursePK getIucPkId() {
		return iucPkId;
	}

	public void setIucPkId(InstituteUserCoursePK iucPkId) {
		this.iucPkId = iucPkId;
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

	public boolean isCourseActive() {
		return isCourseActive;
	}

	public void setCourseActive(boolean courseActive) {
		isCourseActive = courseActive;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "InstituteUserCourse{" +
				"iucPkId=" + iucPkId +
				", dateOfRegistration=" + dateOfRegistration +
				", dateOnRegistrationEnding=" + dateOnRegistrationEnding +
				", isCourseActive=" + isCourseActive +
				", isNew=" + isNew +
				'}';
	}
}