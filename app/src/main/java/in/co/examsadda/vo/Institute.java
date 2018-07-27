package in.co.examsadda.vo;

import java.io.Serializable;

public class Institute implements Serializable  {
	private static final long serialVersionUID = 1L;

	private String instituteId;
	private String instituteNameInEnglish;
	private String instituteNameInRegional;
	private boolean isInstituteActive;
	private String password;
	private boolean isNew = false;

	public Institute() {
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteNameInEnglish() {
		return instituteNameInEnglish;
	}

	public void setInstituteNameInEnglish(String instituteNameInEnglish) {
		this.instituteNameInEnglish = instituteNameInEnglish;
	}

	public String getInstituteNameInRegional() {
		return instituteNameInRegional;
	}

	public void setInstituteNameInRegional(String instituteNameInRegional) {
		this.instituteNameInRegional = instituteNameInRegional;
	}

	public boolean isInstituteActive() {
		return isInstituteActive;
	}

	public void setInstituteActive(boolean instituteActive) {
		isInstituteActive = instituteActive;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "Institute{" +
				"instituteId='" + instituteId + '\'' +
				", instituteNameInEnglish='" + instituteNameInEnglish + '\'' +
				", instituteNameInRegional='" + instituteNameInRegional + '\'' +
				", isInstituteActive=" + isInstituteActive +
				", password='" + password + '\'' +
				", isNew=" + isNew +
				'}';
	}
}