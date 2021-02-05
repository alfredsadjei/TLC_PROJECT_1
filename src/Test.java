import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        List<Nameable> tlc3 = new ArrayList<>();



        tlc3.add(new Student("Bob",Level.PRIMARY));
        tlc3.add(new Student("Bob1",Level.SECONDARY));
        tlc3.add(new Student("Bob2",Level.SECONDARY));
        tlc3.add(new Student("Bob3"));

        tlc3.add(new NaughtyStudent("Jen",Level.TERTIARY));
        tlc3.add(new NaughtyStudent("Jen2",Level.TERTIARY));
        tlc3.add(new NaughtyStudent("Jen3",Level.SECONDARY));


        //Lecture TLC = new Lecture(tlc3);
        Register newReg = new Register(tlc3);

        newReg.printReport();
    }
}

