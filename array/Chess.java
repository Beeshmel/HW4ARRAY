package my.test.array;

public class Chess {
    public static void main(String[] args) {
        char c[] = {'a','b','c','d','e','f','g','h'};
        for (var i = 8; i > 0; i--) {
            for(var item : c) {
               System.out.print(Character.toString(item) + i + "\t");
            }
            System.out.println();
        }
        for (char d = 'a'; d <= 'h'; d++) {
            System.out.println(d);
        }

//        2ой вариант
        for (var i = 8; i > 0; i--) {
            for (char z = 'a'; z <= 'h'; z++) {
                System.out.print(Character.toString(z) + i + "\t");
            }
            System.out.println();
        }
    }
}
