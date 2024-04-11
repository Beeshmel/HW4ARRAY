package my.test.array;

public class DvumerArray {
    public static void main(String[] args) {
        int mas[][] = {
                {1,2,3},
                {4,5,6,12},
                {7,8,9,1,2}
        };

        for(var i = 0;i < mas.length;i++){
            for(var j = 0;j < mas[i].length;j++){
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
