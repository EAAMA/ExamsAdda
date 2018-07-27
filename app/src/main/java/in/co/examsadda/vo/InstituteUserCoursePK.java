package in.co.examsadda.vo;

import java.io.Serializable;
public class InstituteUserCoursePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String instituteIdFk;
	private int courseIdFk;
	private String userIdFk;

	public InstituteUserCoursePK() {
	}
	public String getInstituteIdFk() {
		return this.instituteIdFk;
	}
	public void setInstituteIdFk(String instituteIdFk) {
		this.instituteIdFk = instituteIdFk;
	}
	public int getCourseIdFk() {
		return this.courseIdFk;
	}
	public void setCourseIdFk(int courseIdFk) {
		this.courseIdFk = courseIdFk;
	}
	public String getUserIdFk() {
		return this.userIdFk;
	}
	public void setUserIdFk(String userIdFk) {
		this.userIdFk = userIdFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InstituteUserCoursePK)) {
			return false;
		}
		InstituteUserCoursePK castOther = (InstituteUserCoursePK)other;
		return 
			this.instituteIdFk.equals(castOther.instituteIdFk)
			&& (this.courseIdFk == castOther.courseIdFk)
			&& this.userIdFk.equals(castOther.userIdFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.instituteIdFk.hashCode();
		hash = hash * prime + this.courseIdFk;
		hash = hash * prime + this.userIdFk.hashCode();
		
		return hash;
	}
}