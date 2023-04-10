package org.example.BDG.Enumeration.hm_4;
import java.util.Scanner;
public class Main {
    enum DayOfWeek {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести день недели ");
        String in = scanner.nextLine();
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(in);
            switch (dayOfWeek) {
                case Monday:
                case Tuesday:
                case Wednesday:
                case Thursday:
                case Friday:
                    System.out.println(dayOfWeek + " это будний день");
                    break;
                case Saturday:
                case Sunday:
                    System.out.println(dayOfWeek + " это выходной день");
                    break;
            }
        }
}

