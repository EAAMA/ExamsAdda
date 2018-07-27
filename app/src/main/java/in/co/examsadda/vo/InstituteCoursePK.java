package in.co.examsadda.vo;

import java.io.Serializable;
public class InstituteCoursePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String instituteIdFk;
	private int courseIdFk;

	public InstituteCoursePK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InstituteCoursePK)) {
			return false;
		}
		InstituteCoursePK castOther = (InstituteCoursePK)other;
		return 
			this.instituteIdFk.equals(castOther.instituteIdFk)
			&& (this.courseIdFk == castOther.courseIdFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.instituteIdFk.hashCode();
		hash = hash * prime + this.courseIdFk;
		
		return hash;
	}
}