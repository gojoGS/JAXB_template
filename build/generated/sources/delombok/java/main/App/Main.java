package App;

import jakarta.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, JAXBException {
        var orc = new Npc(120, 1);

        var os = new FileOutputStream("xml.xml");

        App.Util.JAXBHelper.toXML(orc, os);
    }
}
