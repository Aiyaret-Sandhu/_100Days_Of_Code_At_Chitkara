import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todo;

    public TodoList() {
        this.todo = new ArrayList<>();
    }

    public void add(String task) {
        this.todo.add(task);
    }

    public void print() {
        for(int i = 0 ; i < todo.size() ; i++) {
            System.out.println((i+1)+": "+todo.get(i));
        }
    }

    public void remove(int number) {
        if (this.todo.size() > 0) {
            if(number > 0 && number <= this.todo.size()) {
                this.todo.remove(number-1);
            }
        }
    }
}
