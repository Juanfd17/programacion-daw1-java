import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Objects> a = null;
        try {
            a.size();
        } catch (NullPointerException e
        ){
            System.out.println("Eso es null");
        }
    }
}