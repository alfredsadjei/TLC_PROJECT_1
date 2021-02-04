import java.util.List;

public class NaughtyStudent extends Student {


    public NaughtyStudent(String name, List<Double> grades) {
        super(name, grades);
    }

    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    @Override
    public double getAverageGrade(List<Double> grades) {
        double averageGrade;
        double sum =  0.0 ;

        for (Double grade : grades) {
            sum += grade;
        }

        averageGrade = sum/grades.size();

        return averageGrade + (0.1 * averageGrade);
    }
}
