package practice;

public class NotificationMobile implements Notification {

    public String sms() {

        return "Sms from Mobile";
    }

    public static NotificationMobile mobile() {
        return new NotificationMobile();
    }

}
