package basic;


import java.util.Scanner;

import static java.lang.System.*;

public class Reverse {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            char[] arr = text.toCharArray();

            StringBuilder rev = new StringBuilder();
            for (char x : arr) {
                final StringBuilder insert = rev.insert(0, x);
            }
            System.out.println(rev);
        }
    }

