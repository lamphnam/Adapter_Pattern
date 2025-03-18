package Design_Pattern.Adapter_Pattern;

import Adapter_Pattern.Question3.MoneyBookers;
import Adapter_Pattern.Question3.PaymentMethod;
import Adapter_Pattern.Question3.MoneyBookersAdapter;

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
