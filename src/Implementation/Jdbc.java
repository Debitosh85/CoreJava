package Implementation;

public interface Jdbc {

    public String getFun(String name);

    public default void getChill(String actv) {

        System.out.println("We Providing this fun:" + actv);
    }

}
