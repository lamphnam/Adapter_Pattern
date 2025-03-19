package Design_Pattern.Observer_Pattern;

import java.util.*;

public class Subject {
    private final List<Observer> observerList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
