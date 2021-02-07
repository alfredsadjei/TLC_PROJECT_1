import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegisterTest {

    // need to figure out setup of "global" variables so
    // we don't have to instantiate within every test
    @Before
    public void setUp(){

    }

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
        List<Student> tlc3 = new ArrayList<>();

        tlc3.add(new Student("Bob"));
        Register register = new Register(tlc3);

        try {
            Student studentOne = register.getStudentByName("Bob");
            Assert.assertEquals("Bob", studentOne.getName());
        }
        catch (StudentNotFoundException exception){
            // figure out best practice for catching
            System.out.println("whoops!");
        }

    }

    // Test expects a StudentNotFoundException to be thrown when
    // the name of student is not in the register
    @Test(expected = StudentNotFoundException.class)
    public void testThrowsStudentNotFoundException()
    throws StudentNotFoundException
    {
        List<Student> tlc3 = new ArrayList<>();

        tlc3.add(new Student("Bob"));
        Register register = new Register(tlc3);

        Student studentOne = register.getStudentByName("Bob");

    }
}
