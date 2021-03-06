package in.co.examsadda.vo;

import java.io.Serializable;
public class InstituteUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String userIdFk;
	private String instituteIdFk;

	public InstituteUserPK() {
	}
	public String getUserIdFk() {
		return this.userIdFk;
	}
	public void setUserIdFk(String userIdFk) {
		this.userIdFk = userIdFk;
	}
	public String getInstituteIdFk() {
		return this.instituteIdFk;
	}
	public void setInstituteIdFk(String instituteIdFk) {
		this.instituteIdFk = instituteIdFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InstituteUserPK)) {
			return false;
		}
		InstituteUserPK castOther = (InstituteUserPK)other;
		return 
			this.userIdFk.equals(castOther.userIdFk)
			&& this.instituteIdFk.equals(castOther.instituteIdFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userIdFk.hashCode();
		hash = hash * prime + this.instituteIdFk.hashCode();
		
		return hash;
	}
}