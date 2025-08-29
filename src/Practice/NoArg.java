package practice;

public class NoArg {

    public int id;
    public String name;

    public NoArg() {
        id = 101;
        name = "Steve";
    }

    @Override
    public String toString() {
        return "NoArg[id=" + id + ", name=" + name + "]";
    }

}
