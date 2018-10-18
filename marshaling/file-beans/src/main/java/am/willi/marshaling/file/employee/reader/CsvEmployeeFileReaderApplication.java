package am.willi.marshaling.file.employee.reader;

import am.willi.marshaling.file.employee.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@Slf4j
public class CsvEmployeeFileReaderApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CsvEmployeeFileReaderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        StreamFactory factory = StreamFactory.newInstance();
        factory.load(new ClassPathResource("csv/employee_mapping.xml").getFile());

        BeanReader in = factory.createReader(
                "employeeFile", new ClassPathResource("csv/employees.csv").getFile()
        );
        Employee employee;

        while ((employee = (Employee) in.read()) != null) {
            log.debug(employee.toString());
        }
        in.close();
    }
}
