import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegisterTest {
    @Test
    public void testGetRegister(){
        List<Student> tlc3 = new ArrayList<>();
        List<String> expected = Arrays.asList("Bob", "Bob1", "Bob2", "Bob3");

        tlc3.add(new Student("Bob"));
        tlc3.add(new Student("Bob1"));
        tlc3.add(new Student("Bob2"));
        tlc3.add(new Student("Bob3"));

        Register register = new Register(tlc3);
        List<String> nameList = register.getRegister();

        //Assert.assertArrayEquals(expected, nameList);
        Assert.assertEquals(expected, nameList);
    }

    @Test
    public void testGetStudentByName(){

    }
}
