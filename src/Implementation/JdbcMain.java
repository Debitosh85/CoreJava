package Implementation;

public class JdbcMain {
    public static void main(String[] args) {

        Jdbc con = new Fun();
        System.out.println(con.getFun("Rakesh")); 
        con.getChill("Surfing");

    }

}
