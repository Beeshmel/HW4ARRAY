import java.util.Arrays;

public class SumArrayColumn {
    public static void main(String[] args) {
        int line = 2;
        int column = 4;
        int mas[][] = new int[line][column];
        int sumMas[] = new int[column];

        for(var j = 0;j < column;j++){  //столбцы
            for(var i = 0;i < line;i++){  //строки
                mas[i][j] = (int) (Math.random()*100);
                sumMas[j]+=mas[i][j];
            }
        }
        for (int[] row : mas) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Сумма по столбцам");
        System.out.println(Arrays.toString(sumMas));
    }
}
