
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.Comparator.comparing;


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

    public List<Student> sort(){
        //Refactoring the sort method to use streams

        //get list and create stream
        List <Student> sortedStudentList = this.studentRegister.stream()
                .sorted(comparing(Student::getName)) //call the sorted and comparing methods
                .collect(Collectors.toList()); //call the collect method to convert stream into list

        //return sorted list
        return sortedStudentList;
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

    public Double getHighestStudentGrade(){
        List<Double> highestGrades = new ArrayList<>();

        studentRegister.forEach(student -> highestGrades.add(student.getGrades().stream().max(Double::compareTo).get()));

        highestGrades.sort(Double::compareTo);

        return highestGrades.get(highestGrades.size()-1);
    }

    public double getOverallAverageGrade(){
        double overallSum = 0.0;
        double sampleSize = 0.0;


        for (Student student : studentRegister) {
            overallSum += student.getGrades().stream().reduce(0.0, (a,b)->a+b);
            sampleSize += student.getGrades().size(); // get number of grades and add to total number of grades
        }

        return overallSum/sampleSize;

    }

    public DoubleStream getGradesAboveThreshold(){
        
       DoubleStream gradeList = null;

        for (Student student : studentRegister) {
            if (student.getAverageGrade() > 0.6){
               gradeList =  student.getGrades().stream().mapToDouble(Double::doubleValue);

            }

        }

        return gradeList;
    }
}


