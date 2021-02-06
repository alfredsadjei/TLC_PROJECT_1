import java.util.ArrayList;

public class Bag<T> {
    private ArrayList<T> bagContent;

    public Bag(int size){
        bagContent = new ArrayList<>(size);
    }

    public void add(T content){
        bagContent.add(content);
    }

    public void remove(T content){
        bagContent.remove(content);
    }

    public void clear(){
        bagContent.clear();
    }
}
