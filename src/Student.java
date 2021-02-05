import java.util.List;

public class Student implements Nameable, HasLevel{
    private String name;
    private Level studentLevel;
    private List<Double> grades;
    protected double averageGrade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Level studentLevel) {
        this.name = name;
        this.studentLevel = studentLevel;
    }

    public Student(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
        this.averageGrade = getAverageGrade(this.grades);
    }

    public Student(String name, Level studentLevel, List<Double> grades, double averageGrade) {
        this.name = name;
        this.studentLevel = studentLevel;
        this.grades = grades;
        this.averageGrade = averageGrade;
    }

    public Student(List<Double> grades) {
        this.grades = grades;

        this.averageGrade = getAverageGrade(this.grades);
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade(List<Double> grades){
        double averageGrade;
        double sum =  0.0 ;

        for (Double grade : grades) {
            sum += grade;
        }

        averageGrade = sum/grades.size();

        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentLevel=" + studentLevel +
                ", grades=" + grades +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return studentLevel;
    }
}
