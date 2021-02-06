import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {
    private ArrayList<Lecture> lectures;

    @Override
    public String toString() {
        return "BagOfLectures{" +
                "lectures=" + lectures +
                '}';
    }

    public BagOfLectures(int size) { lectures = new ArrayList<Lecture>(size); }

    public BagOfLectures(List<Lecture> lectureList){
        for (Lecture lecture : lectureList){
            lectures.add(lecture);
        }
    }
    public void add(Lecture lecture){
        lectures.add(lecture);
        System.out.println(lecture);
    }

    public void remove(Lecture lecture){
        lectures.remove(lecture);
    }

    public void clear(){
        lectures.clear();
    }

}
