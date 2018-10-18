package am.willi.xml.castor.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CountryList {
    List<Country> members;

    public CountryList() {
        members = new ArrayList<>();
    }

    public List<Country> getCountries() {
        return members;
    }

    public void addCountry(Country country) {
        members.add(country);
    }
}
