import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка A: ");
            String input = scanner.nextLine();
            listA.add(input);
        }
        System.out.println("Список A:");
        for (String item : listA) {
            System.out.println(item);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка B: ");
            String input = scanner.nextLine();
            listB.add(input);
        }
        System.out.println("Список B:");
        for (String item : listB) {
            System.out.println(item);
        }
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Список C:");
        for (String item : listC) {
            System.out.println(item);
        }
        Collections.sort(listC, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Список C (отсортированный по длине слова):");
        for (String item : listC) {
            System.out.println(item);
        }
    }
}
