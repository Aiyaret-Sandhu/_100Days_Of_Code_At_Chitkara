public class Bot extends Player {
    @Override
    public void play() {
        System.out.println("play");
    }

    public void addMove(String move) {
        System.out.println("add move " + move);
    }
}
