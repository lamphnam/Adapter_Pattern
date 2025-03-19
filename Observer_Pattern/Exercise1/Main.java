package Design_Pattern.Observer_Pattern.Exercise1;

public class Main {
    public static void main(String[] args) {
        StockVCB stockVCB = new StockVCB();

        Person person1 = new Person(300);
        Person person2 = new Person(450);

        stockVCB.addPerson(person1);
        stockVCB.addPerson(person2);

        // Expect print 2 person
        stockVCB.notifyToPersons(550);
        stockVCB.notifyToPersons(250);

        stockVCB.removePerson(person1);

        // Expect print nothing
        stockVCB.notifyToPersons(350);

    }
}
