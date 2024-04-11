//Вывести матрицу, изображенную ниже в консоль
public class Output {
    public static void main(String[] args){
        int line = 5;
        int column = 5;
        for (int i=0; i<line;i++){

            for (int j=0; j<column;j++){
                System.out.printf(i*j + "\t");
            }
            System.out.println();
        }
    }

}
