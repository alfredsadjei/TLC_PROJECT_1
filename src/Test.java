import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        List<Student> tlc3 = new ArrayList<>();

        tlc3.add(new Student("Bob"));
        tlc3.add(new Student("Bob1"));
        tlc3.add(new Student("Bob2"));
        tlc3.add(new Student("Bob3"));

        tlc3.add(new NaughtyStudent("Jen"));
        tlc3.add(new NaughtyStudent("Jen2"));
        tlc3.add(new NaughtyStudent("Jen3"));


        Lecture TLC = new Lecture(tlc3);

        System.out.println("\n");
        System.out.println(TLC.toString());
    }
}

