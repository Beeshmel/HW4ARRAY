//Перевернуть массив, который содержит названия цветов радуги. То есть первый
  //      элемент должен стать последним второй – предпоследним.

import java.util.Arrays;
import java.util.Collections;

public class OppositeRainbow {
    public static void main(String[] args){
        String[] rainbow= {"красный","оранжевый","жёлтый","зелёный","голубой","синий","фиолетовый"};
        System.out.println(Arrays.toString(rainbow));
        Collections.reverse(Arrays.asList(rainbow));
        System.out.println(Arrays.toString(rainbow));
        }

//        2й вариант
/*    public static void main(String[] args) {
        String raduga[] = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};
        String temp;
        int size = raduga.length;
        System.out.println("Правильная радуга\n");
        for (int i = 0; i < size; i++) { //первый способ вывода
            System.out.println(raduga[i]);
        }
        for (int i = 0; i < size / 2; i++) {
            temp = raduga[i];
            raduga[i] = raduga[size - i - 1];
            raduga[size - i - 1] = temp;
        }
        System.out.println("\nПеревернутая радуга\n");
        System.out.println(Arrays.toString(raduga)); // второй способ вывода
    }*/

//    3й вариант
    /*public static void main(String[] args){
        String rainbow[] = {"красный","оранжевый","жёлтый","зелёный","голубой","синий","фиолетовый"};
        int max = rainbow.length-1;
        for (int i=0; i< rainbow.length;i++){
            System.out.println(rainbow[max-i]);
        }*/
}



