package am.willi.json.jackson.reader;

import am.willi.json.jackson.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Objects;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

@Slf4j
public class EmployeeObjectMapperTest {

    private Employee mappedEmployee;

    @Before
    public void mapJsonToEmployee() throws IOException {
        EmployeeObjectMapper obj = new EmployeeObjectMapper();
        mappedEmployee = obj.readJsonWithObjectMapper();

        Assume.assumeTrue("Employee Mapped",
                Objects.nonNull(mappedEmployee)
        );
    }

    @Test
    public void testReadJsonWithObjectMapper() throws Exception {
        assertThat(mappedEmployee, not(nullValue()));
        assertThat(mappedEmployee.getName(), is("Henry Smith"));
    }

    @Test
    public void mappedObjectSameAsJson() {
        assertThat(mappedEmployee, hasProperty("designation",
                is("Programmer")
        ));
    }

    @Test
    public void toStringReturnsString() {
        assertThat(mappedEmployee.toString(), notNullValue());
    }

    private Employee createEmployeeSameAsJsonResource() {
        return new Employee();
    }
}