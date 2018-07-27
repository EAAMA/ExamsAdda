package in.co.examsadda.vo;

import java.io.Serializable;

public class Option implements Serializable {
	private static final long serialVersionUID = 1L;


	private Long optionId;
	private boolean isOptionActive;
	private boolean isOptionHasImage;
	private String optionIndicator;
	private String optionValueInEnglish;
	private String optionValueInEnglishImageUrl;
	private String optionValueInRegional;
	private String optionValueInRegionalImageUrl;
	private Question question;
	private boolean isNew = false;

	public Option() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public boolean isOptionActive() {
		return isOptionActive;
	}

	public void setOptionActive(boolean optionActive) {
		isOptionActive = optionActive;
	}

	public boolean isOptionHasImage() {
		return isOptionHasImage;
	}

	public void setOptionHasImage(boolean optionHasImage) {
		isOptionHasImage = optionHasImage;
	}

	public String getOptionIndicator() {
		return optionIndicator;
	}

	public void setOptionIndicator(String optionIndicator) {
		this.optionIndicator = optionIndicator;
	}

	public String getOptionValueInEnglish() {
		return optionValueInEnglish;
	}

	public void setOptionValueInEnglish(String optionValueInEnglish) {
		this.optionValueInEnglish = optionValueInEnglish;
	}

	public String getOptionValueInEnglishImageUrl() {
		return optionValueInEnglishImageUrl;
	}

	public void setOptionValueInEnglishImageUrl(String optionValueInEnglishImageUrl) {
		this.optionValueInEnglishImageUrl = optionValueInEnglishImageUrl;
	}

	public String getOptionValueInRegional() {
		return optionValueInRegional;
	}

	public void setOptionValueInRegional(String optionValueInRegional) {
		this.optionValueInRegional = optionValueInRegional;
	}

	public String getOptionValueInRegionalImageUrl() {
		return optionValueInRegionalImageUrl;
	}

	public void setOptionValueInRegionalImageUrl(String optionValueInRegionalImageUrl) {
		this.optionValueInRegionalImageUrl = optionValueInRegionalImageUrl;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	@Override
	public String toString() {
		return "Option{" +
				"optionId=" + optionId +
				", isOptionActive=" + isOptionActive +
				", isOptionHasImage=" + isOptionHasImage +
				", optionIndicator='" + optionIndicator + '\'' +
				", optionValueInEnglish='" + optionValueInEnglish + '\'' +
				", optionValueInEnglishImageUrl='" + optionValueInEnglishImageUrl + '\'' +
				", optionValueInRegional='" + optionValueInRegional + '\'' +
				", optionValueInRegionalImageUrl='" + optionValueInRegionalImageUrl + '\'' +
				", question=" + question +
				'}';
	}
}