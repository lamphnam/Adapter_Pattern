package Design_Pattern.Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        // Create Observer1
        Observer observer1 = message -> System.out.println("Message 1 changed: " + message);
        // Observer 1 attach in subject
        subject.attach(observer1);
        // Create Observer2
        Observer observer2 = message -> System.out.println("Message 2 changed: " + message);
        // Observer2 attach in subject
        subject.attach(observer2);
        // Subject changed and notify to all Observers was attached
        subject.notifyObservers("Test change state 1");
        // Observer1 detach to Subject
        subject.detach(observer1);
        // Subject changed and notify to all Observers was attached
        subject.notifyObservers("Test change state 2");
    }
}
