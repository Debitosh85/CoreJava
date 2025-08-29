package practice;

public class NotifiacationMain {

    public static void main(String[] args) {

        Notification n = NotificationMobile.mobile();
        String sms = n.sms();
        System.out.println(sms);

        Notification n1 = NotificationComputer.computer();
        String sms1 = n1.sms();
        System.out.println(sms1);

    }

}
