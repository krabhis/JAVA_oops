import java.util.ArrayList;
import java.util.List;

public class foreach {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Hockey");
        gamesList.add("Rugby");
        gamesList.add("Basketball");
        gamesList.add("Volleyball");

        System.out.println("Iterating by passing lambda:");
        gamesList.forEach(game -> System.out.println(game));
    }
}
