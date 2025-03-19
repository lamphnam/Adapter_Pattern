package Design_Pattern.Observer_Pattern.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class StockVCB {
    private final List<Person> personAttach = new ArrayList<>();

    public void addPerson(Person person) {
        personAttach.add(person);
    }

    public void removePerson(Person person) {
        personAttach.remove(person);
    }

    public void notifyToPersons(double price) {
        for (Person person : personAttach) {
            if (person.getThreshold() < price) {
                person.update("The price of Stock VCB is higher than " + person.getThreshold() + " and the price is: " + price);
            }
        }
    }

}
