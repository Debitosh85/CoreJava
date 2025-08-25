package Practice;

import java.util.Scanner;

public class EmergencyService {

    public static void main(String[] args) {

        System.out.println("1.Police Service");
        System.out.println("2.Fire Service");
        System.out.println("3.Disaster Service");
        System.out.println("Relief Service");
        System.out.println("Ambulance Service");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Code to Avail the ::");
        int choice = sc.nextInt();

        switch (choice) {
            case 100:
                System.out.println("policeService");
                break;
            case 101:
                System.out.println("Fire Service");
                break;
            case 102:
                System.out.println("Disaster Service");
                break;
            case 104:
                System.out.println("Relief Service");
                break;
            case 108:
                System.out.println("Ambulance Service");
                break;
            default:
                System.out.println("Service is not available");
        }
        sc.close();
    }
}
