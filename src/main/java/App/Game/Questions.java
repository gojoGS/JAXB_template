package App.Game;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Questions {
    @XmlElement(name="question")
    private @Getter List<Question> questions;
}
