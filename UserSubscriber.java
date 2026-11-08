public class UserSubscriber implements Subscriber {
    private String username;

    public UserSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String breakingNews) {
        System.out.println("-> Notification for " + username + ": Received update -> \"" + breakingNews + "\"");
    }

    @Override
    public String getSubscriberName() {
        return username;
    }
}
