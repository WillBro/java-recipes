package am.willi.json.jackson.reader;

import am.willi.json.jackson.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class EmployeeObjectMapper {

    public Employee readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(new ClassPathResource("employee.json").getFile(), Employee.class);
    }
}