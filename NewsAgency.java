import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers;
    private List<String> newsHistory;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
        this.newsHistory = new ArrayList<>();
    }

    public void registerSubscriber(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("[System]: " + subscriber.getSubscriberName() + " has successfully subscribed.");
        }
    }

    public void removeSubscriber(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("[System]: " + subscriber.getSubscriberName() + " has unsubscribed.");
        }
    }

    public void publishBreakingNews(String newsHeadline) {
        System.out.println("\n[BREAKING NEWS PUBLISHED]: " + newsHeadline);
        newsHistory.add(newsHeadline);
        notifySubscribers(newsHeadline);
    }

    private void notifySubscribers(String newsHeadline) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(newsHeadline);
        }
    }
}
