import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę : ");
        int x = scanner.nextInt();

        while(x<100||x>200||x%3!=0){
            if(x>200) {
                System.out.println("Twoja liczba jest za duża, podaj następną");
                x = scanner.nextInt();

            } else if (x<100) {
                System.out.println("Twoja liczba jest za mała, podaj następną");
                x = scanner.nextInt();

            } else {
                System.out.println("Twoja liczba nie jest podzielna przez 3, podaj następną");
                x = scanner.nextInt();

            }
        }
        System.out.println("Twoja liczba jest ok, gratulacje! ");

/*        while (x%3!=0){
            if(x>200) {
                System.out.println("Twoja liczba jest za duża");
                x = scanner.nextInt();
            }
            else if (x<100) {
                System.out.printf("Twoja liczba jest za mała");
                x = scanner.nextInt();
            } else
            System.out.println("Twoja liczba jest ok");
        }*/
    }
}
