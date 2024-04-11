import java.util.Arrays;

public class SumArrayLine {
    public static void main(String[] args) {
        int line = 3;
        int column = 2;
        int mas[][] = new int[line][column];
        int sumMas[] = new int[line];

        for(var i = 0;i < mas.length;i++){
            for(var j = 0;j < mas[i].length;j++){
                mas[i][j] = (int) (Math.random()*100);
                System.out.print(mas[i][j] + "\t");
                sumMas[i] += mas[i][j];
            }
            System.out.println("\n");
        }
        System.out.println("Сумма по строкам" );
        System.out.println(Arrays.toString(sumMas));
    }
}
