import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
    private ArrayList<Student> students;

    @Override
    public String toString() {
        return "BagOfStudents{" +
                "students=" + students +
                '}';
    }

    public BagOfStudents(int size){
        students = new ArrayList<>(size);
    }

    public BagOfStudents(List<Student> studentList){
        for (Student student : studentList){
            students.add(student);
        }
    }

    public void add(Student student){
        students.add(student);
        System.out.println(students);
    }

    public void remove(Student student){
        students.remove(student);
    }

    public void clear(){
        students.clear();
    }
}
