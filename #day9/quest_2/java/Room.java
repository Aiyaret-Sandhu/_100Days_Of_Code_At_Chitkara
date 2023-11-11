import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }
    public boolean isEmpty() {
        return this.persons.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest(){
        if (persons.isEmpty()) {
            return null;
        }
        int minheight = this.persons.get(0).getHeight();
        Person min = this.persons.get(0);

        for (Person nami : this.persons) {
            if (nami.getHeight() < minheight) {
                minheight = nami.getHeight();
                min = nami;
            }
        }
        return min;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        } else {
            Person shortes = shortest();
            this.persons.remove(shortest());
            return shortes;
        }
    }
}
    

