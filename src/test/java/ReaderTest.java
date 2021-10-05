import com.spart.io.Model.Employee;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import org.junit.jupiter.api.Assertions;

import static java.lang.System.in;

public class ReaderTest {
    @Test
    public void employeeData(){
        Employee tester= new Employee();
        tester.setlName("Halil");
        System.out.println(tester.getfName());

    }
}
