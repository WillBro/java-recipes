package am.willi.xml.jackson.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(
        localName = "company-info",
        namespace = "am.willi.xml.jackson"
)
public class Company {

    @JacksonXmlProperty(
            localName = "id",
            isAttribute = true
    )
    private Integer id;

    @JacksonXmlProperty(localName = "company-name")
    private String companyName;

    @JacksonXmlProperty(localName = "ceo-name")
    private String ceoName;

    @JacksonXmlProperty(localName = "no-emp")
    private Integer noEmp;
}