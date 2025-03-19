package Design_Pattern.Adapter_Pattern_2;

public class Main {
    public static void main(String[] args) {
        LegacyStockService legacyStockService = new LegacyStockService();
        StockService stockService = new Adapter(legacyStockService);

        System.out.println("VCB Stock Price: " + stockService.getStockPrice("VCB"));
        System.out.println("FPT Stock Price: " + stockService.getStockPrice("FPT"));
        System.out.println("ACB Stock Price: " + stockService.getStockPrice("ACB"));
        System.out.println("MSN Stock Price: " + stockService.getStockPrice("MSN"));
    }
}