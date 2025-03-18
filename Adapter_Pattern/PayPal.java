package Design_Pattern.Adapter_Pattern;

public class PayPal {

    public void sendAmount(int amount) {
        System.out.println("Paying via PayPal: " + amount);
    }
}
