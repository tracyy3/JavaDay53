import java.util.Scanner;     // imported the Scanner class
import java.util.ArrayList;   // imported the arrayList

public class BooksMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> BooksMain = new ArrayList<>();

        BooksMain.add(new Books("Atomic Habits", 111, 2018));
        BooksMain.add(new Books("The Subtle Art of Not giving a F*ck", 222, 2016));
        BooksMain.add(new Books("Everything is F*cked", 333, 2020));
        System.out.println("What information will be printed?");
        String reply = scanner.nextLine();

        for (int i=0; i<BooksMain.size();i++) {
            if(reply.equalsIgnoreCase("everything")) {
            System.out.println(BooksMain.get(i).toString());
            } 
            
            else if(reply.equalsIgnoreCase("name")) {
            System.out.println(BooksMain.get(i).getTitle());
            } 
            
            else {
            System.out.println("That is not an applicable reply");
            }
        }
    }
 }