/*Создать метод, который создает и возвращает массив случайных целых чисел. Найти
        среднее арифметическое полученного массива. Можно среднее арифметическое в теле
        метода main.*/

import java.util.Scanner;

public class Method {

    static int[] array(int count) {
        int mas[] = new int[count];//количество ячеек
        for (var i = 0; i < count; i++) {
            mas[i] = (int) (Math.random() * 100 + 0);
            System.out.printf(mas[i] + "; ");
        }
        return mas;
    }
             public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Введите длину массива случайных чисел");
                 int length = sc.nextInt();
                 sc.close();
                 System.out.println("Массив случайных чисел:");
                 int[] mas = array(length);
                 float sum = 0;
                 for (var i=0;i<length;i++){
                     sum += (float) mas[i];
                 }
                 System.out.println();
                 System.out.println("Среднее арифметическое массива чисел равно " + sum/length);
        }
}
