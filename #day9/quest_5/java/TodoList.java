import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for (int count = 0 ; count < tasks.size() ; count++ ) {
            System.out.println((count+1) + ": " + tasks.get(count));
        }
    }

    public void remove(int number) {
        tasks.remove(number-1);
    }
}
