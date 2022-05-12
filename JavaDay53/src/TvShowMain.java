import java.util.Scanner;     // imported the Scanner class
import java.util.ArrayList;   // imported the arrayList

    public class TvShowMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<TvShow> tvList = new ArrayList<>();

        while (true) {
        System.out.println("Name of the show:");
        String name = scanner.nextLine();

        if (name.isEmpty()) break;
        System.out.println("How many episodes?");

        int episodes = Integer.valueOf(scanner.nextLine());
        System.out.println("What is the genre?");

        String genre = scanner.nextLine();
        tvList.add(new TvShow(name, episodes, genre));
        }

        for (int i = 0 ; i < tvList.size(); i++){
        System.out.println(tvList.get(i)); 
        }
    }
}