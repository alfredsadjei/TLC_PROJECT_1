import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class LectureTest {
    @Test
    public void testGetHighestAverageGrade(){

    }
    @Test
    public void testNaughtyStudentInLecture(){
        List<Student> studentList = new ArrayList<>();
        List<Double> gradeList = new ArrayList<>();
        gradeList.add(85.0);
        gradeList.add(70.0);
        gradeList.add(65.0);

        studentList.add(new Student("Bob", gradeList));
        studentList.add(new Student("Bobbie", gradeList));

        studentList.add(new NaughtyStudent("Jen", gradeList));
        studentList.add(new NaughtyStudent("Joe", gradeList));

        Lecture TLC = new Lecture(studentList);
//        double highestAverageGrade = TLC.getHighestAverageGrade();
//        two options -> compare expected w what we get vs.
//        take naughty student & student avg grade, assert that highest avg grade equals naughty student & not regular student
    }

}
