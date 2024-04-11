import java.util.Scanner;

// Таблица умножения
public class TaskN2 {
    public static void main(String[] args) {
        // 1
        int  x = 1;
        System.out.println("==================");
        while (x <= 10) {
            System.out.println(x + " * " + x + " = " + (x * x));
            ++x;
        }
        System.out.println("==================");

        // 2
        int k = 0;
        for (int i = 1; i < 50; i += 2) {
            k += i;
        }
        System.out.println("1 + 3 + 5 + .. + 49 = " + k);
        System.out.println("==================");

        // 3
        for (int i = 100; i <= 200; ++i) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("==================");

        // 4
        System.out.println("Multiplication table check");
        Scanner in = new Scanner(System.in);
        int errorCount = 0;
        int a = 0;
        int b = 0;
        boolean retry = false;
        for (int i = 0; i < 5; ++i) {
            if (!retry) {
                a = (int) (Math.random() * 9 + 1);
                b =  (int) (Math.random() * 9 + 1);
            } else {
                retry = false;
            }
            System.out.println(a + " * " + b + " = ");
            String inputValue = in.nextLine();
            int result = 0;
            try {
                result = Integer.parseInt(inputValue);
            } catch(Exception e) {
                System.out.println("Error input " + inputValue + " can't parse int value, try again");
                --i;
                retry = true;
                continue;
            }
            if (a * b != result) {
                ++errorCount;
            }
        }
        System.out.println("Test passed if there are less than 3 errors. You have " + errorCount + " errors.");
        if (errorCount <= 2) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
        System.out.println("==================");

        // 5
        System.out.println("Prime numbers 2..100");
        for (int i = 2; i <= 100; ++ i) {
            boolean isNotPrime = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (!isNotPrime) {
                System.out.println(i);
            }
        }
    }
}
