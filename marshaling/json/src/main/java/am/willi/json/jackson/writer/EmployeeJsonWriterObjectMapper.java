package am.willi.json.jackson.writer;

import am.willi.json.jackson.model.Employee;
import am.willi.json.jackson.reader.EmployeeObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

@Slf4j
public class EmployeeJsonWriterObjectMapper {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void writeEmployeeToJson(Employee emp) {
        try {
            String jsonInString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
            log.info("Employee JSON is\n" + jsonInString);

            objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            objectMapper.writeValue(new File(emp.getId() + "_employee.json"), emp);

        } catch (JsonGenerationException e) {
            log.error("Unable to Generate JSON", e);
        } catch (JsonMappingException e) {
            log.error("Unable to map JSON", e);
        } catch (IOException e) {
            log.error("Unable to open file", e);
        }
    }
}