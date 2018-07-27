package in.co.examsadda.vo;

import java.io.Serializable;
import java.util.Date;
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	private int courseId;
	private String courseNameInEnglish;
	private String courseNameInRegional;
	private boolean isCourseActive;
	private Date datOfCourseRegistration;
	private boolean isNew = false;
	
	public Course() {
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseNameInEnglish() {
		return courseNameInEnglish;
	}

	public void setCourseNameInEnglish(String courseNameInEnglish) {
		this.courseNameInEnglish = courseNameInEnglish;
	}

	public String getCourseNameInRegional() {
		return courseNameInRegional;
	}

	public void setCourseNameInRegional(String courseNameInRegional) {
		this.courseNameInRegional = courseNameInRegional;
	}

	public boolean isCourseActive() {
		return isCourseActive;
	}

	public void setCourseActive(boolean courseActive) {
		isCourseActive = courseActive;
	}

	public Date getDatOfCourseRegistration() {
		return datOfCourseRegistration;
	}

	public void setDatOfCourseRegistration(Date datOfCourseRegistration) {
		this.datOfCourseRegistration = datOfCourseRegistration;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "Course{" +
				"courseId=" + courseId +
				", courseNameInEnglish='" + courseNameInEnglish + '\'' +
				", courseNameInRegional='" + courseNameInRegional + '\'' +
				", isCourseActive=" + isCourseActive +
				", datOfCourseRegistration=" + datOfCourseRegistration +
				", isNew=" + isNew +
				'}';
	}
}