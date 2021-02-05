import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Nameable> studentRegister;

    public Register(List<Nameable> studentRegister) {
        this.studentRegister = studentRegister;
    }

    public void setStudentRegister(List<Nameable> studentRegister) {
        this.studentRegister = studentRegister;
    }

    public List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();

        for (Nameable student : studentRegister){
            studentNames.add(student.getName());
        }

        return studentNames;
    }
}
