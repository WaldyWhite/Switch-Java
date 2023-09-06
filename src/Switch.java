import java.util.Scanner;

public class Switch {

    public static void switcher (int num){
        String day = switch (num) {
            case 1 -> "Mo";
            case 2 -> "Di";
            case 3 -> "Mi";
            case 4 -> "Do";
            case 5 -> "Fr";
            case 6 -> "Sa";
            case 7 -> "So";
            default -> "ERROR";
        };

        System.out.println(day);
    }
}
