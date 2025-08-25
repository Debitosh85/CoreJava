package heapandstack;

public class ProductCopy {

    private Integer pId;
    private String pName;
    private Double price;

    public ProductCopy(Integer id, String name, Double price) {
        super();
        this.pId = id;
        this.pName = name;
        this.price = price;
    }
    public ProductCopy(ProductCopy prod) {
        super();
        this.pId = prod.pId;
        this.pName = prod.pName;
        this.price = prod.price;
    }
    public void setPid(Integer pId) {
        this.pId = pId;
    }
    public Integer getPid() {
        return pId;
    }
    public void setPname(String pName) {
        this.pName = pName;
    }
    public String getPname() {
        return pName;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "ProductCopy[pId=" + pId + ",pName=" + pName + ",price=" + price + "]";
    }
}
