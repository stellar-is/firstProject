package kg.megacom.Models;

public class Street {
    private int id;
    private  String name;

    public Street() {
    }

    public Street(String name) {
        this.name = name;
    }

    public Street(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'+ "\n";
    }
}
