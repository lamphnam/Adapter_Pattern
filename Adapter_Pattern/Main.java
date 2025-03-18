package Design_Pattern.Adapter_Pattern;

import Design_Pattern.Adapter_Pattern.Question3.MoneyBookers;
import Design_Pattern.Adapter_Pattern.Question3.MoneyBookersAdapter;
import Design_Pattern.Adapter_Pattern.Question3.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        PayPal paypal = new PayPal();
        Pay payment = new PayPalAdapter(paypal);
        payment.useAmount(100);

        MoneyBookers moneyBooker = new MoneyBookers();
        PaymentMethod method = new MoneyBookersAdapter(moneyBooker);
        method.paymentMethod(291);
    }
}
