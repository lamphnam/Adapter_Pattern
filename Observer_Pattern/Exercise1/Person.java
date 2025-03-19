package Design_Pattern.Observer_Pattern.Exercise1;

public class Person {
    private final double threshold;

    public Person(double threshold) {
        this.threshold = threshold;
    }

    public double getThreshold() {
        return threshold;
    }

    public void update(String message) {
        System.out.println("Person with threshold " + threshold + " gets notification: " + message);
    }
}

