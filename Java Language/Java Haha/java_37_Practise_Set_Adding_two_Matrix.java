import java.util.Scanner;
public class java_37_Practise_Set_Adding_two_Matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            int[][] matrix1 = new int[3][3];
            int[][] matrix2 = new int[3][3];
            int[][] result = new int[3][3];

            for( int i=0; i<matrix1.length; i++ ) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    System.out.printf("Enter %d%d element : ", i + 1, j + 1);
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("\n ---- Matrix 1 ----");
            for( int i=0; i<matrix1.length; i++ ) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    System.out.printf("%d\t",matrix1[i][j]);
                }
                System.out.println();
            }

            System.out.println();
            for( int i=0; i<matrix2.length; i++ ) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    System.out.printf("Enter %d%d element : ", i + 1, j + 1);
                    matrix2[i][j] = sc.nextInt();
                }
            }

            System.out.println("\n ---- Matrix 2 ----");
            for( int i=0; i<matrix2.length; i++ ) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    System.out.printf("%d\t",matrix2[i][j]);
                }
                System.out.println();
            }

            System.out.println("\n ---- Addition of Two Matrix 3 x 3 ----");
            for( int i=0; i<matrix1.length; i++ ) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(result[i][j] + "\t");
                }
                System.out.println();
            }

        sc.close();

    }
}
