import org.w3c.dom.ls.LSOutput;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {
    static void pow() {
        Scanner input = new Scanner(System.in);
        int baseNum, powerNum, result = 1;
            System.out.print("Enter base number value: ");
            baseNum = input.nextInt();
            System.out.print("Enter power number value: ");
            powerNum = input.nextInt();

            for (int i = 1; i <= powerNum; i++) {
                result *= baseNum;
            }
            System.out.println("Result: " + result);
    }

        public static void main(String[] args) {
        System.out.println("Welcome to power calculator...");
        pow();
        }
}
