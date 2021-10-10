package App;

import App.Game.Question;
import App.Game.Questions;
import jakarta.xml.bind.JAXBException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, JAXBException {
        var lst = new ArrayList<Question>();
        var qb = Question.builder()
                .rightIndex(0)
                .options(new String[]{"asd", "das", "xd"})
                .question("asdadas")
                .build();

        lst.add(new Question(
                0, ":::", new String[]{"asd", "das", "xd"}
        ));

        lst.add(new Question(
                2, ":asda::", new String[]{"asdaadsd", "asdasdas", "xdadsd"}
        ));

        lst.add(new Question(
                1, ":dasdada::", new String[]{"astzthtggtd", "dgztztas", "xhzthttd"}
        ));

        lst.add(new Question(
                0, "::frefeerfef:", new String[]{"asdwedwed", "dahzthtzhweds", "xhztthhtzd"}
        ));

        lst.add(new Question(
                2, ":::asdasd", new String[]{"asfrtgtrd", "drtgrtas", "xgrtrtd"}
        ));

        var questions = new Questions(lst);

        App.Util.JAXBHelper.toXML(questions, new FileOutputStream("xml.xml"));

        Questions qq = App.Util.JAXBHelper.fromXML(Questions.class, new FileInputStream("xml.xml"));
        System.out.println(qq.getQuestions());
    }
}
