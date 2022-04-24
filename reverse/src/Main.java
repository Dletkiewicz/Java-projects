import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Wpisz wyraz: ");
        String word = scan.nextLine();

        Reverse a = new Reverse(word);

        a.reverse();
    }

}
