package am.willi.xml.castor.config;

import am.willi.xml.castor.converter.FileMarshaling;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.castor.CastorMarshaller;

@Configuration
public class CastorConfiguration {

    @Bean
    public FileMarshaling getHandler(){
        FileMarshaling handler = new FileMarshaling();
        handler.setMarshaller(getCountryCastorMarshaller());
        handler.setUnmarshaller(getCountryCastorMarshaller());

        return handler;
    }

    @Bean
    CastorMarshaller getCountryCastorMarshaller() {
        CastorMarshaller castorMarshaller = new CastorMarshaller();
        Resource resource = new ClassPathResource("castor/country_mapping.xml");
        castorMarshaller.setMappingLocation(resource);

        return castorMarshaller;
    }
}
