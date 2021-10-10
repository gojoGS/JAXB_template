package App.Game;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlRootElement
public class Question {
    @XmlAttribute
    private @Getter int rightIndex;
    @XmlElement
    private @Getter String question;
    @XmlElement
    private @Getter String[] options;
}
