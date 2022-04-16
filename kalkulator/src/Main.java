import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        while(true) {
            Scanner s = new Scanner(System.in);


            GUI menu = new GUI();
            System.out.print("Podaj pierwszą liczbę: ");
            int a = s.nextInt();

            System.out.print("Podaj drugą liczbę: ");
            int b = s.nextInt();

            Calculator calc = new Calculator(a, b);

            System.out.print("Wybierz działanie: ");
            int wybor = s.nextInt();
            int wynik;

            switch (wybor) {
                case 1:
                    System.out.println("Wybrałeś dodawanie");
                    wynik = calc.dodaj();
                    System.out.println("Wynik to " + wynik);
                    break;
                case 2:
                    System.out.println("Wybrałeś odejmowanie");
                    wynik = calc.odejmij();
                    System.out.println("Wynik to " + wynik);
                    break;
                case 3:
                    System.out.println("Wybrałeś Mnożenie");
                    wynik = calc.pomnoz();
                    System.out.println("Wynik to " + wynik);
                    break;
                case 4:
                    System.out.println("Wybrałeś Dzielenie");
                    wynik = calc.podziel();
                    System.out.println("Wynik to " + wynik);
                    break;
                default:
                    System.out.println("Błąd, zrestartuj program");
                    wynik=0;
                    break;
            }
            System.out.println();

        }
    }
}
