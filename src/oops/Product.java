package oops;

public class Product {

    private String productName;
    private int productCode;
    private double productPrice;

    public Product(String name, int code, double price) {

        super();
        this.productName = name;
        this.productCode = code;
        this.productPrice = price;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public static Product getProduct() {
        return new Product("Bat", 12, 1200.0);
    }

    @Override
    public String toString() {
        return "Product [productName=" + productName + ", productCode=" + productCode + ", productPrice=" + productPrice
                + "]";
    }
}
