import java.util.List;

public class Student implements Nameable {
    private String name;
    protected List<Double> grades;
    protected double averageGrade;

    public Student(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
        this.averageGrade = getAverageGrade(this.grades);
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
                "grades=" + grades +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }
}
