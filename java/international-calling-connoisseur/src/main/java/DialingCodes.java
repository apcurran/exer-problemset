import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.codes;
    }

    public void setDialingCode(Integer code, String country) {
        this.codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        // check if code or country args exist as keys or values in map already
        if (this.codes.containsKey(code) || this.codes.containsValue(country)) {
            return;
        }

        // otherwise, add them to the map!
        this.codes.put(code, country);
    }

    public Integer findDialingCode(String country) {
        // takes a country and returns the country's dialing code
        for (Map.Entry<Integer, String> entry: this.codes.entrySet()) {
            if (country.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        // if the country is NOT in the map
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        throw new UnsupportedOperationException(
                "Delete this statement and write your own implementation.");
    }
}
