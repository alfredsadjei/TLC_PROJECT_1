import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    public List<String> getRegisterByLevel(Level level){
        List<String> studentsAtLevel = new ArrayList<>();


        for(Nameable student : studentRegister){
            if(student.getLevel() == level){
                studentsAtLevel.add(student.getName());
            }
        }


        return studentsAtLevel;
    }

    public void printReport(){
        List<Level> levelList = new ArrayList<>();

        for(Level studentLevel : Level.values()){
            levelList.add(studentLevel);
        }

        for (Level level: levelList){
            List<String> studentsAtLevel = new ArrayList<>();

            studentsAtLevel = getRegisterByLevel(level);

            System.out.println("Level: "+level);
            System.out.println("\n");
            System.out.println(studentsAtLevel+"\n");

        }

    }
}


