public class Main {
    public static void main(String[] args) {
        // Create the News Agency publisher
        NewsAgency reuters = new NewsAgency();

        // Create subscribers
        Subscriber alice = new UserSubscriber("Alice");
        Subscriber bob = new UserSubscriber("Bob");
        Subscriber charlie = new UserSubscriber("Charlie");

  
        reuters.registerSubscriber(alice);
        reuters.registerSubscriber(bob);


        reuters.publishBreakingNews("Global Markets Rally to Record Highs After Tech Breakthrough!");

   
        System.out.println("\n--- Dynamic Changes in Subscriptions ---");
        reuters.registerSubscriber(charlie);
        reuters.removeSubscriber(alice);   

        reuters.publishBreakingNews("Space Agency Successfully Lands First Rover on Exoplanet!");
    }
}
