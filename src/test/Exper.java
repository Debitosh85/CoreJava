package test;

public class Exper {

    String laptopName;
    double laptopPrice;
    String laptopBrand;

    public void laptopInformation() {
        System.out.println("Laptop Name: " + laptopName);
        System.out.println("Laptop Price: " + laptopPrice);
        System.out.println("Laptop Brand: " + laptopBrand);
    }

    @Override
    public String toString() {
        return "Exper [laptopName=" + laptopName + ", laptopPrice=" + laptopPrice + ", laptopBrand=" + laptopBrand
                + "]";
    }

    
}
