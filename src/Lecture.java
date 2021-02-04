import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    private List<Student> studentList;


    public Lecture(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void enter(Student student){
        studentList.add(student);
    }


    public double getHighestAverageGrade(List<Student> stuList){
        List<Double> averageGradeList = new ArrayList<>();

        for(Student student : stuList){
            averageGradeList.add(student.getAverageGrade());
        }

        //sort list and return last index
        Collections.sort(averageGradeList);

        return averageGradeList.get(averageGradeList.size()-1);
    }

}
