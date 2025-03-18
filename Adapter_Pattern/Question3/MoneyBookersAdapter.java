package Design_Pattern.Adapter_Pattern.Question3;

public class MoneyBookersAdapter extends PaymentMethod {
    private final MoneyBookers moneyBooker;

    public MoneyBookersAdapter(MoneyBookers moneyBooker) {
        this.moneyBooker = moneyBooker;
    }

    @Override
    public void paymentMethod(int amount) {
        moneyBooker.payMoneyBooker(amount);
    }
}
