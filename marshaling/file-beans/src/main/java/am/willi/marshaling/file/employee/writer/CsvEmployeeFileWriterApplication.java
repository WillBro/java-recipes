package am.willi.marshaling.file.employee.writer;

import am.willi.marshaling.file.employee.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@SpringBootApplication
@Slf4j
public class CsvEmployeeFileWriterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CsvEmployeeFileWriterApplication.class, args);
    }

    @Override
    public void run(String... args) {
        StreamFactory factory = StreamFactory.newInstance();

        try {
            factory.load(new ClassPathResource("csv/employee_mapping.xml").getFile());
        } catch (IOException ioe) {
            log.error("Unable to open employee mapping file.");
        }

        BeanWriter out = null;

        try {
            out = factory.createWriter("employeeFile", new ClassPathResource("csv/out/employees.csv").getFile());

            Employee employee = new Employee();
            employee.setTitle("Mr");
            employee.setFirstName("John");
            employee.setLastName("Smith");
            employee.setSalary(100000);
            employee.setHireDate(Date.from(Instant.now()));

            out.write(employee);

        } catch (IOException ioe) {
            log.error("Unable to open employee output file.");
        } finally {
            if (null != out) {
                out.close();
            }
        }
    }
}
