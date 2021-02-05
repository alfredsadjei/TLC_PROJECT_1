import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        List<Student> tlc3 = new ArrayList<>();



//        Student bob = new Student("Bob", Level.PRIMARY);
//        Student bob1 = bob;
//        BagOfStudents newBag = new BagOfStudents(5);
//
//        newBag.add(bob);
//        newBag.add(bob1);
//        newBag.remove(bob1);
//        System.out.println(newBag);



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

