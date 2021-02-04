import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class NaughtyStudentTest {
    @Test
    public void testNaughtyStudent() {
        List<Double> testList = new ArrayList<>();
        testList.add(85.0);
        testList.add(70.0);
        testList.add(65.0);

        NaughtyStudent jared = new NaughtyStudent("Jared", testList);
        Student emma = new Student("Emma", testList);

        double avgJared = jared.getAverageGrade();
        double avgEmma = emma.getAverageGrade();

        double expected = avgEmma + 0.1 * avgEmma;

        System.out.println("Jared: " + avgJared);
        System.out.println("Emma: " + avgEmma);

        Assert.assertEquals(jared.getAverageGrade(), expected, 0.01);
    }


}
