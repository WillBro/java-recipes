package am.willi.xml.castor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {
    private Integer id;
    private String countryName;
    private String pmName;
}
