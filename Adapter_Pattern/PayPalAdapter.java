package Adapter_Pattern;

public class PayPalAdapter extends Pay {
    private final PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void useAmount(int amount) {
        paypal.sendAmount(amount);
    }
}
