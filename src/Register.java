
import java.util.*;


public class Register {
    private List<Student> studentRegister;

//    public Register(List<Nameable> studentRegister) {
//        this.studentRegister = studentRegister;
//    }

    public Register(List<Student> studentRegister) {
        this.studentRegister = studentRegister;
    }

    public void setStudentRegister(List<Student> studentRegister) {
        this.studentRegister = studentRegister;
    }

    public List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();

        for (Nameable student : studentRegister){
            studentNames.add(student.getName());
        }

        return studentNames;
    }

    public List<Student> sort(CompareStudents comparison){
        Collections.sort(studentRegister, comparison);
        return studentRegister;
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level){
        Map<Level, List<Student>> studentsAtLevel = new HashMap<>();
        ArrayList<Student> students = new ArrayList<>();


        for(Student student : studentRegister){

            if(student.getLevel() == level){
                students.add(student);
            }
        }

        studentsAtLevel.put(level, students);

        return studentsAtLevel;
    }

    public void printReport(){
        List<Level> levelList = new ArrayList<>();

        for(Level studentLevel : Level.values()){
            levelList.add(studentLevel);
        }

        for (Level level: levelList){
            Map<Level, List<Student>> studentsAtLevel = new HashMap<>();

            studentsAtLevel = getRegisterByLevel(level);

            System.out.println("Level: "+ level + studentsAtLevel.get(level));
//            System.out.println("\n");
//            System.out.println(studentsAtLevel+"\n");

        }

    }
}


