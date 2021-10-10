package App;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {
    @XmlAttribute
    private int rightIndex;
    @XmlElement
    private String question;
    @XmlElement
    private String[] options;

    public Question() {
    }

    public Question(final int rightIndex, final String question, final String[] options) {
        this.rightIndex = rightIndex;
        this.question = question;
        this.options = options;
    }

    public int getRightIndex() {
        return this.rightIndex;
    }

    public String getQuestion() {
        return this.question;
    }

    public String[] getOptions() {
        return this.options;
    }
}
