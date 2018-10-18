package am.willi.json.jackson.model;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String city;
    private int zipcode;
}
