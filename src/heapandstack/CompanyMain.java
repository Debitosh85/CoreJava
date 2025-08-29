package heapandstack;

public class CompanyMain {

    public static void main(String[] args) {

        Employee emp = new Employee(111, "Ramesh");

        Manager m = new Manager(emp);

        // We can pass the reference of One Object to ConStructor for Copying the Content of
        // Another Object

        System.out.println(m);

    }
}
