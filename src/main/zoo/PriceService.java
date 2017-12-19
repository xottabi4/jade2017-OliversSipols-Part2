package zoo;

import java.util.HashMap;
import java.util.Map;

public class PriceService {

    private static final Map<String, Double> zoneBasePrices = createMap();

    private static Map<String, Double> createMap() {
        Map<String, Double> basePrices = new HashMap<>();
        basePrices.put("general", 10.0);
        basePrices.put("reptile house", 7.0);
        basePrices.put("butterfly (insect) house", 8.0);
        basePrices.put("petting zoo tickets", 15.0);
        return basePrices;
    }

    public double determineTicketPrice(final String zone) {
        if (!zoneBasePrices.containsKey(zone)) {
            throw new RuntimeException("Such zone is not defined: " + zone);
        }
        return zoneBasePrices.get(zone);
    }
}
