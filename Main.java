/**
 * Created by Сергей on 27.03.14.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String s;
        s = sc.nextLine();
        Automat obj = new Automat();
        obj.recognition(s);
    }
}
