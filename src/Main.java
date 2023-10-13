import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость билета:");
        int StoimostBileta = in.nextInt();
        int MilyaZaRubli = 20;
        int Mili = (int)(StoimostBileta / MilyaZaRubli);
        System.out.println("Начисленные мили: " + Mili + " миль" );
        in.close();
    }
}