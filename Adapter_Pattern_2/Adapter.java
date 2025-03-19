package Design_Pattern.Adapter_Pattern_2;

import java.util.HashMap;
import java.util.Map;

public class Adapter implements StockService {
    private final LegacyStockService legacyStockService;
    private final Map<String, Double> stockDataCache = new HashMap<>();

    public Adapter(LegacyStockService legacyStockService) {
        this.legacyStockService = legacyStockService;
        loadStockData();
    }

    private void loadStockData() {
        String data = legacyStockService.getStockData();
        String[] stocks = data.split(", ");

        for (String stock : stocks) {
            String[] parts = stock.split(":");
            if (parts.length == 2) {
                stockDataCache.put(parts[0], Double.parseDouble(parts[1]));
            }
        }
    }

    @Override
    public double getStockPrice(String stockName) {

        return stockDataCache.getOrDefault(stockName, -1.0);
    }

}
