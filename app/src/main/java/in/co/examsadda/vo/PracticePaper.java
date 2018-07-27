package in.co.examsadda.vo;

import java.io.Serializable;

public class PracticePaper implements Serializable {
	private static final long serialVersionUID = 1L;
	private int practicePaperId;
    private Course course;
	private boolean isPracticePaperActive;
	private int numberOfSectionsInThisPracticePaper;
	private int practicePaperDuration;
	private int practicePaperCurrentDuration;
	private String practicePaperNameInEnglish;
	private String practicePaperNameInRegional;
	private boolean isNew = false;

	public PracticePaper() {
	}

	public int getPracticePaperId() {
		return practicePaperId;
	}

	public void setPracticePaperId(int practicePaperId) {
		this.practicePaperId = practicePaperId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public boolean isPracticePaperActive() {
		return isPracticePaperActive;
	}

	public void setPracticePaperActive(boolean practicePaperActive) {
		isPracticePaperActive = practicePaperActive;
	}

	public int getNumberOfSectionsInThisPracticePaper() {
		return numberOfSectionsInThisPracticePaper;
	}

	public void setNumberOfSectionsInThisPracticePaper(int numberOfSectionsInThisPracticePaper) {
		this.numberOfSectionsInThisPracticePaper = numberOfSectionsInThisPracticePaper;
	}

	public int getPracticePaperDuration() {
		return practicePaperDuration;
	}

	public void setPracticePaperDuration(int practicePaperDuration) {
		this.practicePaperDuration = practicePaperDuration;
	}

	public int getPracticePaperCurrentDuration() {
		return practicePaperCurrentDuration;
	}

	public void setPracticePaperCurrentDuration(int practicePaperCurrentDuration) {
		this.practicePaperCurrentDuration = practicePaperCurrentDuration;
	}

	public String getPracticePaperNameInEnglish() {
		return practicePaperNameInEnglish;
	}

	public void setPracticePaperNameInEnglish(String practicePaperNameInEnglish) {
		this.practicePaperNameInEnglish = practicePaperNameInEnglish;
	}

	public String getPracticePaperNameInRegional() {
		return practicePaperNameInRegional;
	}

	public void setPracticePaperNameInRegional(String practicePaperNameInRegional) {
		this.practicePaperNameInRegional = practicePaperNameInRegional;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "PracticePaper{" +
				"practicePaperId=" + practicePaperId +
				", course=" + course +
				", isPracticePaperActive=" + isPracticePaperActive +
				", numberOfSectionsInThisPracticePaper=" + numberOfSectionsInThisPracticePaper +
				", practicePaperDuration=" + practicePaperDuration +
				", practicePaperCurrentDuration=" + practicePaperCurrentDuration +
				", practicePaperNameInEnglish='" + practicePaperNameInEnglish + '\'' +
				", practicePaperNameInRegional='" + practicePaperNameInRegional + '\'' +
				", isNew=" + isNew +
				'}';
	}
}