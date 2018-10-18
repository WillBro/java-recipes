package am.willi.json.jackson.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class EmployeeObjectMapperToMap {

    public void readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<?, ?> empMap = objectMapper.readValue(new FileInputStream("employee.json"), Map.class);

        for (Map.Entry<?, ?> entry : empMap.entrySet()) {
            log.info("\n----------------------------\n" + entry.getKey() + "=" + entry.getValue() + "\n");
        }
    }
}