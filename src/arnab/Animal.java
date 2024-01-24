package arnab;

import java.io.Serializable;

public class Animal implements Serializable {

    private static final long serialVersionUID = 123456789L ;

    private int id;
    private String name;

    private int count;



    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
