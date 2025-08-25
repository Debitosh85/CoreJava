package Practice;

public class NotificationComputer implements Notification {

    public String sms() {
        return "Sms from Computer";
    }

    public static NotificationComputer computer() {
        return new NotificationComputer();
    }

}
