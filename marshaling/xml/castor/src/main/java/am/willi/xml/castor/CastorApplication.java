package am.willi.xml.castor;

import am.willi.xml.castor.config.CastorConfiguration;
import am.willi.xml.castor.converter.FileMarshaling;
import am.willi.xml.castor.model.Country;
import am.willi.xml.castor.model.CountryList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Spring OXM with Castor to marshall/unmarshall XML<->Objects
 *
 * @link {https://www.concretepage.com/spring/spring-oxm-marshaller-unmarshaller-annotation-example-with-castor}
 */
@Slf4j
public class CastorApplication {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CastorConfiguration.class);
        ctx.refresh();

        FileMarshaling fileMarshaling = ctx.getBean(FileMarshaling.class);

        //Perform Marshaling
        Country america = createCountryInstance(1, "America", "USA");
        Country britain = createCountryInstance(2, "Britain", "GBR");
        Country india = createCountryInstance(3, "India", "IN");
        Country jamaica = countryFromBuilder(4, "Jamaica", "JA");

        CountryList countryList = new CountryList();
        countryList.addCountry(america);
        countryList.addCountry(britain);
        countryList.addCountry(india);
        countryList.addCountry(jamaica);

        fileMarshaling.doMarshaling("country.xml", countryList);
        log.info("Marshaling performed");

        //Perform UnMarshaling
        CountryList countryListUnmarshaled = (CountryList) fileMarshaling.doUnMarshaling("country.xml");
        log.info("After unmarshaling size of country list is " + countryListUnmarshaled.getCountries().size());
    }

    private static Country createCountryInstance(
            int id, String name, String pmName
    ) {
        return new Country(id, name, pmName);
    }

    private static Country countryFromBuilder(int id, String name, String pmName) {
        return Country.builder().id(id).countryName(name).pmName(pmName).build();
    }
}
