package Multi;

import java.util.ArrayList;

// CabCustomer class
class CabCustomer {
    private int custId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;
    private String phone;

    // No-argument constructor
    public CabCustomer() {}

    // Parameterized constructor
    public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) {
        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }

    // Getters and Setters
    public int getCustId() { return custId; }
    public void setCustId(int custId) { this.custId = custId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getDropLocation() { return dropLocation; }
    public void setDropLocation(String dropLocation) { this.dropLocation = dropLocation; }

    public int getDistance() { return distance; }
    public void setDistance(int distance) { this.distance = distance; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}

// CabCustomerService class
class CabCustomerService {
    private ArrayList<CabCustomer> customerList = new ArrayList<>();

    public void addCabCustomer(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            customerList.add(customer);
        }
    }

    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer existingCustomer : customerList) {
            if (existingCustomer.getPhone().equals(customer.getPhone())) {
                return false; // Customer exists
            }
        }
        return true; // New customer
    }

    public double calculateBill(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            return 0; // No charge for first-time customers
        }
        int distance = customer.getDistance();
        return (distance <= 4) ? 80 : (80 + ((distance - 4) * 6));
    }

    public void printBill(CabCustomer customer) {
        double billAmount = calculateBill(customer);
        System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + billAmount);
    }
}

// CabCustomerServiceTester class
public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();
        
        CabCustomer customer1 = new CabCustomer(101, "JOHN", "A", "B", 6, "1234567890");
        System.out.println("Is JOHN a first-time customer? " + service.isFirstCustomer(customer1));
        service.addCabCustomer(customer1);
        service.printBill(customer1);
        
        CabCustomer customer2 = new CabCustomer(102, "SMITH", "C", "D", 6, "1234567890"); // Same phone as JOHN
        System.out.println("Is SMITH a first-time customer? " + service.isFirstCustomer(customer2));
        service.addCabCustomer(customer2);
        service.printBill(customer2);
        
        CabCustomer customer3 = new CabCustomer(103, "DAVID", "E", "F", 4, "0987654321"); // New customer
        System.out.println("Is DAVID a first-time customer? " + service.isFirstCustomer(customer3));
        service.addCabCustomer(customer3);
        service.printBill(customer3);
    }
}
