package practice;

public class Param {

    int id;
    String name;
    String address;
    String grade;

    public Param(int id ,String name,String address,String grade){
        this.id= id;
        this.name = name;
        this.address= address;
        this.grade= grade;
    }

    @Override
    public String toString() {
        return "Param [id=" + id + ", name=" + name + ", address=" + address + ", grade=" + grade + "]";
    }

    

}
