package am.willi.xml.jackson.controller;

import am.willi.xml.jackson.model.Company;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class CompanyController {
    @RequestMapping(value = "/fetch/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public Company getForObjectXMLDemo(@PathVariable(value = "id") Integer id) {
        Company comp = new Company();

        comp.setId(id);
        comp.setCompanyName("XYZ");
        comp.setCeoName("ABCD");
        comp.setNoEmp(100);

        return comp;
    }
} 