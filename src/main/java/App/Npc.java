package App;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Npc {
    @XmlAttribute
    private int health;
    @XmlAttribute
    private int damage;
    @XmlAttribute
    private List<String> inventory;

    Npc() {}
    Npc(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.inventory = new ArrayList<>();
    }

}
