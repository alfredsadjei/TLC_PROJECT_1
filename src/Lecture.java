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


    public double getHighestAverageGrade(){
        List<Double> averageGradeList = new ArrayList<>();

        for(Student student : studentList){
            averageGradeList.add(student.getAverageGrade());
        }

        //sort list and return last index
        Collections.sort(averageGradeList);

        return averageGradeList.get(averageGradeList.size()-1);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "studentList=" + studentList +
                '}';
    }
}
