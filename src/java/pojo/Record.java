package pojo;

/**
 * @author LENOVO
 */
public class Record {
    private Integer id;

    private String equation;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation == null ? null : equation.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", equation='" + equation + '\'' + ", answer='" + answer + '\'' + '}';
    }
}