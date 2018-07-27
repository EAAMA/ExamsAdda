package in.co.examsadda.dto;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.vo.PracticePaper;


public class ExamPaper {

    private PracticePaper practicePaper;
    private List<ExamSection> sections;

    /**
     *
     */
    public ExamPaper() {
        practicePaper = new PracticePaper();
        sections = new ArrayList<ExamSection>();
    }

    public PracticePaper getPracticePaper() {
        return practicePaper;
    }

    public void setPracticePaper(PracticePaper practicePaper) {
        this.practicePaper = practicePaper;
    }

    public List<ExamSection> getSections() {
        return sections;
    }

    public void setSections(List<ExamSection> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "ExamPaper{" +
                "practicePaper=" + practicePaper +
                ", sections=" + sections +
                '}';
    }
}
