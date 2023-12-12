public class Person implements Saveable {

    private String name;
    private String address;

    public void save(){
        System.out.println("Save the game! ");
    }
    
    public void delete(){
        System.out.println("Delete the score! ");
    }
    
    public void load(String address) {
        System.out.println("Load the game");
    }

}
