//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.13 at 05:29:40 PM BST 
//


package am.willi.xml.xjc.generated.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the am.willi.xml.xjc.generated.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Formsavail_QNAME = new QName("", "formsavail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: am.willi.xml.xjc.generated.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormsAvailability }
     * 
     */
    public FormsAvailability createFormsAvailability() {
        return new FormsAvailability();
    }

    /**
     * Create an instance of {@link AvailabilityPlatform }
     * 
     */
    public AvailabilityPlatform createAvailabilityPlatform() {
        return new AvailabilityPlatform();
    }

    /**
     * Create an instance of {@link AvailabilityProduct }
     * 
     */
    public AvailabilityProduct createAvailabilityProduct() {
        return new AvailabilityProduct();
    }

    /**
     * Create an instance of {@link AvailabilityFormset }
     * 
     */
    public AvailabilityFormset createAvailabilityFormset() {
        return new AvailabilityFormset();
    }

    /**
     * Create an instance of {@link AvailabilityForm }
     * 
     */
    public AvailabilityForm createAvailabilityForm() {
        return new AvailabilityForm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormsAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "formsavail")
    public JAXBElement<FormsAvailability> createFormsavail(FormsAvailability value) {
        return new JAXBElement<FormsAvailability>(_Formsavail_QNAME, FormsAvailability.class, null, value);
    }

}
