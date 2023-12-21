
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        String newstr = "";
        for (int i = 0 ; i < array.length ; i++) {
            for(int j = 0 ; j < array[i].length ; j++) {
                newstr += array[i][j];
            }
            newstr += "\n";
        }
        return newstr;
    }

}
