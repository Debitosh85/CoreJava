package coreJavaOops;

public class Customer {

    String cname;
    String address;
    Double accountNo;
    Double phoneNo;
    static String bankName = "SBI";
    static String ifscCode = "SBI009AS";

    public Customer(String cname, String address, Double accountNo, Double phoneNo) {
        this.cname = cname;
        this.address = address;
        this.accountNo = accountNo;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer [cname=" + cname + ", address=" + address + ", accountNo=" + accountNo + ", phoneNo=" + phoneNo
                + ", bankName=" + bankName + ",ifscCode=" + ifscCode + "]";
    }

}
