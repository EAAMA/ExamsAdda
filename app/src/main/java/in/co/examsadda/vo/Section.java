package in.co.examsadda.vo;

import java.io.Serializable;
public class Section implements Serializable {
	private static final long serialVersionUID = 1L;

	private int sectionId;
	private boolean isSectionActive;
	private int numberOfQuestionsInThisSection;
	private PracticePaper practicePaper;
	private String sectionDescriptionInEnglish;
	private String sectionDescriptionInRegional;
	private String sectionNameInEnglish;
	private String sectionNameInRegional;
	private boolean isNew = false;

    public Section() {
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public boolean isSectionActive() {
        return isSectionActive;
    }

    public void setSectionActive(boolean sectionActive) {
        isSectionActive = sectionActive;
    }

    public int getNumberOfQuestionsInThisSection() {
        return numberOfQuestionsInThisSection;
    }

    public void setNumberOfQuestionsInThisSection(int numberOfQuestionsInThisSection) {
        this.numberOfQuestionsInThisSection = numberOfQuestionsInThisSection;
    }

    public PracticePaper getPracticePaper() {
        return practicePaper;
    }

    public void setPracticePaper(PracticePaper practicePaper) {
        this.practicePaper = practicePaper;
    }

    public String getSectionDescriptionInEnglish() {
        return sectionDescriptionInEnglish;
    }

    public void setSectionDescriptionInEnglish(String sectionDescriptionInEnglish) {
        this.sectionDescriptionInEnglish = sectionDescriptionInEnglish;
    }

    public String getSectionDescriptionInRegional() {
        return sectionDescriptionInRegional;
    }

    public void setSectionDescriptionInRegional(String sectionDescriptionInRegional) {
        this.sectionDescriptionInRegional = sectionDescriptionInRegional;
    }

    public String getSectionNameInEnglish() {
        return sectionNameInEnglish;
    }

    public void setSectionNameInEnglish(String sectionNameInEnglish) {
        this.sectionNameInEnglish = sectionNameInEnglish;
    }

    public String getSectionNameInRegional() {
        return sectionNameInRegional;
    }

    public void setSectionNameInRegional(String sectionNameInRegional) {
        this.sectionNameInRegional = sectionNameInRegional;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionId=" + sectionId +
                ", isSectionActive=" + isSectionActive +
                ", numberOfQuestionsInThisSection=" + numberOfQuestionsInThisSection +
                ", practicePaper=" + practicePaper +
                ", sectionDescriptionInEnglish='" + sectionDescriptionInEnglish + '\'' +
                ", sectionDescriptionInRegional='" + sectionDescriptionInRegional + '\'' +
                ", sectionNameInEnglish='" + sectionNameInEnglish + '\'' +
                ", sectionNameInRegional='" + sectionNameInRegional + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}