package in.co.examsadda.vo;

import java.io.Serializable;


public class Question implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long questionId;
	private String answerForThisQuestion;
	private boolean isQuestionActive;
	private boolean isQuestionHasImage;
	private String questionInEnglish;
	private String questionInEnglishImageUrl;
	private String questionInRegional;
	private String questionInRegionalImageUrl;
	private Section section;
	private String userAnswerForThisQuestion;
	private boolean isNew = false;
	
	public Question() {
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getAnswerForThisQuestion() {
		return answerForThisQuestion;
	}

	public void setAnswerForThisQuestion(String answerForThisQuestion) {
		this.answerForThisQuestion = answerForThisQuestion;
	}

	public boolean isQuestionActive() {
		return isQuestionActive;
	}

	public void setQuestionActive(boolean questionActive) {
		isQuestionActive = questionActive;
	}

	public boolean isQuestionHasImage() {
		return isQuestionHasImage;
	}

	public void setQuestionHasImage(boolean questionHasImage) {
		isQuestionHasImage = questionHasImage;
	}

	public String getQuestionInEnglish() {
		return questionInEnglish;
	}

	public void setQuestionInEnglish(String questionInEnglish) {
		this.questionInEnglish = questionInEnglish;
	}

	public String getQuestionInEnglishImageUrl() {
		return questionInEnglishImageUrl;
	}

	public void setQuestionInEnglishImageUrl(String questionInEnglishImageUrl) {
		this.questionInEnglishImageUrl = questionInEnglishImageUrl;
	}

	public String getQuestionInRegional() {
		return questionInRegional;
	}

	public void setQuestionInRegional(String questionInRegional) {
		this.questionInRegional = questionInRegional;
	}

	public String getQuestionInRegionalImageUrl() {
		return questionInRegionalImageUrl;
	}

	public void setQuestionInRegionalImageUrl(String questionInRegionalImageUrl) {
		this.questionInRegionalImageUrl = questionInRegionalImageUrl;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public String getUserAnswerForThisQuestion() {
		return userAnswerForThisQuestion;
	}

	public void setUserAnswerForThisQuestion(String userAnswerForThisQuestion) {
		this.userAnswerForThisQuestion = userAnswerForThisQuestion;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", answerForThisQuestion='" + answerForThisQuestion + '\'' +
                ", isQuestionActive=" + isQuestionActive +
                ", isQuestionHasImage=" + isQuestionHasImage +
                ", questionInEnglish='" + questionInEnglish + '\'' +
                ", questionInEnglishImageUrl='" + questionInEnglishImageUrl + '\'' +
                ", questionInRegional='" + questionInRegional + '\'' +
                ", questionInRegionalImageUrl='" + questionInRegionalImageUrl + '\'' +
                ", section=" + section +
                ", userAnswerForThisQuestion='" + userAnswerForThisQuestion + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}