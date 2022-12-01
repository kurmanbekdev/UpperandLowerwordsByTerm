import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//here every word will be different like ElBeK;
        System.out.println("Please enter a word you want : ");
        String name = in.nextLine();
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                System.out.print(String.valueOf(chars[i]).toLowerCase());
            } else {
                System.out.print(String.valueOf(chars[i]).toUpperCase());
            }
        }
    }
}