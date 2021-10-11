import com.spart.io.Model.Employee;
import com.spart.io.Model.Regex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegexTest {
        @Test
        public void prefix() {
            String[] data = {"1", "Mr3535.", "Halil", "C", "Kale", "M", "Halilcankale98@gmail.com", "7/17/1998", "6/19/2021", "50000"};
            Employee empTest = new Employee();
            Assertions.assertFalse(Regex.RegexCall(data, empTest));
        }
            @Test
            public void firstName(){
                String[]data={"1","Mr.","Hal3553il","C","Kale","M","Halilcankale98@gmail.com","7/7/1998","6/9/2021","50000"};
                Employee empTest= new Employee();
                Assertions.assertFalse(Regex.RegexCall(data,empTest));
            }
            @Test
            public void midInitial(){
                String[]data={"1","Mr.","Halil","CFG","Kale","M","Halilcankale98@gmail.com","7/7/1998","6/9/2021","50000"};
                Employee empTest= new Employee();
                Assertions.assertFalse(Regex.RegexCall(data,empTest));
            }
            @Test
            public void lastName(){
                String[]data={"1","Mr.","Halil","C","Kal56e","M","Halilcankale98@gmail.com","7/7/1998","6/9/2021","50000"};
                Employee empTest= new Employee();
                Assertions.assertFalse(Regex.RegexCall(data,empTest));
            }
            @Test
            public void Gender() {
                String[] data = {"1", "MR.", "Halil", "C", "Kale", "35", "Halilcankale98@gmail.com", "7/7/1998", "6/9/2021", "50000"};
                Employee empTest = new Employee();
                Assertions.assertFalse(Regex.RegexCall(data, empTest));
            }
            @Test
            public void Email(){
                String[]data={"1","Mr.","Halil","C","Kale","M","546","7/7/1998","6/9/2021","50000"};
                Employee empTest= new Employee();
                Assertions.assertFalse(Regex.RegexCall(data,empTest));
            }
}

