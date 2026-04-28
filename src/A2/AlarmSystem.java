package A2;

public class AlarmSystem implements Notifiable {
    private boolean emergencyMode = false;

    @Override
    public String getNotification() {
        return "Alarm! Please check your home!";
    }
    public String alert() {
        return emergencyMode ? this.getNotification() : Notifiable.super.getNotification();
    }

}
